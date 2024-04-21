package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PersonalPage extends ParentPage {

    @FindBy(xpath = "//button[@name='Register']")
    private WebElement buttonReestratsiya;

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

    @FindBy(xpath = "//a[@class='btn white reg-link']")
    private WebElement buttonZareestruvatysya;

    @FindBy(xpath = "//div[@class='message-errors']")
    private WebElement messageUserExist;

    @FindBy(xpath = "//*[@class='btn btn-lg btn-default basket-btn-checkout disabled']")
    private WebElement buttonOformlennyaZamovlennya;

    @FindBy(xpath = "//a[@class='icon-custom']")
    private WebElement buttonVyity;

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


    public PersonalPage clickOnButtonReestratsiya() {
        clickOnElement(buttonReestratsiya);
        return this;
    }

    public PersonalPage enterTextIntoInputRegistrationName(String text) {
        cleanAndEnterTextIntoElement(inputRegistrationName, text);
        return this;
    }

    public PersonalPage enterTextIntoInputRegistrationLastName(String text) {
        cleanAndEnterTextIntoElement(inputRegistrationLastName, text);
        return this;
    }

    public PersonalPage enterIntoInputRegistrationPhoneNumber(String text) {
        cleanAndEnterTextIntoElement(inputRegistrationPhoneNumber, text);
        return this;
    }


    public PersonalPage enterTextIntoInputRegistrationEmail(String text) {
        cleanAndEnterTextIntoElement(inputRegistrationEmail, text);
        return this;
    }

    public PersonalPage enterTextIntoInputRegistrationPassword(String text) {
        cleanAndEnterTextIntoElement(inputRegistrationPassword, text);
        return this;
    }

    public PersonalPage enterTextIntoInputRegistrationConfirmPassword(String text) {
        cleanAndEnterTextIntoElement(inputRegistrationConfirmPassword, text);
        return this;
    }

    public PersonalPage clickOnButtonZareestruvatysya() {
        clickOnElement(buttonZareestruvatysya);
        return this;
    }

    public PersonalPage checkIsMessageUserExistDisplayed() {
        checkElementsDisplayed(messageUserExist, "Message User Exist");
        return this;
    }

    public PersonalPage checkIsRedirectToKoshyk() {
        // TODO checkUrlWithPattern();
        // todo element
        return this;
    }

    public PersonalPage checkIsButtonOformytyZamovlennyaDisplayed(){
        checkElementsDisplayed(buttonOformlennyaZamovlennya, "Button Oformlennya Zamovlennya");
        return this;
    }

    public PersonalPage checkIsKovservaRoyalCaninDisplayed() {
       // TODO Assert.assertEquals();
        return this;
    }

    public PersonalPage checkIsButtonReestratsiyaIsDisplayed() {
        checkElementsDisplayed(buttonReestratsiya, "Button Reestratsiya");
        return this;
    }

    public PersonalPage checkIsButtonVyityIsNotDisplayed() {
        checkElementsNotDisplayed(buttonVyity, "Button Vyity");
        return this;
    }
}
