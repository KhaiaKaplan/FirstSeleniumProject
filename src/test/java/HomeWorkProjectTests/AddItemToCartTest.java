package HomeWorkProjectTests;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddItemToCartTest extends TestBase{

    @BeforeMethod
    public void precondition() {
        clickOnLoginLink();
        fillLoginRegisterForm(new User()
                .setEmail("annakay@gmail.com")
                .setPassword("Anna4077!"));
        clickOnLoginButton();
    }

    @Test
    public void AddItemToCart() {
        click(By.xpath("(//div[contains(@class,'product-item')]//input[@value='Add to cart'])[2]"));
        click(By.id("topcartlink"));
        Assert.assertTrue(isItemAddedToCartByText("14.1-inch Laptop"));
    }

}
