package testcases;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


/**
 * Flight Booking Test
 *
 * @author Pratik Barjatiya
 * @date 21-MAY-2018
 */
public class FlightBookingTest extends ClearTripTest {

    @Test
    public void testThatResultsAppearForAOneWayJourney() {

        driver.get("https://www.cleartrip.com/");

        WebElement webElement = waitFor(clearTripPage.oneWay,driver,2000);
        webElement.click();

        clearTripPage.fromTag.clear();
        clearTripPage.fromTag.sendKeys("Bangalore");
        webElement = waitFor(clearTripPage.originOptions.get(0),driver,2000);
        webElement.click();

        webElement = waitFor(clearTripPage.toTag,driver,2000);
        webElement.clear();
        webElement.sendKeys("Delhi");

        //select the first item from the destination auto complete list
        webElement = waitFor(clearTripPage.destinationOptions.get(0),driver,2000);
        webElement.click();

        clearTripPage.travelDate.click();

        //all fields filled in. Now click on search
        clearTripPage.searchBtn.click();

        //verify that result appears for the provided journey search
        Assert.assertTrue(waitFor(clearTripPage.searchSummary,driver,2000).isDisplayed());

        //close the browser
        driver.quit();

    }
}
