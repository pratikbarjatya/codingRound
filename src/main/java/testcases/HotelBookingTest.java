package testcases;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author Pratik Barjatiya
 * @date 22-MAY-2018
 */
public class HotelBookingTest extends ClearTripTest {


    @Test
    public void shouldBeAbleToSearchForHotels() {

        driver.get("https://www.cleartrip.com/");
        clearTripPage.hotelLink.click();

        clearTripPage.setLocality("Indiranagar, Bangalore");

        WebElement webElement = waitFor(clearTripPage.checkInDate,driver,1000);
        webElement.click();

        webElement = waitFor(clearTripPage.checkOutDate,driver,1000);
        webElement.click();

        new Select(clearTripPage.travellerSelection).selectByVisibleText("2 rooms, 4 adults");
        clearTripPage.searchHotelsButton.click();
        Assert.assertTrue(isElementPresent(clearTripPage.searchSummary));

        driver.quit();
    }
}
