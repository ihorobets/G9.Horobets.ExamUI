package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;


import pages.elements.HeaderElement;

public class MainPage extends ParentPage {



    public MainPage(WebDriver webDriver) {
        super(webDriver);
    }

    public HeaderElement getHeaderElement() {
        return new HeaderElement(webDriver);
    }

    public void openMainPage() {
        try {
            webDriver.get(baseUrl);
            logger.info("Main page was opened ");
        } catch (Exception e) {
            logger.error("Can not open Main Page " + e);
            Assert.fail("Can not open Main Page " + e);
        }
    }


}
