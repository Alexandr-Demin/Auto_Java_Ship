package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;


import java.util.concurrent.TimeUnit;

import static common.Config.IMPLICIT_WAIT;
import static common.Config.PLATFORM_AND_BROWSER;



public class CommonAction {
    private static WebDriver driver = null;

    private CommonAction(){
    }
    public static WebDriver createDriver() {         /// Дергаем драйвер отсюда через класс в базовый класс тестов (BaseTest)
        if (driver == null) {
            switch (PLATFORM_AND_BROWSER) {
                case "win_chrome":
                    System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
                    driver = new ChromeDriver();
                    break;
                default:
                    Assert.fail("Некоректная платформа или браузер " + PLATFORM_AND_BROWSER);
            }
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT, TimeUnit.SECONDS);
        }
        return driver;

    }
    }
