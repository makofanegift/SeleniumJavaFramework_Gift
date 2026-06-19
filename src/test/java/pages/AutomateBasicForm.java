package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class AutomateBasicForm {

    WebDriver driver;

    @BeforeTest
    public void launchUrl() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://ndosisimplifiedautomation.vercel.app/");
        driver.manage().window().maximize();

    }
    @Test
    public void clickLoginTest(){
        driver.findElement(By.xpath("//*[@id=\"app-root\"]/nav/div[1]/div[3]/button")).click();
    }
    @Test (dependsOnMethods = "clickLoginTest")
    public void enterUsernameTest (){
        driver.findElement(By.xpath("//input[@id = 'login-email']")).sendKeys("gcmakofane@gmail.com");
    }
    @Test (dependsOnMethods = "enterUsernameTest")
    public void enterPasswordTest(){
        driver.findElement(By.xpath("//input[@id = 'login-password']")).sendKeys("Ndosi_TestSite1");
    }
    @Test(dependsOnMethods = "enterPasswordTest")
    public void loginToNdosiWebsiteTest() throws InterruptedException {
        driver.findElement(By.xpath("//button[@id = 'login-submit']")).click();
        Thread.sleep(7000);
    }
    @Test(dependsOnMethods = "loginToNdosiWebsiteTest")
    public void validateLoginTest(){
        String validateLoginText =   driver.findElement(By.xpath("//span[text() = 'back,']")).getText();
        System.out.println(validateLoginText);
        Assert.assertEquals(validateLoginText, "back,");
    }
    @Test(dependsOnMethods = "validateLoginTest")
    public void clickLearnTest(){
        driver.findElement(By.xpath("//span[text() = 'Learn']")).click();
    }
    @Test(dependsOnMethods = "clickLearnTest")
    public void clickLearningMaterials(){
        driver.findElement(By.xpath("//button[contains(@class, 'nav-dropdown-item ')]//span[text() = 'Learning Materials']")).click();
    }
    @Test(dependsOnMethods = "clickLearningMaterials")
    public void clickOnWebAutomationBasicFormTest(){
        driver.findElement(By.xpath("//button[@id = 'tab-btn-password']//span[text() = 'Web Automation Basic Form']")).click();
    }
//    @Test(dependsOnMethods = "clickOnWebAutomationBasicFormTest")
//    public void expandBasicFormRequirementTets(){
//        driver.findElement(By.xpath("//details[@id = 'basic-form-requirements']")).click();
//    }
    @Test(dependsOnMethods = "clickOnWebAutomationBasicFormTest")
    public void enterFullNameTest(){
        driver.findElement(By.xpath("//input[@id = 'name']")).sendKeys("Joseph Doe");
    }
    @Test(dependsOnMethods = "enterFullNameTest")
    public void enterEmailAddressTest(){
        driver.findElement(By.xpath("//input[@id = 'email']")).sendKeys("Joseph@test.com");
    }
    @Test(dependsOnMethods = "enterEmailAddressTest")
    public void enterAgeTest() throws InterruptedException {
        driver.findElement(By.xpath("//input[@id = 'age']")).sendKeys("24");
        Thread.sleep(1000);
    }
    @Test(dependsOnMethods = "enterAgeTest")
    public void selectGenderFromDropdownTest(){
        WebElement genderDropdownElement = driver.findElement(By.xpath("//select[@name = 'gender']"));
        Select genderDropdown = new Select(genderDropdownElement);
        genderDropdown.selectByValue("male");

    }
    @Test(dependsOnMethods = "selectGenderFromDropdownTest")
    public void selectCountryFromDropdownTest(){
        WebElement countryDropdownElement = driver.findElement(By.xpath("//select[@name = 'country']"));
        Select countryDropdown = new Select(countryDropdownElement);
        countryDropdown.selectByValue("south-africa");

    }
    @Test(dependsOnMethods = "selectCountryFromDropdownTest")
    public void selectExperienceLevelFromDropdownTest(){
        WebElement experienceLevelDropdownElement = driver.findElement(By.xpath("//select[@name = 'experience']"));
        Select experienceLevelDropdown = new Select(experienceLevelDropdownElement);
        experienceLevelDropdown.selectByValue("intermediate");

    }
    @Test (dependsOnMethods = "selectExperienceLevelFromDropdownTest")
    public void selectSkillsTest(){
        driver.findElement(By.xpath("//input[@id = 'skill-javascript']")).click();
        driver.findElement(By.xpath("//input[@id = 'skill-selenium']")).click();

    }
    @Test (dependsOnMethods = "selectSkillsTest")
    public void enterCommentTest(){
        driver.findElement(By.xpath("//textarea[@name = 'comments']")).sendKeys("Test automation practice");
    }
    @Test(dependsOnMethods = "enterCommentTest")
    public void subscribeToNewsletterTest(){
        driver.findElement(By.xpath("//input[@id = 'newsletter']")).click();
    }
    @Test (dependsOnMethods = "subscribeToNewsletterTest")
    public void acceptTCsTest(){

        driver.findElement(By.xpath("//input[@id = 'terms']")).click();
    }
    @Test(dependsOnMethods = "acceptTCsTest")
    public void clickValidateTest(){

        driver.findElement(By.xpath("//button[@id = 'validate-btn']")).click();
    }
    @Test(dependsOnMethods = "clickValidateTest")
    public void clickOnSubmitFormTest() throws InterruptedException {
        driver.findElement(By.xpath("//button[@id = 'submit-btn']")).click();
        Thread.sleep(5000);
    }
    @Test(dependsOnMethods = "clickOnSubmitFormTest")
    public void submissioButtonTest(){
          driver.findElement(By.xpath("//button[@id = 'submissions-toggle-btn']")).click();
    }
    @Test(dependsOnMethods = "submissioButtonTest")
    public void viewOnSubmission(){
        driver.findElement(By.xpath("//button[@id = 'view-submission-0']")).click();
    }
    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }

}
