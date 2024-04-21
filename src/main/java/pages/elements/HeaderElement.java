package pages.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import pages.*;

public class HeaderElement extends CommonActionsWithElements {

    @FindBy(xpath = "//*[@class='auth-popup-btn login-link icon-custom']")
    private WebElement buttonUviity;

    @FindBy(xpath = "//a[@href='/catalog/']")
    private WebElement buttonCatalog;

    @FindBy(xpath = "//*[@class='wishlist-link icon-custom']")
    private WebElement buttonVybrane;

    @FindBy(xpath = "//a[@class='personal-link icon-custom']")
    private WebElement buttonMiyCabinet;


    public HeaderElement(WebDriver webDriver) {
        super(webDriver);
    }

    public PersonalPage clickOnButtonUviity() {
        clickOnElement(buttonUviity);
        return new PersonalPage(webDriver);
    }

    public CatalogPage clickOnButtonCatalog() {
        clickOnElement(buttonCatalog);
        return new CatalogPage(webDriver);
    }

    public PersonalPage clickOnButtonVybrane() {
        clickOnElement(buttonVybrane);
        return new PersonalPage(webDriver);
    }


    public PersonalPage clickOnButtonMiyCabinet() {
        clickOnElement(buttonMiyCabinet);
        return new PersonalPage(webDriver);
    }
}
