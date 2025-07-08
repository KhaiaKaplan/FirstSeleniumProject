package HomeWorkProjectTests.tests;

import HomeWorkProjectTests.core.TestBase;
import com.HomeWorkProject.models.User;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends TestBase {

    @Test(priority = 1)
    public void loginRegisteredUserPositiveTest() {

        app.getUser().clickOnLoginLink();
        app.getUser().fillLoginRegisterForm(new User()
                .setEmail("annakay@gmail.com")
                .setPassword("Anna4077!"));
        app.getUser().clickOnLoginButton();
        Assert.assertTrue(app.getUser().isSignOutButtonPresent());
    }

}
