import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.lang.*;
import java.util.List;
import org.openqa.selenium.Alert;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class WebD {
  //@Test
    public void test1() throws Exception {
        WebDriver driver = new OperaDriver();
        driver.get("https://triumph.granmoto.ru");
        WebElement Ekipirovka = new WebDriverWait(driver, 10)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//header[@class='headroom-disabled']//child::a[text()='Экипировка и тюнинг']")));
        Ekipirovka.click();
        WebElement e1 = new WebDriverWait(driver, 10)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()='ПОСМОТРЕТЬ ЭКИПИРОВКУ']")));
        e1.click();
        WebElement e2 = new WebDriverWait(driver, 10)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()='Ботинки мужские']")));
        e2.click();
        WebElement e3 = new WebDriverWait(driver, 10)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()='Ботинки RSD Fresno gum']")));
        e3.click();
        WebElement e4 = new WebDriverWait(driver, 10)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='quantity']")));
        e4.sendKeys(Keys.BACK_SPACE);
        e4.sendKeys("3");

        WebElement e5 = new WebDriverWait(driver, 10)

                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@type='submit'and text()='В корзину']")));

        e5.click();
        new WebDriverWait(driver, 10).until(CustomConditions.jQueryAJAXsCompleted());
        WebElement e6 = new WebDriverWait(driver, 10)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span [@class='title']")));

        e6.click();

        WebElement e7 = new WebDriverWait(driver, 10)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a [@class='name']")));
        String itog = e7.getText();
        String itogg = "Ботинки RSD Fresno gum - 43/10 (0810-0300-3968)";
        Assert.assertTrue("mgd", itogg.equals(itog));

        driver.quit();


    }
