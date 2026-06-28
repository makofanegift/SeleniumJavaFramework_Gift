package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class LoginPage {

    WebDriver driver;

    By loginMainButton_xpath = By.xpath("//div[@class = 'nav-user-section']/button/span[contains(text(), 'Login')]");
    By userNameField_id = By.id("login-email");
    By loginSubmissionButton_id = By.id("login-submit");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }
    public void clickMainLoginButton(){
        driver.findElement(loginMainButton_xpath).click();
    }
    public void enterUserNameFiled (String username){
        driver.findElement(userNameField_id).clear();
        driver.findElement(userNameField_id).sendKeys(username);
    }
    public void enterPasswordField (String password){
        WebElement usernameEmailFiled = driver.findElement(userNameField_id);
        WebElement passwordFiled = driver.findElement(with(By.tagName("input")).below(usernameEmailFiled));//relative locator feature. Web Element thta keeps on changing
        passwordFiled.clear();
        passwordFiled.sendKeys(password);
    }
    public void cliclLoginSubmissionButton (){
        driver.findElement(loginSubmissionButton_id).click();
    }


}
