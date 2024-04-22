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


}
