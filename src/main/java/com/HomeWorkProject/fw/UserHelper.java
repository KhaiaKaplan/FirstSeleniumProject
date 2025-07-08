package com.HomeWorkProject.fw;

import com.HomeWorkProject.core.BaseHelper;
import com.HomeWorkProject.models.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserHelper extends BaseHelper {
    public UserHelper(WebDriver driver) {
        super(driver);
    }

    public void fillLoginRegisterForm(User user) {
        type(By.className("email"), user.getEmail());
        type(By.className("password"), user.getPassword());
    }

    public boolean isSignOutButtonPresent() {
        return isElementPresent(By.cssSelector("[href='/logout']"));
    }

    public void clickOnRegistrationButton() {
        click(By.name("register-button"));
    }

    public void clickOnLoginLink() {
        click(By.cssSelector("[href='/login']"));
    }

    public void clickOnLoginButton() {
        click(By.className("login-button"));
    }

    public void clickOnHomeLink() {
    }

    public boolean isRegistrationErrorPresent() {
        return isElementPresent(By.className("validation-summary-errors"));
    }

}
