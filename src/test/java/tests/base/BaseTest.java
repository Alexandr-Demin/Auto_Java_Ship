package tests.base;

import common.CommonAction;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import pages.adres.CreatPublickAdressLocker;
import pages.base.BasePage;
import pages.shiphappens.Autorization;
import pages.adres.CreatPublickAdress;

public class BaseTest {
    protected WebDriver driver = CommonAction.createDriver();
    protected BasePage basePage = new BasePage(driver);
    protected Autorization autorization = new Autorization(driver);
    protected CreatPublickAdress creatPublickAdress = new CreatPublickAdress(driver);
    protected CreatPublickAdressLocker creatPublickAdressLocker = new CreatPublickAdressLocker(driver);

    @AfterSuite(alwaysRun = true)
    public void quit() {
        driver.quit();
    }
}
