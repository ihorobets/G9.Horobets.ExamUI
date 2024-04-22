package pages;


import org.checkerframework.checker.units.qual.K;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.elements.HeaderElement;

public class KonservyPage extends ParentPage {

    @FindBy(xpath = "//div[text()='Торгова марка'] ")
    private WebElement buttonTorgovaMarka;

    @FindBy(xpath = "//*[@class='bx_filter_title']")
    private WebElement pidbirParametriv;

    @FindBy(xpath = "//*[@title='Royal Canin']")
    private WebElement buttonRoyalCanin;

    @FindBy(xpath = "//a[@class='bx_filter_search_button']")
    private WebElement buttonPokazaty;

    @FindBy(xpath = "//a[contains(text(), 'Royal Canin Veterinary Gastrointestinal Puppy Ultra Soft Mouse')]")
    private WebElement KonservaRoyalCanin;

    @FindBy(xpath = "//a[@id='bx_117848907_23329_wish_list']")
    private WebElement buttonVybrene;

    @FindBy(xpath = "//input[@data-sid='name']")
    private WebElement inputName;

    @FindBy(xpath = "//input[@data-sid='phone']")
    private WebElement inputPhone;

    @FindBy(xpath = "//input[@data-sid='email']")
    private WebElement inputEmail;

    @FindBy(xpath = "//textarea[@name='form_textarea_6']")
    private WebElement inputMessage;

    @FindBy(xpath = "//button[@name='web_form_submit']")
    private WebElement buttonSend;

    @FindBy(xpath = "//a[contains(text(), 'Purina Pro Plan Veterinary Diets HA Hypoallergenic')]")
    private WebElement konservaProPlan;

    @FindBy(xpath = "//*[@class='success-message']")
    private WebElement successMessage;

    @FindBy(xpath = "//a[@class='btn one-click']")
    private WebElement buttonBuyInOneClick;

    @FindBy(xpath = "//input[@name='BUY1CLICK[FIO]']")
    private WebElement inputNameForOrder;

    @FindBy(xpath = "//input[@name='BUY1CLICK[PHONE]']")
    private WebElement inputPhoneForOrder;

    @FindBy(xpath = "//input[@name='BUY1CLICK[CITY]']")
    private WebElement inputCityForOrder;

    @FindBy(xpath = "//a[@id='np_delivery_link']")
    private WebElement buttonDostavkaForOrder;

    @FindBy(xpath = "//textarea[@name='BUY1CLICK[COMMENT]']")
    private WebElement inputComentarForOrder;

    @FindBy(xpath = "//button[text()='Оформити замовлення']")
    private WebElement buttonOformytyZamovlennya;

    @FindBy(xpath = "//a[@id='np_delivery_link']")
    private WebElement buttonNovaPoshta;

    @FindBy(xpath = "//*[@class='popup-content']")
    private WebElement successMessageOrder;

    @FindBy(xpath = "//a[@href='/catalog/sobaki/konservy-dlja-sobak/lechebnye_konservy_dlya_sobak/']")
    private WebElement titleVologyiLikuvalnyiKorm;

    @Override
    protected String getRelativeUrl() {
        return "/catalog/sobaki/konservy-dlja-sobak/";
    }

    public KonservyPage(WebDriver webDriver) {
        super(webDriver);
    }

    public HeaderElement getHeaderElement() {
        return new HeaderElement(webDriver);
    }

    public KonservyPage checkIsRedirectToKonservyPage() {
        checkUrl();
        Assert.assertTrue("Title Vologyi Likuvalnyi Korm  is not displayed",
                isElementDisplayed(titleVologyiLikuvalnyiKorm, "Title Vologyi Likuvalnyi Korm"));
        return this;
    }

    public KonservyPage clickOnTorgovaMarka() {
        clickOnElement(buttonTorgovaMarka);
        return this;
    }

    public KonservyPage clickOnPidbirParametriv() {
        clickOnElement(pidbirParametriv);
        return this;
    }

    public KonservyPage clickOnButtonRoyalCanin() {
        clickOnElement(buttonRoyalCanin);
        return this;
    }


    public KonservyPage clickOnButtonPokazaty() {
        clickOnElement(buttonPokazaty);
        return this;
    }

    public KonservyPage clickOnKonservaRoyalCanin() {
        clickOnElement(KonservaRoyalCanin);
        return this;
    }


    public KonservyPage clickOnButtonVybrane() {
        clickOnElement(buttonVybrene);
        return this;
    }

    public KonservyPage enterTextIntoInputName(String text) {
        cleanAndEnterTextIntoElement(inputName, text);
        return this;
    }

    public KonservyPage enterTextIntoInputPhone(String text) {
        cleanAndEnterTextIntoElement(inputPhone, text);
        return this;
    }

    public KonservyPage enterTextIntoInputEmail(String text) {
        cleanAndEnterTextIntoElement(inputEmail, text);
        return this;
    }


    public KonservyPage enterTextIntoInputMessage(String text) {
        cleanAndEnterTextIntoElement(inputMessage, text);
        return this;
    }


    public KonservyPage clickOnKonservaProPlan() {
        clickOnElement(konservaProPlan);
        return this;
    }

    public KonservyPage clickOnButtonSend() {
        clickOnElement(buttonSend);
        return this;
    }

    public KonservyPage checkIsSuccessMessageDisplayed() {
        checkElementsDisplayed(successMessage, "Success Message");
        return this;
    }

    public KonservyPage clickOnButtonBuyInOneClick() {
        clickOnElement(buttonBuyInOneClick);
        return this;
    }

    public KonservyPage enterTextIntoInputNameForOrder(String text) {
        cleanAndEnterTextIntoElement(inputNameForOrder, text);
        return this;
    }

    public KonservyPage enterTextIntoInputPhoneForOrder(String text) {
        cleanAndEnterTextIntoElement(inputPhoneForOrder, text);
        return this;
    }

    public KonservyPage enterTextIntoInputCityForOrder(String text) {
        cleanAndEnterTextIntoElement(inputCityForOrder, text);
        return this;
    }

    public KonservyPage clickOnButtonNovaPoshta() {
        clickOnElement(buttonNovaPoshta);
        return this;
    }

    public KonservyPage enterTextIntoInputCommentForOrder(String text) {
        cleanAndEnterTextIntoElement(inputComentarForOrder, text);
        return this;
    }

    public KonservyPage clickOnButtonOformytyZamovlennya() {
        clickOnElement(buttonOformytyZamovlennya);
        return this;
    }

    public KonservyPage checkIsSuccessMessageOrderDisplayed() {
        checkElementsDisplayed(successMessageOrder, "Success Message Order");
        return this;
    }

}
