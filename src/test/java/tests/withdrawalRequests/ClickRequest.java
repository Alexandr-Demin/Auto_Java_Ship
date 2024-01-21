package tests.withdrawalRequests;

import io.qase.api.annotation.QaseId;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.base.BasePage;
import tests.base.BaseTest;

public class ClickRequest extends BaseTest {

    @Test
    @QaseId(6)
    public void CliclRequest(){
        basePage.open("http://45.8.248.89:5500/");


        autorization
                .autorizationAdmin();

        cliclRequest
                .openRequest();

    }
}
