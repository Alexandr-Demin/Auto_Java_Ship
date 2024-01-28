package tests.creatadres;


import org.testng.annotations.Test;
import tests.base.BaseTest;


public class CreateAdresTest extends BaseTest {
    @Test
    public void createPublickAdres(){

        basePage.open("http://81.163.27.121:5500/");


        autorization
                .autorizationSuperAdmin();

        creatPublickAdress
                .enterAdres()
                .creatPublickAdress()
                .enterSave()
                .addedRole();
   }
    @Test
    public void creatPublickAdresLocker(){
       basePage.open("http://81.163.27.121:5500/");


        autorization
                .autorizationSuperAdmin();

        creatPublickAdressLocker
                .enterAdres()
                .creatPublickAdress()
                .enterSave()
                .addedRole();

    }
    @Test
    public void creatPublickAdresScoop(){
        basePage.open("http://81.163.27.121:5500/");


        autorization
                .autorizationSuperAdmin();

        creatPublickAdresScoop
                .enterAdres()
                .creatPublickAdress()
                .enterSave()
                .addedRole();

    }
    @Test
    public void creatPrivateAdres(){
        basePage.open("http://81.163.27.121:5500/");


        autorization
                .autorizationSuperAdmin();

        creatPrivateAdres
                .enterAdres()
                .creatPublickAdress()
                .enterSave()
                .addedRole();

    }
    @Test
    public void creatPrivateAdresLocker(){
        basePage.open("http://81.163.27.121:5500/");


        autorization
                .autorizationSuperAdmin();

        creatPrivateAdresLocker
                .enterAdres()
                .creatPublickAdress()
                .enterSave()
                .addedRole();

    }
    @Test
    public void creatPrivateAdresScoop(){
        basePage.open("http://81.163.27.121:5500/");


        autorization
                .autorizationSuperAdmin();

        creatPrivateAdresScoop
                .enterAdres()
                .creatPublickAdress()
                .enterSave()
                .addedRole();

    }
    @Test
    public void createPrivateGroupAdres(){
        basePage.open("http://81.163.27.121:5500/");


        autorization
                .autorizationSuperAdmin();

        createPrivateGroupAdres
                .enterAdres()
                .creatPublickAdress()
                .enterSave()
                .addedRole();

    }
    @Test
    public void createPrivateGroupLocker(){
        basePage.open("http://81.163.27.121:5500/");


        autorization
                .autorizationSuperAdmin();

        createPrivateGroupLocker
                .enterAdres()
                .creatPublickAdress()
                .enterSave()
                .addedRole();

    }
    @Test

    public void createPrivateGroupScoop(){
        basePage.open("http://81.163.27.121:5500/");


        autorization
                .autorizationSuperAdmin();

        createPrivateGroupScoop
                .enterAdres()
                .creatPublickAdress()
                .enterSave()
                .addedRole();

    }

}
