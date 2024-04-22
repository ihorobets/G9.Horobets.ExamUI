package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CatalogPage extends ParentPage{

    @FindBy(xpath = "//a[@href='/catalog/sobaki/' and @class= 'img']")
    private WebElement buttonSobaki;

    @FindBy(xpath = "//*[@href='/catalog/koshki/' and @class='img']")
    private WebElement buttonKoshki;

    @FindBy(xpath = "//*[@href='/catalog/gryzuny/' and @class='img']")
    private WebElement buttonGryzuny;

    @Override
    protected String getRelativeUrl() {
        return "/catalog/";
    }

    public CatalogPage(WebDriver webDriver) {
        super(webDriver);
    }

    public CatalogPage checkIsRedirectToCatalogPage() {
        checkUrl();
        Assert.assertTrue("Button Koshki is not displayed", isElementDisplayed(buttonKoshki, "Button Koshki"));
        Assert.assertTrue("Button Gryzuny is not displayed", isElementDisplayed(buttonGryzuny, "Button Gryzuny"));
        Assert.assertTrue("Button Sobaki is not displayed", isElementDisplayed(buttonSobaki, "Button Sobaki"));
        return this;
    }

    public SobakiPage clickOnButtonSobaki() {
        clickOnElement(buttonSobaki);
        return new SobakiPage(webDriver);
    }
}
