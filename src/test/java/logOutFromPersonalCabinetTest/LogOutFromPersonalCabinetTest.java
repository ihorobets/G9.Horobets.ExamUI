package logOutFromPersonalCabinetTest;

import baseTest.BaseTest;
import data.TestData;
import org.junit.Before;
import org.junit.Test;

public class LogOutFromPersonalCabinetTest extends BaseTest {


    @Before
    public void logInToPersonalCabinet() {
        pageProvider.getMainPage().openMainPage();
        pageProvider.getMainPage().getHeaderElement()
                .clickOnButtonUviity().fillLoginFormWithValidCred();
    }


    @Test
    public void TC_005_logOutFromPersonalCabinetTest() {
        pageProvider.getMainPage().openMainPage();
        pageProvider.getMainPage().getHeaderElement()
                .clickOnButtonMiyCabinet()
                .checkIsRedirectToPersonalPage()
                .checkIsButtonPotochniZamovlennyaIsDisplayed()
                .checkIsButtonOsobystiDaniIsDisplayed()
                .checkIsButtonIstoriyaZamovlenIsDisplayed()
                .checkIsButtonProfiliZamovlenIsDisplayed()
                .checkIsButtonKoshykIsDisplayed()
                .checkIsButtonOpovischennyaProNayavnisntIsDisplayed()
                .checkIsButtonVyityIsDisplayed()
                .clickOnButtonVyity()
                .checkIsButtonUviityIsDisplayed()
                .checkIsButtonZareestruvatysyaIsDisplayed()
                .checkIsButtonVyityIsNotDisplayed();

    }
}
