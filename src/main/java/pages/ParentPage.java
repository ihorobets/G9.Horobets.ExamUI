package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;


abstract public class ParentPage extends CommonActionsWithElements{

    abstract protected String getRelativeUrl();

    String baseUrl = "https://torzoo.ua";

    public ParentPage(WebDriver webDriver) {
        super(webDriver);
    }

    protected void checkUrl() {
        Assert.assertEquals("Invalid page"
                , baseUrl + getRelativeUrl()
                , webDriver.getCurrentUrl());
    }

    protected void checkUrlWithPattern() {
        Assert.assertTrue("Invalid page \n +" +
                        "Expected url: " + baseUrl + getRelativeUrl() +
                        "\n Actual url: " + webDriver.getCurrentUrl()
                , webDriver.getCurrentUrl().matches(baseUrl + getRelativeUrl()));
    }


}
