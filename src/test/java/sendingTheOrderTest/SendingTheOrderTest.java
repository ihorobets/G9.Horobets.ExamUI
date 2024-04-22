package sendingTheOrderTest;

import baseTest.BaseTest;
import org.junit.Test;

public class SendingTheOrderTest extends BaseTest {

    @Test
    public void TC_004_sendingTheOrderInOneClickTest() {
        pageProvider.getMainPage().openMainPage();
        pageProvider.getMainPage().getHeaderElement().clickOnButtonKoshyk()
                .checkIsRedirectToPersonalPage()
                .clickOnButtonPereityVCatalog()
                .checkIsRedirectToCatalogPage()
                .clickOnButtonSobaki().checkIsRedirectToSobakiPage().clickOnButtonKonservy()
                .checkIsRedirectToKonservyPage().clickOnKonservaProPlan()
                .clickOnButtonBuyInOneClick().enterTextIntoInputNameForOrder(data.TestData.VALID_NAME_FOR_ORDER)
                .enterTextIntoInputPhoneForOrder(data.TestData.VALID_PHONE_FOR_ORDER)
                .enterTextIntoInputCityForOrder(data.TestData.VALID_CITY_FOR_ORDER)
                .clickOnButtonNovaPoshta().enterTextIntoInputCommentForOrder(data.TestData.VALID_COMMENT_FOR_ORDER)
                .clickOnButtonOformytyZamovlennya().checkIsSuccessMessageOrderDisplayed()


        ;

    }




}
