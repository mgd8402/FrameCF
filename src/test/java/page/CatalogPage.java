package page;

import model.Product;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import service.ProductCreator;

public class CatalogPage extends Page {



    @FindBy(xpath ="//input[@id='quantity']")
    private WebElement input;
    @FindBy(xpath ="//button[@type='submit'and text()='В корзину']")
    private WebElement cardButton;
    @FindBy(xpath ="//span [@class='title']")
    private WebElement card;


    public CatalogPage(WebDriver driver) {
        super(driver);
    }


    public KorzPage choiseAndGo(String count){

        new WebDriverWait(driver,10)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath( "//a[text()='Ботинки мужские']"))).click();
        new WebDriverWait(driver,10)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()='Ботинки RSD Fresno gum']"))).click();
        input.sendKeys(Keys.BACK_SPACE);
        Product product =new ProductCreator().getProduct(count);
        input.sendKeys("3");
        cardButton.click();
        new WebDriverWait(driver, TIMEOUT)
                .until(jQueryAJAXCompleted());
        card.click();
        return new KorzPage(driver);
    }


}
