package testcases;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Common Globals
 *
 * @author Pratik Barjatiya
 * @date 22-MAY-2018
 */
public class CommonGlobals {
    static WebDriver driver;

     /**
      * Define explicit wait for elements and wait until its get visible on the page instead of waiting for some random milliseconds
      *
      * @param webElement
      * @param webDriver
      * @param durationInMilliSeconds
      * @date 22-MAY-2018
      * @return WebElement
      **/
    protected WebElement waitFor(WebElement webElement, WebDriver webDriver,int durationInMilliSeconds) {
        try {
            WebDriverWait webDriverWait = new WebDriverWait(driver,durationInMilliSeconds);
            return webDriverWait.until(ExpectedConditions.visibilityOf(webElement));
        } catch (TimeoutException e) {
            e.printStackTrace();
            //To change body of catch statement use File | Settings | File Templates.
        }
        return null;
    }

    /**
     *
     * @param el
     * @return boolean
     */
    protected boolean isElementDisplayed(WebElement el) {
        try {
            return el.isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    /**
     *
     * @param el
     * @return boolean
     */
    protected boolean isElementPresent(WebElement el) {
        try {
            el.isDisplayed();
            return true;
            // If no error is thrown, element is present
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    protected boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }
}