package HomeWorkProjectTests.tests;


import HomeWorkProjectTests.core.TestBase;
import com.HomeWorkProject.models.User;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddItemToCartTest extends TestBase {

    @BeforeMethod
    public void precondition() {
        app.getUser().clickOnLoginLink();
        app.getUser().fillLoginRegisterForm(new User()
                .setEmail("annakay@gmail.com")
                .setPassword("Anna4077!"));
        app.getUser().clickOnLoginButton();
    }

    @Test
    public void AddItemToCart() {
        app.getItem().click(By.xpath("(//div[contains(@class,'product-item')]//input[@value='Add to cart'])[2]"));
        app.getItem().click(By.id("topcartlink"));
        Assert.assertTrue(app.getItem().isItemAddedToCartByText("14.1-inch Laptop"));
    }

}
