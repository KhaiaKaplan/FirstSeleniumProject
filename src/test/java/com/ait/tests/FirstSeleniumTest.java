package com.ait.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstSeleniumTest {

    WebDriver driver;

    //before - setUp
    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        //driver.get("https://www.google.com"); //without history
        driver.navigate().to("https://www.google.com"); // with history
        driver.navigate().back(); // key back
        driver.navigate().forward(); //key forward
        driver.navigate().refresh();
    }

    //test
    @Test
    public void openGoogle() {
        System.out.println("Google opened!");
    }

    //after - tearDown
    @AfterMethod(enabled = false)
    public void tearDown() {
        //driver.quit();// all tabs & close browser
        driver.close();// only one tab(if tab only one -> close browser)
    }

}