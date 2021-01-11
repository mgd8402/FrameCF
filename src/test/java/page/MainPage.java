package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage extends Page {

    private static final String MAIN_PAGE_URL = "https://triumph.granmoto.ru";

    @FindBy(xpath ="//section//child::a[text()='Экипировка и тюнинг']")
    private WebElement ekipirovkaButton;


    public MainPage(WebDriver driver) {
        super(driver);
    }

    public MainPage openURL()
    {
        this.driver.get(MAIN_PAGE_URL);
        new WebDriverWait(driver, TIMEOUT)
                .until(jQueryAJAXCompleted());
        return this;
    }

    public ProductPage goToEkip(){
        ekipirovkaButton.click();
        return new ProductPage(driver);
    }


}
