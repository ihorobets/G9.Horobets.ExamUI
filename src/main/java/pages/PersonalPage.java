package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PersonalPage extends ParentPage {

    @FindBy(xpath = "//*[@class='btn white reg-link']")
    private WebElement buttonRegistration;

    @FindBy(xpath = "//input[@name='USER_NAME']")
    private WebElement inputRegistrationName;

    @FindBy(xpath = "//input[@name='USER_LAST_NAME']")
    private WebElement inputRegistrationLastName;

    @FindBy(xpath = "//input[@name='PERSONAL_PHONE']")
    private WebElement inputRegistrationPhoneNumber;

    @FindBy(xpath = "//input[@name='USER_EMAIL']")
    private WebElement inputRegistrationEmail;

    @FindBy(xpath = "//input[@name='USER_PASSWORD']")
    private WebElement inputRegistrationPassword;

    @FindBy(xpath = "//input[@name='USER_CONFIRM_PASSWORD']")
    private WebElement inputRegistrationConfirmPassword;

    @FindBy(xpath = "//button[@name='Register']")
    private WebElement buttonRegistrationIn;

    @FindBy(xpath = "//div[@class='message-errors']")
    private WebElement messageUserExist;

    public PersonalPage(WebDriver webDriver) {
        super(webDriver);
    }

    public PersonalPage checkIsRedirectToPersonalPage() {
        // TODO checkUrlWithPattern();
        // todo element
        // Assert.assertTrue("Avatar small is not displayed"
        // , isElementDisplayed(avatarSmall, "Avatar Small"));
        return this;
    }


    public PersonalPage clickOnButtonRegistration() {
        clickOnElement(buttonRegistration);
        return this;
    }

    public PersonalPage enterTextIntoInputRegistrationName(String text) {
        cleanAndEnterTextIntoElement(inputRegistrationName, "registrationName");
        return this;
    }

    public PersonalPage enterTextIntoInputRegistrationLastName(String text) {
        cleanAndEnterTextIntoElement(inputRegistrationLastName, "registrationLastName");
        return this;
    }

    public PersonalPage enterTextIntoInputRegistrationPhoneNumber(String text) {
        cleanAndEnterTextIntoElement(inputRegistrationPhoneNumber, "registrationPhoneNumber");
        return this;
    }

// todo

    public PersonalPage enterTextIntoInputRegistrationEmail(String text) {
        cleanAndEnterTextIntoElement(inputRegistrationEmail, "gorobetsira@ukr.net");
        return this;
    }

    public PersonalPage enterTextIntoInputRegistrationPassword(String text) {
        cleanAndEnterTextIntoElement(inputRegistrationPassword, "registrationPassword");
        return this;
    }

    public PersonalPage enterTextIntoInputRegistrationConfirmPassword(String text) {
        cleanAndEnterTextIntoElement(inputRegistrationConfirmPassword, "registrationConfirmPassword");
        return this;
    }

    public PersonalPage clickOnButtonRegistrationIn() {
        clickOnElement(buttonRegistrationIn);
        return this;
    }

    public PersonalPage checkIsMessageUserExistDisplayed() {
        checkElementsDisplayed(messageUserExist, "Message User Exist");
        return this;
    }
}
