package tests.base;

import common.CommonAction;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import pages.adres.*;
import pages.base.BasePage;
import pages.shiphappens.Autorization;
import pages.withdrawalRrequests.CliclRequest;

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


    @AfterSuite(alwaysRun = true)
    public void quit() {
        driver.quit();
    }
}
