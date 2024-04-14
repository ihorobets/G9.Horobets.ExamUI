package testsAddProductToFavorites;

import baseTest.BaseTest;
import org.junit.Test;

public class AddProductsToFavoriteTest extends BaseTest {

    @Test
    public void TC_002_addProductsToFavoriteTest() {
        pageProvider.getMainPage().openMainPage();
        pageProvider.getMainPage().getHeaderElement().clickOnButtonCatalog()
                .checkIsRedirectToCatalogPage()
                .clickOnButtonSobaki().checkIsRedirectToSobakiPage()
                .clickOnButtonKonservy().checkIsRedirectToKonservyPage()
                .clickOnPidbirParametriv()
                .clickOnTorgovaMarka()
                .clickOnButtonRoyalCanin()
                .clickOnButtonPokazaty()
                .clickOnButtonKonservaRoyalCanin()
                .clickOnButtonVybrane();
        pageProvider.getMainPage().getHeaderElement().clickOnButtonVybrane()
                .checkIsRedirectToKoshyk()
                .checkIsKovservaRoyalCaninDisplayed()
                .checkIsButtonOformytyZamovlennyaDisplayed()


        ;

    }
}
