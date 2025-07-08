package HomeWorkProjectTests.tests;

import HomeWorkProjectTests.core.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static com.HomeWorkProject.core.ApplicationManager.softAssert;

public class CreateAccountTests extends TestBase {

    @Test
    public void newUserRegistrationPositiveTest() {
        app.getUser().click(By.cssSelector("[href='/register']"));
        app.getUser().click(By.id("gender-female"));
        app.getUser().type(By.id("FirstName"), "Anna");
        app.getUser().type(By.id("LastName"), "Kay");
        app.getUser().type(By.id("Email"), "annakay@gmail.com");
        app.getUser().type(By.id("Password"), "Anna4077!");
        app.getUser().type(By.id("ConfirmPassword"),"Anna4077!");
        app.getUser().click(By.name("register-button"));
        Assert.assertTrue(app.getUser().isElementPresent(By.xpath("//a[@href='/logout']")));
    }

    @Test
    public void existedUserRegistrationNegativeTest() {
        app.getUser().click(By.cssSelector("[href='/register']"));
        app.getUser().click(By.id("gender-female"));
        app.getUser().type(By.id("FirstName"), "Anna");
        app.getUser().type(By.id("LastName"), "Kay");
        app.getUser().type(By.id("Email"), "annakay@gmail.com");
        app.getUser().type(By.id("Password"), "Anna4077!");
        app.getUser().type(By.id("ConfirmPassword"),"Anna4077!");
        app.getUser().clickOnRegistrationButton();
        softAssert.assertTrue(app.getUser().isRegistrationErrorPresent());
        softAssert.assertAll();
    }
}
