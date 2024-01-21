package pages.shiphappens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.adres.CreatPublickAdress;

import java.time.Duration;

public class Autorization extends CreatPublickAdress {
    public Autorization(WebDriver driver) {
        super(driver);
    }

    By userName = By.xpath("//input[@id= 'username']");
    By password = By.xpath("//input[@id= 'password']");
    By enterLogin = By.xpath("//button[@type= 'submit']");



    public Autorization autorizationSuperAdmin() {


        waitElementWisible(driver.findElement(userName));
        driver.findElement(userName).click();
        driver.findElement(userName).sendKeys("sadmin");

        driver.findElement(password).click();
        driver.findElement(password).sendKeys("123456");

        driver.findElement(enterLogin).click();

        return this;

    }
    public Autorization autorizationAdmin(){
        driver.findElement(userName).click();
        driver.findElement(userName).sendKeys("ad_1");

        driver.findElement(password).click();
        driver.findElement(password).sendKeys("123456");

        driver.findElement(enterLogin).click();
        return this;

    }
//    public Autorization autorizationLogist1(){
//        driver.findElement(userName).click();
//        driver.findElement(userName).sendKeys("lg_1");
//
//        driver.findElement(password).click();
//        driver.findElement(password).sendKeys("123456");
//
//        driver.findElement(enterLogin).click();
//        return this;
//
//    }
//    public Autorization autorizationLogist2() {
//        driver.findElement(userName).click();
//        driver.findElement(userName).sendKeys("lg_2");
//
//        driver.findElement(password).click();
//        driver.findElement(password).sendKeys("123456");
//
//        driver.findElement(enterLogin).click();
//        return this;
//    }


}