//@ Test
    public void test2() throws Exception {
        WebDriver driver = new OperaDriver();
        driver.get("https://triumph.granmoto.ru");
        WebElement Ekipirovka = new WebDriverWait(driver, 10)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//header[@class='headroom-disabled']//child::a[text()='Экипировка и тюнинг']")));
        Ekipirovka.click();
        WebElement e1 = new WebDriverWait(driver, 10)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()='ПОСМОТРЕТЬ ЭКИПИРОВКУ']")));
        e1.click();
        WebElement e2 = new WebDriverWait(driver, 10)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()='Ботинки мужские']")));
        e2.click();
        WebElement e3 = new WebDriverWait(driver, 10)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()='Ботинки RSD Fresno gum']")));
        e3.click();
        WebElement e4 = new WebDriverWait(driver, 10)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='quantity']")));
        e4.sendKeys(Keys.BACK_SPACE);
        e4.sendKeys("3");

        WebElement e5 = new WebDriverWait(driver, 10)

                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@type='submit'and text()='В корзину']")));

        e5.click();
        new WebDriverWait(driver, 10).until(CustomConditions.jQueryAJAXsCompleted());
        WebElement e6 = new WebDriverWait(driver, 10)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@class='tier1title'and text()='ЭКИПИРОВКА МУЖСКАЯ']")));
        e6.click();

        WebElement e7 = new WebDriverWait(driver, 10)
            .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@class='product-block-title'and text()='Кепки']")));
         e7.click();

        WebElement e8 = new WebDriverWait(driver, 10)
            .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@class='product-block-title'and text()='Кепка Tiger 900']")));
         e8.click();

    WebElement e9 = new WebDriverWait(driver, 10)
            .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='quantity']")));
    e9.sendKeys(Keys.BACK_SPACE);
    e9.sendKeys("5");

    WebElement e10 = new WebDriverWait(driver, 10)

            .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@type='submit'and text()='В корзину']")));

    e10.click();

    new WebDriverWait(driver, 10).until(CustomConditions.jQueryAJAXsCompleted());
    WebElement e11 = new WebDriverWait(driver, 10)
            .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span [@class='title']")));

    e11.click();
    List<WebElement> e12 = driver.findElements(By.xpath("//a [@class='name']"));

    int k= e12.size();
    Assert.assertTrue("mgd", k==2);



        driver.quit();


    }
    //@Test
    public void test3() throws Exception {
        WebDriver driver = new OperaDriver();
        driver.get("https://granmoto.ru");

        WebElement PoiskH = new WebDriverWait(driver, 10)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@class='search desktop-only']")));
        PoiskH.click();

        WebElement PoiskH1 = new WebDriverWait(driver, 10)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='q']")));
        PoiskH1.sendKeys(Keys.BACK_SPACE);
        PoiskH1.sendKeys("хлеб");

        WebElement PoiskH2 = new WebDriverWait(driver, 10)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='search-submit']")));
        PoiskH2.click();

        WebElement PoiskH3 = new WebDriverWait(driver, 10)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='h3 align-center']")));
        String itogPoiskH = PoiskH3.getText();
        String itoggPoiskH = "По запросу хлеб товаров не нашлось…";
        //System.out.print(itogP);
        Assert.assertTrue("mgd", itoggPoiskH.equals(itogPoiskH));
    }
    //@Test
    public void test4() throws Exception {
        WebDriver driver = new OperaDriver();
        driver.get("https://granmoto.ru");

        WebElement Poisk = new WebDriverWait(driver, 10)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@class='search desktop-only']")));
        Poisk.click();

        WebElement p1 = new WebDriverWait(driver, 10)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='q']")));
        p1.sendKeys(Keys.BACK_SPACE);
        p1.sendKeys("Кепка Emmett Bonneville");

        WebElement p2 = new WebDriverWait(driver, 10)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='search-submit']")));
        p2.click();

        WebElement p3 = new WebDriverWait(driver, 10)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@class='product-block-title']")));
        String itogP = p3.getText();
        String itoggP = "Кепка Emmett Bonneville";
        //System.out.print(itogP);
        Assert.assertTrue("mgd", itoggP.equals(itogP));
    }
    //@Test
    public void test5() throws Exception {
        WebDriver driver = new OperaDriver();
        driver.get("https://granmoto.ru");

        WebElement Carta = new WebDriverWait(driver, 10)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@class=\"product-block-title\"and text()='Hedon Hedonist Creme']")));
        Carta.click();
        WebElement Carta1 = new WebDriverWait(driver, 10)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//select [@id]")));
        Carta1.click();

        WebElement Carta2 = new WebDriverWait(driver, 10)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//option [@value='M']")));
        Carta2.click();
        WebElement Carta3 = new WebDriverWait(driver, 10)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@name='add']")));
        Carta3.click();

        new WebDriverWait(driver, 10).until(CustomConditions.jQueryAJAXsCompleted());
        WebElement Carta4 = new WebDriverWait(driver, 10)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@class='title']")));
        Carta4.click();
        WebElement Carta5 = new WebDriverWait(driver, 10)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div [@class='checkout-row']")));
        Carta5.click();

        WebElement Carta6 = new WebDriverWait(driver, 10)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input [@placeholder='Email']")));
        Carta6.sendKeys(Keys.BACK_SPACE);
        Carta6.sendKeys("matew01@mail.ru");

        WebElement Carta7 = new WebDriverWait(driver, 10)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input [@placeholder='Имя']")));
        Carta7.sendKeys(Keys.BACK_SPACE);
        Carta7.sendKeys("Matvei");

        WebElement Carta8 = new WebDriverWait(driver, 10)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input [@placeholder='Фамилия']")));
        Carta8.sendKeys(Keys.BACK_SPACE);
        Carta8.sendKeys("Harkevich");


        WebElement Carta9 = new WebDriverWait(driver, 10)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input [@placeholder='Адрес']")));
        Carta9.sendKeys(Keys.BACK_SPACE);
        Carta9.sendKeys("Могилевская обаласть,город Круглое, ул.Гагарина");

        WebElement Carta10 = new WebDriverWait(driver, 10)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input [@placeholder='Почтовый индекс']")));
        Carta10.sendKeys(Keys.BACK_SPACE);
        Carta10.sendKeys("213188");

        WebElement Carta11 = new WebDriverWait(driver, 10)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input [@placeholder='Город']")));
        Carta11.sendKeys(Keys.BACK_SPACE);
        Carta11.sendKeys("Круглое");

        WebElement Carta12 = new WebDriverWait(driver, 10)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@placeholder='Телефон']")));
        Carta12.sendKeys(Keys.BACK_SPACE);
        Carta12.sendKeys("88005353525");

        WebElement Carta13 = new WebDriverWait(driver, 10)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@name='button']")));
        Carta13.click();

        WebElement Carta14 = new WebDriverWait(driver, 10)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@name='button']")));
        Carta14.click();


        WebElement Carta15 = new WebDriverWait(driver, 10)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//label[@class='radio__label content-box__emphasis'and @for='checkout_different_billing_address_true']")));
        Carta15.click();

    }

   // @Test
    public void test6() throws Exception {
        WebDriver driver = new OperaDriver();
        driver.get("https://granmoto.ru");

        WebElement Sub = new WebDriverWait(driver, 10)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input [@class='text required']")));
        Sub.click();

        WebElement Sub2 = new WebDriverWait(driver, 10)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input [@class='text required']")));
        Sub2.sendKeys(Keys.BACK_SPACE);
        Sub2.sendKeys("matew01@mail.ru");

        WebElement Sub3 = new WebDriverWait(driver, 10)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button [@type='submit' and text()='Подписаться']")));
        Sub3.click();

    }
       // @Test
        public void test7 () throws Exception {
            WebDriver driver = new OperaDriver();
            driver.get("https://triumph.granmoto.ru");
            WebElement Ekipirovka = new WebDriverWait(driver, 10)
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//header[@class='headroom-disabled']//child::a[text()='Экипировка и тюнинг']")));
            Ekipirovka.click();
            WebElement e1 = new WebDriverWait(driver, 10)
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()='ПОСМОТРЕТЬ ЭКИПИРОВКУ']")));
            e1.click();
            WebElement e2 = new WebDriverWait(driver, 10)
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()='Ботинки мужские']")));
            e2.click();
            WebElement e3 = new WebDriverWait(driver, 10)
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()='Ботинки RSD Fresno gum']")));
            e3.click();
            WebElement e4 = new WebDriverWait(driver, 10)
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='quantity']")));
            e4.sendKeys(Keys.BACK_SPACE);
            e4.sendKeys("50");

            WebElement e5 = new WebDriverWait(driver, 10)

                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@type='submit'and text()='В корзину']")));

            e5.click();
            new WebDriverWait(driver, 10).until(CustomConditions.jQueryAJAXsCompleted());
        }

       // @Test
        public void test8 () throws Exception {
            WebDriver driver = new OperaDriver();
            driver.get("https://triumph.granmoto.ru");
            WebElement Ekipirovka = new WebDriverWait(driver, 10)
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//header[@class='headroom-disabled']//child::a[text()='Экипировка и тюнинг']")));
            Ekipirovka.click();
            WebElement e1 = new WebDriverWait(driver, 10)
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()='ПОСМОТРЕТЬ ЭКИПИРОВКУ']")));
            e1.click();
            WebElement e2 = new WebDriverWait(driver, 10)
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()='Ботинки мужские']")));
            e2.click();
            WebElement e3 = new WebDriverWait(driver, 10)
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()='Ботинки RSD Fresno gum']")));
            e3.click();
            WebElement e4 = new WebDriverWait(driver, 10)
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='quantity']")));
            e4.sendKeys(Keys.BACK_SPACE);
            e4.sendKeys("3,4");

            WebElement e5 = new WebDriverWait(driver, 10)

                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@type='submit'and text()='В корзину']")));

            e5.click();
            new WebDriverWait(driver, 10).until(CustomConditions.jQueryAJAXsCompleted());
            WebElement e6 = new WebDriverWait(driver, 10)
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span [@class='title']")));
            e6.click();
            WebElement e7 = new WebDriverWait(driver, 10)
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@class='remove toggler']")));
            e7.click();
            Alert alert = driver.switchTo().alert();
            alert.accept();
            WebElement e8 = new WebDriverWait(driver, 10)
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div [@class='']")));
            String itogK = e8.getText();
            String itoggK = "Ваша корзина пуста.";
            System.out.print(itogK);
            Assert.assertTrue("mgd", itoggK.equals(itogK));


        }
        //@Test
        public void test9 () throws Exception {
            WebDriver driver = new OperaDriver();
            driver.get("https://granmoto.ru");

            WebElement Propysk = new WebDriverWait(driver, 10)
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@class=\"product-block-title\"and text()='Hedon Hedonist Creme']")));
            Propysk.click();
            WebElement Propysk1 = new WebDriverWait(driver, 10)
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//select [@id]")));
            Propysk1.click();

            WebElement Propysk2 = new WebDriverWait(driver, 10)
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//option [@value='M']")));
            Propysk2.click();
            WebElement Propysk3 = new WebDriverWait(driver, 10)
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@name='add']")));
            Propysk3.click();

            new WebDriverWait(driver, 10).until(CustomConditions.jQueryAJAXsCompleted());
            WebElement Propysk4 = new WebDriverWait(driver, 10)
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@class='title']")));
            Propysk4.click();
            WebElement Propysk5 = new WebDriverWait(driver, 10)
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div [@class='checkout-row']")));
            Propysk5.click();

            WebElement Propysk6 = new WebDriverWait(driver, 10)
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input [@placeholder='Email']")));
            Propysk6.sendKeys(Keys.BACK_SPACE);
            Propysk6.sendKeys("matew01@mail.ru");

            WebElement Propysk7 = new WebDriverWait(driver, 10)
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input [@placeholder='Имя']")));
            Propysk7.sendKeys(Keys.BACK_SPACE);
            Propysk7.sendKeys("Matvei");

            WebElement Propysk8 = new WebDriverWait(driver, 10)
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input [@placeholder='Фамилия']")));
            Propysk8.sendKeys(Keys.BACK_SPACE);
            Propysk8.sendKeys("Harkevich");


            WebElement Propysk9 = new WebDriverWait(driver, 10)
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input [@placeholder='Адрес']")));
            Propysk9.sendKeys(Keys.BACK_SPACE);
            Propysk9.sendKeys("Могилевская обаласть,город Круглое, ул.Гагарина");

            WebElement Propysk10 = new WebDriverWait(driver, 10)
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input [@placeholder='Почтовый индекс']")));
            Propysk10.sendKeys(Keys.BACK_SPACE);
            Propysk10.sendKeys("213188");

            WebElement Propysk11 = new WebDriverWait(driver, 10)
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input [@placeholder='Город']")));
            Propysk11.sendKeys(Keys.BACK_SPACE);
            Propysk11.sendKeys("Круглое");

            WebElement Propysk12 = new WebDriverWait(driver, 10)
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@name='button']")));
            Propysk12.click();
            WebElement Propysk13 = new WebDriverWait(driver, 10)
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p [@class='field__message field__message--error']")));
            String itogPropysk = Propysk13.getText();
            String itoggPropysk = "Пожалуйста, введите свой номер телефона";
            System.out.print(itogPropysk);
            Assert.assertTrue("mgd", itoggPropysk.equals(itogPropysk));

        }
        //@Test
        public void test10 () throws Exception {
            WebDriver driver = new OperaDriver();
            driver.get("https://granmoto.ru");

            WebElement Kaska = new WebDriverWait(driver, 10)
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@class=\"product-block-title\"and text()='Hedon Hedonist Creme']")));
            Kaska.click();
            WebElement k = new WebDriverWait(driver, 10)
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//select [@id]")));
            k.click();

            WebElement k2 = new WebDriverWait(driver, 10)
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//option [@value='M']")));
            k2.click();
            WebElement k3 = new WebDriverWait(driver, 10)
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@name='add']")));
            k3.click();

            new WebDriverWait(driver, 10).until(CustomConditions.jQueryAJAXsCompleted());
            WebElement k4 = new WebDriverWait(driver, 10)
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@class='title']")));
            k4.click();
            WebElement k5 = new WebDriverWait(driver, 10)
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@class='remove toggler']")));
            k5.click();
            Alert alert = driver.switchTo().alert();
            alert.accept();
            WebElement k6 = new WebDriverWait(driver, 10)
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div [@class='']")));
            String itogK = k6.getText();
            String itoggK = "Ваша корзина пуста.";
            System.out.print(itogK);
            Assert.assertTrue("mgd", itoggK.equals(itogK));

    }

}

