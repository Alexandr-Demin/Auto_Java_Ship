package pages.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static common.Config.EXPLICIT_WAIT;
import static common.Config.IMPLICIT_WAIT;

public class BasePage {
    protected WebDriver driver;
    public BasePage (WebDriver driver){
        this.driver = driver;

    }
    public void open(String url){
        driver.get(url);
    }
    public WebElement waitElementWisible(WebElement element){
        new WebDriverWait(driver,Duration.ofSeconds(IMPLICIT_WAIT)).until(ExpectedConditions.visibilityOf(element));
        return element;
    }




}
