package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.ContactUsPage;
import pages.LandingPage;
import pages.LoginPage;

public class Base {

    BrowserFactory browserFactory = new BrowserFactory();
    public final WebDriver driver = browserFactory.startBrowser("chrome", "https://ndosisimplifiedautomation.vercel.app/");
    public ContactUsPage contactUsPage = PageFactory.initElements(driver, ContactUsPage.class);
    public LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
    public LandingPage landingPage = PageFactory.initElements(driver, LandingPage.class);



}
