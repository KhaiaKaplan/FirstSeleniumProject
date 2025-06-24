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

public class HomeWorkTestsCssSelector {

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
            driver.findElement(By.cssSelector("head"));
            List<WebElement> titles = driver.findElements(By.cssSelector("h2"));
            System.out.println(titles.size());

            driver.findElement(By.cssSelector("#bar-notification"));
            driver.findElement(By.cssSelector("#topcartlink"));

            WebElement logIn = driver.findElement(By.cssSelector(".ico-login"));
            System.out.println(logIn.getText());
            List<WebElement> cartLabels = driver.findElements(By.cssSelector(".cart-label"));
            System.out.println(cartLabels.size());

            WebElement link1 = driver.findElement(By.cssSelector("[href='/register']"));
            System.out.println(link1.getText());
            WebElement link2 = driver.findElement(By.cssSelector("[href='http://www.nopcommerce.com/']"));
            System.out.println(link2.getText());


            WebElement link3 = driver.findElement(By.cssSelector(".top-menu [href='/apparel-shoes']"));
            System.out.println(link3.getText());
            WebElement link4 = driver.findElement(By.cssSelector(".top-menu [href='/digital-downloads']"));
            System.out.println(link4.getText());

        }
}
