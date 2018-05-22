package testcases;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Cleartrip page class
 *
 * @author Pratik Barjatiya
 * @date 22-MAY-2018
 */
public class ClearTripPage extends CommonGlobals {

    // For Flight Booking
    @FindBy(id = "OneWay")
    public WebElement oneWay;

    @FindBy(id = "FromTag")
    public WebElement fromTag;

    @FindAll({@FindBy(id = "ui-id-1"), @FindBy(tagName = "li")})
    public List<WebElement> originOptions;

    @FindBy(id = "ToTag")
    public WebElement toTag;

    @FindAll({@FindBy(id = "ui-id-2"), @FindBy(tagName = "li")})
    public List<WebElement> destinationOptions;

    @FindBy(id = "SearchBtn")
    public WebElement searchBtn;

    @FindBy(xpath = "//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[4]/td[7]/a")
    public WebElement travelDate;

    @FindBy(className = "searchSummary")
    public WebElement searchSummary;

    @FindBy(linkText = "Hotels")
    public WebElement hotelLink;

    @FindBy(id = "Tags")
    public WebElement localityTextBox;

    @FindAll({@FindBy(id = "ui-id-1"), @FindBy(css = "li > a")})
    public List<WebElement> localityOptions;

    public void setLocality(String locality) {
        localityTextBox.clear();
        localityTextBox.sendKeys(locality);

        waitFor(localityOptions.get(0),driver,2000);
        localityOptions.get(0).click();
    }

    @FindBy(xpath = "//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[4]/td[7]/a")
    public WebElement checkInDate;

    @FindBy(xpath = "//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[5]/td[1]/a")
    public WebElement checkOutDate;

    @FindBy(id = "SearchHotelsButton")
    public WebElement searchHotelsButton;

    @FindBy(id = "travellersOnhome")
    public WebElement travellerSelection;

    // Sign In Page
    @FindBy(linkText = "Your trips")
    public WebElement yourTrips;

    @FindBy(id = "SignIn")
    public WebElement signIn;

    @FindBy(id = "signInButton")
    public WebElement signInButton;

    @FindBy(id = "errors1")
    public WebElement errors1;

    String SignInModalStringId = "modal_window";
}