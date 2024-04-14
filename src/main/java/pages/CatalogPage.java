package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CatalogPage extends ParentPage{

    @FindBy(xpath = "//a[@href='/catalog/sobaki/' and @class= 'img']")
    private WebElement buttonSobaki;

    public CatalogPage(WebDriver webDriver) {
        super(webDriver);
    }

    public CatalogPage checkIsRedirectToCatalogPage() {
        // TODO checkUrlWithPattern();
        // todo element
        // Assert.assertTrue("Avatar small is not displayed"
        // , isElementDisplayed(avatarSmall, "Avatar Small"));
        return this;
    }

    public SobakiPage clickOnButtonSobaki() {
        clickOnElement(buttonSobaki);
        return new SobakiPage(webDriver);
    }
}
