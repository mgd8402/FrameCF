package page;
import org.openqa.selenium.support.ui.ExpectedConditions;
import service.ProductCreator;
import model.Product;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage extends Page {

    private static final String MAIN_PAGE_URL = "https://triumph.granmoto.ru";

    @FindBy(xpath ="//a[text()='ПОСМОТРЕТЬ ЭКИПИРОВКУ']")
    private WebElement ekipirovkaWath;




    public ProductPage(WebDriver driver) {
        super(driver);
    }



    public CatalogPage chooseCategory(){
        new WebDriverWait(driver, TIMEOUT)
                .until(jQueryAJAXCompleted());
        actions.moveToElement(ekipirovkaWath).build().perform();
        ekipirovkaWath.click();
        return new CatalogPage(driver);
    }

}
