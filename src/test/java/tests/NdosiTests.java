package tests;

import org.testng.annotations.Test;
import utils.Base;

public class NdosiTests extends Base {

    @Test
    public void contactUsTest(){
        contactUsPage.clickContactUsButton();
        contactUsPage.contactMethodText();
    }
    @Test
    public void loginPageTest() throws InterruptedException {
        loginPage.clickMainLoginButton();
        loginPage.enterUserNameFiled("gcmakofane@gmail.com");
        loginPage.enterPasswordField("Ndosi_TestSite1");
        loginPage.cliclLoginSubmissionButton();
        Thread.sleep(3000);

    }
    @Test (dependsOnMethods = "loginPageTest")
    public void loginValidationTest(){
        landingPage.validateSuccessfulLoginPage();
    }
}
