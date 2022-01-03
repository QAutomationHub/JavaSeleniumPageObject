package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.base.BasePage;

import java.util.ArrayList;

public class Methods extends BasePage {
    public Methods(WebDriver driver) {
        super(driver);
    }


    public Methods compareAtribute  (ArrayList<String> xpath, String attribute, String comparedValue) {
        for (int i = 0; i < xpath.size(); i++) {
            By locator = By.xpath(xpath.get(i));
            String getCss = driver.findElement(locator).getCssValue(attribute);
            System.out.println(attribute + ": " + getCss);
            Assert.assertEquals(getCss, comparedValue);
        }
        return this;
    }

}
