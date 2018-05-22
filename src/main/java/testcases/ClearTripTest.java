package testcases;

import org.apache.commons.exec.OS;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;


/**
 * Cleartrip test class
 *
 * @author Pratik Barjatiya
 * @date 22-MAY-2018
 */
public class ClearTripTest extends CommonGlobals {
    private static final String DR = "webdriver.chrome.driver";
    ClearTripPage clearTripPage;

    ClearTripTest() {
        setDriverPath();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        clearTripPage = PageFactory.initElements(driver, ClearTripPage.class);
    }


    private void setDriverPath() {
        if (OS.isFamilyWindows()) {
            System.setProperty(DR, "chromedriver.exe");
        }else
        if (OS.isFamilyMac()) {
            System.setProperty(DR, "chromedriver");
        }else {
            System.setProperty(DR, "chromedriver_linux");
        }
    }
}
