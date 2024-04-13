package pages.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.CommonActionsWithElements;
import pages.PersonalPage;

public class HeaderElement extends CommonActionsWithElements {

    @FindBy(xpath = "//*[@class='auth-popup-btn login-link icon-custom']")
    private WebElement buttonSignIn;

    public HeaderElement(WebDriver webDriver) {
        super(webDriver);
    }

    public PersonalPage clickOnButtonSignIn(){
        clickOnElement(buttonSignIn);
        return new PersonalPage(webDriver);
    }
}
