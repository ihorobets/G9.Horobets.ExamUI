package pages;

import com.google.common.util.concurrent.AtomicDouble;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
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

    @FindBy(xpath = "//*[contains(text(), '%s')]")
    private WebElement konserva;

    private String konservaLocator = "//*[contains(text(), '%s')]";

    @FindBy(xpath = "//span[text()='Мій кабінет']")
    private WebElement buttonMiyCabinet;

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
        Assert.assertTrue("Button Zareestruvatysya is not displayed"
                , isElementDisplayed(buttonZareestruvatysya, "Button Zareestruvatysya"));
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
        Assert.assertTrue("Button Oformlennya Zamovlennya is not displayed"
                , isElementDisplayed(buttonOformlennyaZamovlennya, "Button Oformlennya Zamovlennya"));
        return this;
    }


    public PersonalPage checkIsKovservaDisplayed(String text) {
        Assert.assertTrue("Konserva is not displayed", isElementDisplayed(getKonserva(text), "Konserva"));
        return this;

    }

    private WebElement getKonserva(String konserva) {
        String locator = String.format(konservaLocator, konserva);
        return webDriver.findElement(By.xpath(locator));
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
        Assert.assertTrue("Button Potochni Zamovlennya is not displayed"
                , isElementDisplayed(buttonPotochniZamovlennya, "Button Potochni Zamovlennya"));
        return this;
    }

    public PersonalPage checkIsButtonOsobystiDaniIsDisplayed() {
        Assert.assertTrue("Button Osobysti Dani is not displayed"
                , isElementDisplayed(buttonOsobystiDani, "Button Osobysti Dani"));
        return this;
    }

    public PersonalPage checkIsButtonIstoriyaZamovlenIsDisplayed() {
        Assert.assertTrue("Button Istoriya Zamovlen is not displayed"
                , isElementDisplayed(buttonIstoriyaZamovlen, "Button Istoriya Zamovlen"));
        return this;
    }

    public PersonalPage checkIsButtonProfiliZamovlenIsDisplayed() {
        Assert.assertTrue("Button Profili Zamovlen is not displayed"
                , isElementDisplayed(buttonProfiliZamovlen, "Button Profili Zamovlen"));
        return this;
    }

    public PersonalPage checkIsButtonKoshykIsDisplayed() {
        Assert.assertTrue("Button Koshyk is not displayed"
                , isElementDisplayed(buttonKoshyk, "Button Koshyk"));
        return this;
    }

    public PersonalPage checkIsButtonOpovischennyaProNayavnisntIsDisplayed() {
        Assert.assertTrue("Button Opovischennya Pro Nayavnisn is not displayed"
                , isElementDisplayed(buttonOpovischennyaProNayavnisnt, "Button Opovischennya Pro Nayavnisnt"));
        return this;
    }

    public PersonalPage checkIsButtonVyityIsDisplayed() {
        Assert.assertTrue("Button Vyity is not displayed"
                , isElementDisplayed(buttonVyity, "Button Vyity"));
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

    public PersonalPage checkIsRedirectToPersonalPageSecond() {
        checkUrlWithPattern();
        Assert.assertTrue("Button Miy cabinet is not displayed"
                , isElementDisplayed(buttonMiyCabinet, "Miy cabinet"));
        return this;
    }
}
