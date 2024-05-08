package askQuestionAboutProductTest;

import baseTest.BaseTest;
import org.junit.Test;

public class AskQuestionAboutProductTest extends BaseTest {

    final String konservaProPlan = "Purina Pro Plan Veterinary Diets HA Hypoallergenic";

    @Test
    public void TC_003_askQuestionAboutProductTest() {
        pageProvider.getMainPage().openMainPage();
        pageProvider.getMainPage().getHeaderElement().clickOnButtonCatalog()
                .checkIsRedirectToCatalogPage()
                .clickOnButtonSobaki()
                .checkIsRedirectToSobakiPage()
                .clickOnButtonKonservy()
                .checkIsRedirectToKonservyPage()
                .clickOnKonserva(konservaProPlan)
                .enterTextIntoInputName("Ivan")
                .enterTextIntoInputPhone("000 000 00 00")
                .enterTextIntoInputEmail("jjj@gmail.com")
                .enterTextIntoInputMessage("Text")
                .clickOnButtonSend()
                .checkIsSuccessMessageDisplayed()
        ;

    }


}
