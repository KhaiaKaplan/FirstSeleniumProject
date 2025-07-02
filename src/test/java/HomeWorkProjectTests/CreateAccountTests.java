package HomeWorkProjectTests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase {

    @Test
    public void newUserRegistrationPositiveTest() {
        click(By.cssSelector("[href='/register']"));
        click(By.id("gender-female"));
        type(By.id("FirstName"), "Anna");
        type(By.id("LastName"), "Kay");
        type(By.id("Email"), "annakay@gmail.com");
        type(By.id("Password"), "Anna4077!");
        type(By.id("ConfirmPassword"),"Anna4077!");
        click(By.name("register-button"));
        Assert.assertTrue(isElementPresent(By.xpath("//a[@href='/logout']")));
    }

    @Test
    public void existedUserRegistrationNegativeTest() {
        click(By.cssSelector("[href='/register']"));
        click(By.id("gender-female"));
        type(By.id("FirstName"), "Anna");
        type(By.id("LastName"), "Kay");
        type(By.id("Email"), "annakay@gmail.com");
        type(By.id("Password"), "Anna4077!");
        type(By.id("ConfirmPassword"),"Anna4077!");
        click(By.name("register-button"));
        Assert.assertTrue(isAlertPresent());
    }

}
