package pages;

import org.openqa.selenium.WebDriver;
import pages.elements.HeaderElement;

public class PageProvider {

    private WebDriver webDriver;

    public PageProvider(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public MainPage getMainPage() {
        return new MainPage(webDriver);
    }

    public PersonalPage getPersonalPage() {
        return new PersonalPage(webDriver);
    }

    public HeaderElement getHeaderElement() {
        return new HeaderElement(webDriver);
    }

    public CatalogPage getCatalogPage() {
        return new CatalogPage(webDriver);
    }

    public KonservyPage getKonservyPage() {
        return new KonservyPage(webDriver);
    }



}
