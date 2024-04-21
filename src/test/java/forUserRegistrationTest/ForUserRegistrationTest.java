package forUserRegistrationTest;

import baseTest.BaseTest;
import org.junit.Test;

public class ForUserRegistrationTest extends BaseTest {

    @Test
    public void TC_001_registrationExistUserTest() {
        pageProvider.getMainPage().openMainPage();
        pageProvider.getMainPage().getHeaderElement()
                .clickOnButtonUviity()
                .checkIsRedirectToPersonalPage()
                .clickOnButtonZareestruvatysya()
                .enterTextIntoInputRegistrationName(data.TestData.VALID_REGISTRATION_NAME_UI)
                .enterTextIntoInputRegistrationLastName(data.TestData.VALID_REGISTRATION_LAST_NAME_UI)
                .enterIntoInputRegistrationPhoneNumber(data.TestData.VALID_REGISTRATION_PHONE_NUMBER_UI)
                .enterTextIntoInputRegistrationEmail(data.TestData.VALID_REGISTRATION_EMAIL_UI)
                .enterTextIntoInputRegistrationPassword(data.TestData.VALID_PASSWORD_UI)
                .enterTextIntoInputRegistrationConfirmPassword(data.TestData.VALID_PASSWORD_UI)
                .clickOnButtonReestratsiya()
                .checkIsMessageUserExistDisplayed()
                .checkIsButtonReestratsiyaIsDisplayed()
                .checkIsButtonVyityIsNotDisplayed()

        ;

    }


}
