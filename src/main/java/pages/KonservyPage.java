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
    private WebElement buttonKonservaRoyalCanin;

    @FindBy(xpath = "//a[@id='bx_117848907_23329_wish_list']")
    private WebElement buttonVybrene;

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

    public KonservyPage clickOnButtonKonservaRoyalCanin() {
        clickOnElement(buttonKonservaRoyalCanin);
        return this;
    }


    public KonservyPage clickOnButtonVybrane() {
        clickOnElement(buttonVybrene);
        return this;
    }
}
