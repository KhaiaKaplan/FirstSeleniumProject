package com.HomeWorkProject.core;

import com.HomeWorkProject.fw.HomePageHelper;
import com.HomeWorkProject.fw.ItemHelper;
import com.HomeWorkProject.fw.UserHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class ApplicationManager{

    String browser;
    WebDriver driver;
    public static SoftAssert softAssert;

    UserHelper user;
    ItemHelper item;
    HomePageHelper homePage;


    public ApplicationManager(String browser) {
        this.browser = browser;
    }

    public void init() {

        if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();}

        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        user = new UserHelper(driver);
        item = new ItemHelper(driver);
        homePage = new HomePageHelper(driver);

        softAssert = new SoftAssert();
    }

    public void stop() {
        driver.quit();
    }


    public UserHelper getUser() {
        return user;
    }

    public ItemHelper getItem() {
        return item;
    }

    public HomePageHelper getHomePage() {
        return homePage;
    }


}
