package pages.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static constants.Constant.TimeoutVariable.EXPLICIT_WAIT;


public class BasePage {

    protected WebDriver driver;

    // конструктор
    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    // метод открывает переданный url
    public void open(String url) {
        driver.get(url);
    }

    // метод для явных ожиданий, видимости элементов
    public WebElement waitElementIsVisible(WebElement element) {
        new WebDriverWait(driver, EXPLICIT_WAIT).until(ExpectedConditions.visibilityOf(element));
        return element;    }


}
