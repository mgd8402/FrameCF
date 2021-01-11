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

public class KorzPage extends Page {



    @FindBy(xpath ="//a [@class='name']")
    private WebElement obj;


    public KorzPage(WebDriver driver) {
        super(driver);
    }


    public String check(){
        new WebDriverWait(driver, TIMEOUT)
                .until(jQueryAJAXCompleted());

        return obj.getText();
    }


}
