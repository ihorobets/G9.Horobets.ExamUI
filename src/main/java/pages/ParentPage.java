package pages;

import org.openqa.selenium.WebDriver;
import pages.elements.HeaderElement;

public class ParentPage extends CommonActionsWithElements{

    String baseUrl = "https://torzoo.ua/";

    public ParentPage(WebDriver webDriver) {
        super(webDriver);
    }

    public HeaderElement getHeaderElement() {
        return new HeaderElement(webDriver);
    }
}
