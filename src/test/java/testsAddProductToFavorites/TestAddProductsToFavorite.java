package testsAddProductToFavorites;

import baseTest.BaseTest;
import org.junit.Test;

public class TestAddProductsToFavorite extends BaseTest {

    @Test
    public void TC_002_addFavoriteProductToKoshykTest() {
        pageProvider.getMainPage().openMainPage();
        pageProvider.getMainPage().getHeaderElement().clickOnButtonCatalog()
                .checkIsRedirectToCatalogPage()
                .clickOnButtonSobaki().checkIsRedirectToSobakiPage()
                .clickOnButtonKonservy().checkIsRedirectToKonservyPage()
                .clickOnPidbirParametriv()
                .clickOnTorgovaMarka()
                .clickOnButtonRoyalCanin()
                .clickOnButtonPokazaty()
                .clickOnKonservaRoyalCanin()
                .clickOnButtonVybrane();
        pageProvider.getMainPage().getHeaderElement().clickOnButtonVybrane()
                .checkIsRedirectToKoshyk()
                .checkIsKovservaRoyalCaninDisplayed()
                .checkIsButtonOformytyZamovlennyaDisplayed()


        ;

    }
}
