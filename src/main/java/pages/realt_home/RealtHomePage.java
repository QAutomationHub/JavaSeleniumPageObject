package pages.realt_home;

import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.base.BasePage;

public class RealtHomePage extends BasePage {

    public RealtHomePage(WebDriver driver) {
        super(driver);
    }

    private final By countRooms = By.id("rooms");
    private final By optionToRooms = By.xpath("//select[@id='rooms']/option[@value='2']");
    private final By findBtn = By.xpath("//a[@class='common-search-submit btn btn-primary']");


    public RealtHomePage enterCountRooms(){
        driver.findElement(countRooms).click();
        driver.findElement(optionToRooms).click();
        return this;
    }

    public RealtHomePage clickToFind(){
        waitElementIsVisible(driver.findElement(findBtn)).click();
        return this;
    }



}
