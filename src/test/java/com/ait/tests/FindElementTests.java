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

public class FindElementTests {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://ilcarro.web.app");
        //maximize browser  to window
        driver.manage().window().maximize();
        // driver.manage().window().setSize(new Dimension(900,400));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //  driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void findElementByTagName() {
        //find element by tag name -> h1
        WebElement title = driver.findElement(By.tagName("h1"));
        System.out.println(title.getText());

        //find list of elements by tag name -> a
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());
    }

    @Test
    public void findElementByOtherLocators() {
        //id
        driver.findElement(By.id("city"));
        driver.findElement(By.id("dates"));
        //className
        WebElement search = driver.findElement(By.className("navigation-link"));
        System.out.println(search.getText());
        WebElement phone = driver.findElement(By.className("telephone"));
        System.out.println(phone.getText());
        System.out.println(phone.getDomAttribute("class"));
        //linkText
        WebElement text = driver.findElement(By.linkText("Let the car work"));
        System.out.println(text.getText());
        //partialLinkText
        WebElement text2 = driver.findElement(By.partialLinkText("work"));
        System.out.println(text2.getText());
    }

    @Test
    public void findElementByCssSelector() {
        //tagName=h1 -> css=h1
        //WebElement title = driver.findElement(By.tagName("h1"));
        WebElement title = driver.findElement(By.cssSelector("h1"));
        System.out.println(title.getText());

        //id=city -> css= #city
        //driver.findElement(By.id("city"));
        driver.findElement(By.cssSelector("#city"));

        //className=navigation-link  -> css=.navigation-link
        //   WebElement search = driver.findElement(By.className("navigation-link"));
        WebElement search = driver.findElement(By.cssSelector(".navigation-link"));
        System.out.println(search.getText());

        //[key='value']
        WebElement searchLink = driver.findElement(By.cssSelector("[href='/search']"));
        System.out.println(searchLink.getText());

        // contains -> *
        driver.findElement(By.cssSelector("[class*='offers']"));
        //start -> ^
        driver.findElement(By.cssSelector("[class^='special']"));
        //end on -> $
        driver.findElement(By.cssSelector("[class$='container']"));

        //composite cssSelector
        driver.findElement(By.cssSelector(".logo>img[alt='logo']"));

        driver.findElement(By.cssSelector(".search-container>.subtitle"));

        driver.findElement(By.cssSelector(".input-container #dates"));

        // <tag> or <class> or <id> or <pair>:nth-child(n)
        WebElement login = driver.findElement(By.cssSelector(".navigation-link:nth-child(6)"));
        System.out.println(login.getText());
    }

    @Test
    public void findElementByXpath() {
        //   //*[@attr='value']

        //tagName -> //tag
        //WebElement title = driver.findElement(By.cssSelector("h1"));
        WebElement title = driver.findElement(By.xpath("//h1"));
        System.out.println(title.getText());

        //id -> //tag[@id='value']
        // driver.findElement(By.cssSelector("#city"));
        driver.findElement(By.xpath("//input[@id='city']"));

        //className -> //tag[@class='value']
        // WebElement search = driver.findElement(By.cssSelector(".navigation-link"));
        WebElement search = driver.findElement(By.xpath("//*[@class='navigation-link']"));
        System.out.println(search.getText());

        // WebElement searchLink = driver.findElement(By.cssSelector("[href='/search']"));
        WebElement searchLink = driver.findElement(By.xpath("//*[@href='/search']"));
        System.out.println(searchLink.getText());

        //start -> //tag[starts-with(@attr,'startsValue')]
        //driver.findElement(By.cssSelector("[class^='special']"));
        driver.findElement(By.xpath("//*[starts-with(@class,'special')]"));

        //contains -> //tag[contains(text(),'text')]
        WebElement feedback = driver.findElement(By.xpath("//span[contains(text(),'Latest')]"));
        System.out.println(feedback.getText());

        driver.findElement(By.xpath("//*[contains(.,'Latest')]"));
        driver.findElement(By.xpath("//*[.=' Latest feedback from our customers ']"));

        //driver.findElement(By.cssSelector(".logo>img[alt='logo']"));
        driver.findElement(By.xpath("//*[@class='logo']/img[@alt='logo']"));

        //driver.findElement(By.cssSelector(".search-container>.subtitle"));
        driver.findElement(By.xpath("//*[@class='search-container']/*[@class='subtitle']"));

        //driver.findElement(By.cssSelector(".input-container #dates"));
        driver.findElement(By.xpath("//*[@class='input-container']//input[@id='dates']"));

        //WebElement login = driver.findElement(By.cssSelector(".navigation-link:nth-child(6)"));
        WebElement login = driver.findElement(By.xpath("//a[6]"));
        System.out.println(login.getText());
    }
}

//  cssSelector -> div>a        xpath -> //div/a
//   cssSelector -> div a         xpath -> //div//a

