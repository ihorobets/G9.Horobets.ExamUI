package adressesTests;

import baseTest.BaseTest;
import org.junit.Test;

public class AdressesTests extends BaseTest {

    @Test
    public void TC_005_testIsAddressesDisplayed() {
        pageProvider.getMainPage().openMainPage();
        pageProvider.getMainPage().getHeaderElement().clickOnContacts()
                .checkIsRedirectToContactsPage()
                .cheсkIsAddressesDisplayed()

        ;
    }
}
