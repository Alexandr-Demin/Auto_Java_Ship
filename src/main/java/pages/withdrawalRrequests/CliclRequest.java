package pages.withdrawalRrequests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class CliclRequest extends BasePage {
    public CliclRequest(WebDriver driver) {
        super(driver);
    }

    By clickRequest = By.xpath("//*[@id=\"root\"]/div/section/aside/div/ul/li[8]/a");
    By clickID = By.cssSelector("#root > div > section > section > main > div > div > div.ant-pro-grid-content > div > div > div > div > div > div.antd-pro-components-standard-table-index-standardTable > div > div > div > div > div > div > table > tbody > tr:nth-child(1) > td:nth-child(1) > a");



    public CliclRequest openRequestpage(){
        waitElementWisible(driver.findElement(clickRequest));
        driver.findElement(clickRequest).click();
//        driver.findElement(clickID).click();
        return this;


    }
}
