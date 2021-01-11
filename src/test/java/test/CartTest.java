package test;

import org.junit.Assert;
import org.junit.Test;
import page.MainPage;

public class CartTest extends CommonConditions {
    @Test
    public void addProductToCard(){
        String product ="count";
        String expected=new MainPage(driver)
                .openURL().goToEkip().chooseCategory().choiseAndGo(product).check();
        Assert.assertTrue(expected.equals( "Ботинки RSD Fresno gum - 43/10 (0810-0300-3968)") );
    }
}
