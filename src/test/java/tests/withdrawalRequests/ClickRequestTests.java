package tests.withdrawalRequests;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import org.testng.annotations.Test;
import tests.base.BaseTest;

import static io.qameta.allure.SeverityLevel.*;

public class ClickRequestTests extends BaseTest {

    @Test
    @Description("Открытие вкладки")
    @Severity(CRITICAL)
    public void ClickRequest(){
        basePage.open("http://81.163.27.121:5500/");

        autorization
                .autorizationSuperAdmin();

        cliclRequest
                .openRequestpage();

    }
}
