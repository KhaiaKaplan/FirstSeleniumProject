package HomeWorkProjectTests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends TestBase{

    @Test(priority = 1)
    public void loginRegisteredUserPositiveTest() {

        clickOnLoginLink();
        fillLoginRegisterForm(new User()
                .setEmail("annakay@gmail.com")
                .setPassword("Anna4077!"));
        clickOnLoginButton();
        Assert.assertTrue(isSignOutButtonPresent());
    }

}
