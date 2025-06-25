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

public class HomeWorkTestsXpath {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void findElementsByXpath() {
        driver.findElement(By.xpath("//head"));
        List<WebElement> titles = driver.findElements(By.xpath("//h2"));
        System.out.println(titles.size());

        driver.findElement(By.xpath("//div[@id='bar-notification']"));
        driver.findElement(By.xpath("//li[@id='topcartlink']"));

        WebElement logIn = driver.findElement(By.xpath("//*[@class='ico-login']"));
        System.out.println(logIn.getText());
        List<WebElement> cartLabels = driver.findElements(By.xpath("//*[@class='cart-label']"));
        System.out.println(cartLabels.size());

        WebElement link1 = driver.findElement(By.xpath("//*[@href='/register']"));
        System.out.println(link1.getText());
        WebElement link2 = driver.findElement(By.xpath("//*[@href='http://www.nopcommerce.com/']"));
        System.out.println(link2.getText());


        WebElement text1 = driver.findElement(By.xpath("//a[contains(text(),'Shoes')]"));
        System.out.println(text1.getText());
        WebElement text2 = driver.findElement(By.xpath("//a[contains(text(), 'Digital')]"));
        System.out.println(text2.getText());
    }
}
