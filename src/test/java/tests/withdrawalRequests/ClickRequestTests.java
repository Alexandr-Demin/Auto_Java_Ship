package tests.withdrawalRequests;
import org.testng.annotations.Test;
import tests.base.BaseTest;

public class ClickRequestTests extends BaseTest {

    @Test
    public void ClickRequest(){
        basePage.open("http://81.163.27.121:5500/");

        autorization
                .autorizationSuperAdmin();

        cliclRequest
                .openRequestpage();

    }
}
