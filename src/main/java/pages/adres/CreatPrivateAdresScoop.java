package pages.adres;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class CreatPrivateAdresScoop extends BasePage {
    public CreatPrivateAdresScoop(WebDriver driver) {
        super(driver);
    }

    By btnAdres = By.xpath("//*[@id=\"root\"]/div/section/aside/div/ul/li[9]/a");
    By btnCreateAdres = By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/button");
    By btnSave = By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/form/div/div/button");


    //// Форма заполнения адреса

    By countryEmoji = By.cssSelector("input[id = 'country_emoji']");
    By name = By.cssSelector("input[id = 'name']");
    By location = By.cssSelector("input[id = 'location']");
    By lockerRadius = By.cssSelector("input[id = 'locker_radius']");
    By RbtnScoop = By.cssSelector("#scoop > label:nth-child(1) > span.ant-radio > input");
    By RbtnPrivate = By.cssSelector("#private > label:nth-child(1) > span.ant-radio > input");
    By RbtnSingleUser = By.cssSelector("#single_user > label:nth-child(1) > span.ant-radio > input");
    By RbtnLocker = By.cssSelector("#locker_available > label:nth-child(1) > span.ant-radio > input");
    By AssignManager = By.cssSelector("#root > div > section > section > main > div > div > div.ant-pro-grid-content > div > div > div.ant-tabs-bar.ant-tabs-top-bar.ant-tabs-default-bar > div > div > div > div > div:nth-child(1) > div:nth-child(3)");
    By addedAdmin = By.cssSelector("#root > div > section > section > main > div > div > div.ant-pro-grid-content > div > div > div.ant-tabs-content.ant-tabs-content-animated.ant-tabs-top-content > div.ant-tabs-tabpane.ant-tabs-tabpane-active > div:nth-child(2) > div > div > div > div.antd-pro-components-standard-table-index-standardTable > div > div > div > div > div > div > table > tbody > tr:nth-child(4) > td:nth-child(8) > a:nth-child(1)");
    By addedLogist = By.cssSelector("#root > div > section > section > main > div > div > div.ant-pro-grid-content > div > div > div.ant-tabs-content.ant-tabs-content-animated.ant-tabs-top-content > div.ant-tabs-tabpane.ant-tabs-tabpane-active > div:nth-child(2) > div > div > div > div.antd-pro-components-standard-table-index-standardTable > div > div > div > div > div > div > table > tbody > tr:nth-child(1) > td:nth-child(8) > a:nth-child(3)");
    public CreatPrivateAdresScoop enterAdres(){
        waitElementWisible(driver.findElement(btnAdres));
        driver.findElement(btnAdres).click();
        driver.findElement(btnCreateAdres).click();
        return this;
    }
    public CreatPrivateAdresScoop creatPublickAdress(){
        waitElementWisible(driver.findElement(countryEmoji));
        driver.findElement(countryEmoji).click();
        driver.findElement(countryEmoji).sendKeys("ru");
        driver.findElement(name).sendKeys("Приватный со скупом");
        driver.findElement(location).sendKeys("Address: ZIP: SE15 3SQ, CITY: London, STREET: 3 Magdalene close /// NAME: Chantal Fennell, PHONE: 07495773531");
        driver.findElement(RbtnScoop).click();
        driver.findElement(RbtnPrivate).click();
        driver.findElement(RbtnSingleUser).click();
        return this;
    }
    public CreatPrivateAdresScoop enterSave(){
        driver.findElement(btnSave).click();
        return this;

    }
    public CreatPrivateAdresScoop addedRole(){
        waitElementWisible(driver.findElement(AssignManager));
        driver.findElement(AssignManager).click();
        driver.findElement(addedAdmin).click();
        driver.findElement(addedLogist).click();
        return this;
    }
}
