package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LandingPage {
    WebDriver driver;

    By successfulLoginValidation = By.xpath("//div[@class = 'dashboard-welcome']/div/h2/span[contains(text(), 'Welcome')]");

    public LandingPage(WebDriver driver){
        this.driver = driver;
    }
    public void validateSuccessfulLoginPage(){
        //driver.findElement(successfulLoginValidation).isDisplayed();
        String validatesuccessfulLoginText =  driver.findElement(successfulLoginValidation).getText();
        Assert.assertEquals(validatesuccessfulLoginText, "Welcome");
    }

}
