package PageTests;

import base.CommonAPi;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginPageTest extends CommonAPi {

    @Test
    public void verifyLogin(){
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.login();
    }





}
