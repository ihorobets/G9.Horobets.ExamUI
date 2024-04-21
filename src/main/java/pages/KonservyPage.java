package pages;



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
    private WebElement buttonKonservaProPlan;

    @FindBy(xpath = "//*[@class='success-message']")
    private WebElement successMessage;

    public KonservyPage(WebDriver webDriver) {
        super(webDriver);
    }

    public HeaderElement getHeaderElement() {
        return new HeaderElement(webDriver);
    }

    public KonservyPage checkIsRedirectToKonservyPage() {
        // TODO checkUrlWithPattern();
        // todo element
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

    public KonservyPage enterTextIntoInputName(String text){
        cleanAndEnterTextIntoElement(inputName, text);
        return this;
    }

    public KonservyPage enterTextIntoInputPhone(String text){
        cleanAndEnterTextIntoElement(inputPhone, text);
        return this;
    }

    public KonservyPage enterTextIntoInputEmail(String text){
        cleanAndEnterTextIntoElement(inputEmail, text);
        return this;
    }


    public KonservyPage enterTextIntoInputMessage(String text){
        cleanAndEnterTextIntoElement(inputMessage, text);
        return this;
    }

    public KonservyPage checkIsButtonSendDisplayed() {
        checkElementsDisplayed(buttonSend, "Button Send");
        return this;
    }

    public KonservyPage clickOnButtonKonservaProPlan() {
        clickOnElement(buttonKonservaProPlan);
        return this;
    }

//    public KonservyPage checkIsSuccessMessageDisplayed() {
//        Assert.assertTrue("Success message is not displayed"
//                , isElementDisplayed(successMessage, "Success Message"));
//        return this;
//    }

//    public KonservyPage checkTextInSuccessMessage(String expectedMessageText) {
//        String actualText = successMessage.getText();
//        Assert.assertEquals("Text in message", expectedMessageText, actualText);
//        return this;
//    }
}
