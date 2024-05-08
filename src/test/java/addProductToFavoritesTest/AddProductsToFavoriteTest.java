package addProductToFavoritesTest;

import baseTest.BaseTest;
import org.junit.Test;

public class AddProductsToFavoriteTest extends BaseTest {

    final String konservaRoyalCanin = "Royal Canin Veterinary Gastrointestinal Puppy Ultra Soft Mouse";


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
                .clickOnKonserva(konservaRoyalCanin)
                .clickOnButtonVybrane();
        pageProvider.getMainPage().getHeaderElement().clickOnButtonVybrane()
                .checkIsRedirectToKoshyk()
                .checkIsKovservaDisplayed(konservaRoyalCanin)

        ;

    }
}
