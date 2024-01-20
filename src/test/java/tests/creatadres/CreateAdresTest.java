package tests.creatadres;

import org.testng.annotations.Test;
import tests.base.BaseTest;


public class CreateAdresTest extends BaseTest {
    @Test
    public void createPublickAdres(){

        basePage.open("http://45.8.248.89:5500/");

        autorization
                .autorizationSuperAdmin();

        creatPublickAdress
                .enterAdres()
                .creatPublickAdress()
                .enterSave()
                .addedRole();
   }
//    @Test
//    public void creatPublickAdresLocker(){
//       basePage.open("http://45.8.248.89:5500/");
//
//        autorization
//                .autorizationSuperAdmin();
//
//        creatPublickAdressLocker
//                .enterAdres()
//                .creatPublickAdress()
//                .enterSave()
//                .addedRole();
//
//    }

}
