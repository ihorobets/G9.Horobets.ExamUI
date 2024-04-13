package testsForRegistration;

import baseTest.BaseTest;
import org.junit.Test;

public class TestForUserRegistration extends BaseTest {

    @Test
    public void TC_001_registrationExistUserTest() {
pageProvider.getMainPage().openMainPage();
pageProvider.getMainPage().getHeaderElement().clickOnButtonSignIn()
        .checkIsRedirectToPersonalPage()
        .clickOnButtonRegistration()
        .enterTextIntoInputRegistrationName("Iryna")
        .enterTextIntoInputRegistrationLastName("Horobets")
        .enterTextIntoInputRegistrationPhoneNumber("0969311198")
        .enterTextIntoInputRegistrationEmail("gorobetsira@ukr.net")
        .enterTextIntoInputRegistrationPassword("123456")
        .enterTextIntoInputRegistrationConfirmPassword("123456")
        .clickOnButtonRegistrationIn()
        .checkIsMessageUserExistDisplayed()
        ;

    }




}
