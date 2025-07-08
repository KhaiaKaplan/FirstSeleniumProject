package com.HomeWorkProject.fw;

import com.HomeWorkProject.core.BaseHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ItemHelper extends BaseHelper {
    public ItemHelper(WebDriver driver) {
        super(driver);
    }

    public boolean isItemAddedToCartByText(String text) {
        List<WebElement> items = driver.findElements(By.className("product-name"));
        for (WebElement el: items) {
            if (el.getText().contains(text))
                return true;
        }
        return false;
    }
}
