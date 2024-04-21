package testsAskQuestionAboutProduct;

import baseTest.BaseTest;
import org.junit.Test;

public class TestAskQuestionAboutProduct extends BaseTest {

    @Test
    public void TC_003_askQuestion() {
        pageProvider.getMainPage().openMainPage();
        pageProvider.getMainPage().getHeaderElement().clickOnButtonCatalog()
                .checkIsRedirectToCatalogPage()
                .clickOnButtonSobaki()
                .checkIsRedirectToSobakiPage()
                .clickOnButtonKonservy()
                .checkIsRedirectToKonservyPage()
                .clickOnKonservaProPlan()
                .enterTextIntoInputName("Ivan")
                .enterTextIntoInputPhone("000 000 00 00")
                .enterTextIntoInputEmail("jjj@gmail.com")
                .enterTextIntoInputMessage("Text")
                .clickOnButtonSend()
                .checkIsSuccessMessageDisplayed()
        ;

    }


}
