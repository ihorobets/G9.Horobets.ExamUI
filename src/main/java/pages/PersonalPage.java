package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.elements.HeaderElement;

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

    @FindBy(xpath = "//input[@name='USER_LOGIN']")
    private WebElement inputLoginPhoneNumber;

    @FindBy(xpath = "//input[@name='USER_PASSWORD']")
    private WebElement inputLoginPassword;

    @FindBy(xpath = "//button[@name='Login']")
    private WebElement buttonVyityLoginForm;

    @FindBy(xpath = "//a[@href='/personal/orders/' and not(@class='item')]")
    private WebElement buttonPotochniZamovlennya;

    @FindBy(xpath = "//a[@href='/personal/private/' and not(@class='item')]")
    private WebElement buttonOsobystiDani;

    @FindBy(xpath = "//a[@href='/personal/orders/?filter_history=Y' and not(@class='item')]")
    private WebElement buttonIstoriyaZamovlen;

    @FindBy(xpath = "//a[@href='/personal/profiles/' and not(@class='item')]")
    private WebElement buttonProfiliZamovlen;

    @FindBy(xpath = "//a[@href='/personal/cart/' and not(@class='basket-link icon-custom')]")
    private WebElement buttonKoshyk;

    @FindBy(xpath = "//a[@href='/personal/subscribe/' and not(@class='item')]")
    private WebElement buttonOpovischennyaProNayavnisnt;

    @FindBy(xpath = "//button[@name='Login']")
    private WebElement buttonUviity;

    @FindBy(xpath = "//a[@class='btn']")
    private WebElement buttonPereityVCatalog;

    @Override
    protected String getRelativeUrl() {
        return "/personal/[a-zA-Z0-9/]*";
    }

    public PersonalPage(WebDriver webDriver) {
        super(webDriver);
    }

    public HeaderElement getHeaderElement() {
        return new HeaderElement(webDriver);
    }

    public PersonalPage checkIsRedirectToPersonalPage() {
        checkUrlWithPattern();
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

    public PersonalPage checkIsButtonOformytyZamovlennyaDisplayed() {
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

    public PersonalPage fillLoginFormWithValidCred() {
        enterNumberIntoInputLoginPhone("380969311198");
        enterTextIntoInputLoginPassword("123456");
        clickOnButtonUviityLoginForm();
        return this;

    }

    private PersonalPage enterTextIntoInputLoginPassword(String text) {
        cleanAndEnterTextIntoElement(inputLoginPassword, text);
        return this;
    }

    private PersonalPage enterNumberIntoInputLoginPhone(String text) {
        cleanAndEnterTextIntoElement(inputLoginPhoneNumber, text);
        return this;
    }

    public PersonalPage clickOnButtonUviityLoginForm() {
        clickOnElement(buttonVyityLoginForm);
        return new PersonalPage(webDriver);
    }

    public PersonalPage checkIsButtonPotochniZamovlennyaIsDisplayed() {
        isElementDisplayed(buttonPotochniZamovlennya, "Button Potochni Zamovlennya");
        return this;
    }

    public PersonalPage checkIsButtonOsobystiDaniIsDisplayed() {
        isElementDisplayed(buttonOsobystiDani, "Button Osobysti Dani");
        return this;
    }

    public PersonalPage checkIsButtonIstoriyaZamovlenIsDisplayed() {
        isElementDisplayed(buttonIstoriyaZamovlen, "Button Istoriya Zamovlen");
        return this;
    }

    public PersonalPage checkIsButtonProfiliZamovlenIsDisplayed() {
        isElementDisplayed(buttonProfiliZamovlen, "Button Profili Zamovlen");
        return this;
    }

    public PersonalPage checkIsButtonKoshykIsDisplayed() {
        isElementDisplayed(buttonKoshyk, "Button Koshyk");
        return this;
    }

    public PersonalPage checkIsButtonOpovischennyaProNayavnisntIsDisplayed() {
        isElementDisplayed(buttonOpovischennyaProNayavnisnt, "Button Opovischennya Pro Nayavnisnt");
        return this;
    }

    public PersonalPage checkIsButtonVyityIsDisplayed() {
        isElementDisplayed(buttonVyity, "Button Vyity");
        return this;
    }

    public PersonalPage clickOnButtonVyity() {
        clickOnElement(buttonVyity);
        return this;
    }

    public PersonalPage checkIsButtonUviityIsDisplayed() {
        checkElementsDisplayed(buttonUviity, "Button Uviity");
        return this;
    }

    public PersonalPage checkIsButtonZareestruvatysyaIsDisplayed() {
        checkElementsDisplayed(buttonZareestruvatysya, "Button Zareestruvatysya");
        return this;
    }

    public CatalogPage clickOnButtonPereityVCatalog() {

        clickOnElement(buttonPereityVCatalog);
        return new CatalogPage(webDriver);
    }
}
