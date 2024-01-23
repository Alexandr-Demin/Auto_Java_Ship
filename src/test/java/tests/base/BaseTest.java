package tests.base;

import common.CommonAction;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import pages.adres.*;
import pages.base.BasePage;
import pages.shiphappens.Autorization;
import pages.withdrawalRrequests.CliclRequest;

import java.util.Set;

public class BaseTest {
    protected WebDriver driver = CommonAction.createDriver();
    protected BasePage basePage = new BasePage(driver);
    protected Autorization autorization = new Autorization(driver);
    protected CreatPublickAdress creatPublickAdress = new CreatPublickAdress(driver);
    protected CreatPublickAdressLocker creatPublickAdressLocker = new CreatPublickAdressLocker(driver);
    protected CreatPublickAdresScoop creatPublickAdresScoop = new CreatPublickAdresScoop(driver);
    protected CreatPrivateAdres creatPrivateAdres = new CreatPrivateAdres(driver);
    protected CreatPrivateAdresLocker creatPrivateAdresLocker = new CreatPrivateAdresLocker(driver);
    protected CreatPrivateAdresScoop creatPrivateAdresScoop = new CreatPrivateAdresScoop(driver);
    protected CreatePrivateGroupAdres createPrivateGroupAdres = new CreatePrivateGroupAdres(driver);
    protected CreatePrivateGroupLocker createPrivateGroupLocker = new CreatePrivateGroupLocker(driver);
    protected CreatPrivateGroupScoop createPrivateGroupScoop = new CreatPrivateGroupScoop(driver);
    protected CliclRequest cliclRequest = new CliclRequest(driver);

//    protected void switchWindow(){
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        String window1 = driver.getWindowHandle();
//        js.executeScript("window.open()");
//        Set<String> currentWindows = driver.getWindowHandles();
//        driver.findElement(By.linkText("new window")).click();
//        String window2 = null;
//        for(String window : currentWindows){
//            if(!window.equals(window1)){
//                window2 = window;
//                break;
//            }
//        }
//    }


    @AfterSuite(alwaysRun = true)
    public void quit() {
        driver.quit();
    }
}
