package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Sign In Test
 *
 * @author Pratik Barjatiya
 * @date 22-MAY-2018
 */
public class SignInTest extends ClearTripTest{

    @Test
    public void shouldThrowAnErrorIfSignInDetailsAreMissing() {

        driver.get("https://www.cleartrip.com/");

        clearTripPage.yourTrips.click();
        clearTripPage.signIn.click();

        WebElement locIframe = driver.findElement(By.id(clearTripPage.SignInModalStringId));
        driver.switchTo().frame(locIframe);

        WebElement webElement = waitFor(clearTripPage.signInButton,driver,2000);
        webElement.click();

        webElement = waitFor(clearTripPage.errors1,driver,2000);
        String errors1 = webElement.getText();

        Assert.assertTrue(errors1.contains("There were errors in your submission"));
        driver.quit();
    }
}
