package com.ait.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class HomeWorkTests {
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void findElementsTests(){
        driver.findElement(By.tagName("head"));
        List<WebElement> titles = driver.findElements(By.tagName("h2"));
        System.out.println(titles.size());

        driver.findElement(By.id("bar-notification"));
        driver.findElement(By.id("topcartlink"));

        WebElement logIn = driver.findElement(By.className("ico-login"));
        System.out.println(logIn.getText());
        List<WebElement> cartLabels = driver.findElements(By.className("cart-label"));
        System.out.println(cartLabels.size());

        WebElement text = driver.findElement(By.linkText("Register"));
        System.out.println(text.getText());
        WebElement text2 = driver.findElement(By.linkText("nopCommerce"));
        System.out.println(text2.getText());

        WebElement text3 = driver.findElement(By.partialLinkText("Shoes"));
        System.out.println(text3.getText());
        WebElement text4 = driver.findElement(By.partialLinkText("Digital"));
        System.out.println(text4.getText());

    }


}
