package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactsPage extends ParentPage {

    @FindBy(xpath = "//h2[contains(text(), 'Зоомагазин TORZOO - М.Арнаутська 71')]")
    private WebElement shopArnautska;

    @FindBy(xpath = "//h2[text()=' Інтернет зоомагазин TORZOO']")
    private WebElement shopInternet;

    @FindBy(xpath = "//h2[contains(text(), 'Зоомагазин TORZOO - Вул. Львівська 15 Б (ЖК Море)')]")
    private WebElement shopLvivska;

    @FindBy(xpath = "//h2[contains(text(), 'Зоомагазин TORZOO - Проспект  Небесної Сотні. Чорноморка 2')]")
    private WebElement shopNebesnoiSotni;

    public ContactsPage(WebDriver webDriver) {
        super(webDriver);
    }

    public ContactsPage checkIsRedirectToContactsPage() {
        //TODO
        return this;
    }

    public ContactsPage cheсkIsAddressesDisplayed() {

        checkElementsDisplayed(shopInternet,"Зоомагазин TORZOO - Інтернет-магазин");
        checkElementsDisplayed(shopArnautska, "Зоомагазин TORZOO - М.Арнаутська 71");
        checkElementsDisplayed(shopLvivska, "Зоомагазин TORZOO - Вул. Львівська 15 Б (ЖК Море)");
        checkElementsDisplayed(shopNebesnoiSotni, "Зоомагазин TORZOO - Вул. Небесної сотні 4");
        return this;
    }
}
