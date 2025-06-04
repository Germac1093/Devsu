package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.utils.CsvDataProvider;


public class CartPage extends BasePage
{
    @FindBy(id="continue-shopping")
    WebElement continueShoppingButton;
    @FindBy(id="checkout")
    WebElement checkoutButton;
    @FindBy(className = "shopping_cart_link")
    WebElement shoppingCart;

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public void continueShopping() {
        clickOnElement(continueShoppingButton);
    }

    public void proceedToCheckout() {
        clickOnElement(shoppingCart);
        clickOnElement(checkoutButton);
    }

    public void selectTowProducts(String product1, String product2)
    {
       WebElement element1 = driver.findElement(By.id("add-to-cart-" + product1.toLowerCase().replace(" ", "-")));
       WebElement element2 = driver.findElement(By.id("add-to-cart-" + product2.toLowerCase().replace(" ", "-")));
       clickOnElement(element1);
       clickOnElement(element2);
    }

    public void removeItemFromCart(String productName) {
        WebElement removeButton = driver.findElement(
                By.id("remove-" + productName.toLowerCase().replace(" ", "-")));
        clickOnElement(removeButton);
    }

}