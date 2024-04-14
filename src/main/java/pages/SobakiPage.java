package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SobakiPage extends ParentPage{

    @FindBy(xpath = "//a[@href ='/catalog/sobaki/konservy-dlja-sobak/' and @class= 'item']")
    private WebElement buttonKonservy;

    public SobakiPage(WebDriver webDriver) {
        super(webDriver);
    }

    public SobakiPage checkIsRedirectToSobakiPage() {
        // TODO checkUrlWithPattern();
        // todo element
        // Assert.assertTrue("Avatar small is not displayed"
        // , isElementDisplayed(avatarSmall, "Avatar Small"));
        return this;
    }

    public KonservyPage clickOnButtonKonservy() {
        clickOnElement(buttonKonservy);
        return new KonservyPage(webDriver);
    }
}
