package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ProductsPage extends BasePage
{
    @FindBy(xpath = "(//button[text()='Add to cart'])[2]")
    private WebElement product1;
    @FindBy(xpath = "(//button[text()='Add to cart'])[3]")
    private WebElement product2;
    @FindBy(css = "#shopping_cart_container > a")
    WebElement shoppingCart;


    public ProductsPage(WebDriver driver)
    {
        super(driver);
    }

    public void addProductToCart(String productName)
    {
        WebElement product = driver.findElement(
                By.id( "add-to-cart-" + productName.toLowerCase().replace(" ", "-")));
        clickOnElement(product);
    }

    public void goToCart()
    {
        clickOnElement(shoppingCart);
    }
}
