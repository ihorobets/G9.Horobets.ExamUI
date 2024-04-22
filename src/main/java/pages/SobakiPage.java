package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SobakiPage extends ParentPage{

    @FindBy(xpath = "//a[@href ='/catalog/sobaki/konservy-dlja-sobak/' and @class= 'item']")
    private WebElement buttonKonservy;

    @FindBy(xpath = "//a[@href='/catalog/sobaki/suhoj-korm-dlja-sobak/' and @class='item']")
    private WebElement buttonSuhyiKorm;

    @Override
    protected String getRelativeUrl() {
        return "/catalog/sobaki/";
    }

    public SobakiPage(WebDriver webDriver) {
        super(webDriver);
    }

    public SobakiPage checkIsRedirectToSobakiPage() {
        checkUrl();
        Assert.assertTrue("Button Konservy  is not displayed", isElementDisplayed(buttonKonservy, "Button Konservy"));
        Assert.assertTrue("Button Suhyi Korm is not displayed", isElementDisplayed(buttonSuhyiKorm, "Button Suhyi Korm"));
        return this;
    }

    public KonservyPage clickOnButtonKonservy() {
        clickOnElement(buttonKonservy);
        return new KonservyPage(webDriver);
    }
}
