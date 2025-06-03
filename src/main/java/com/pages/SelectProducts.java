package com.saucetest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class SelectProducts extends BasePage
{
    @FindBy(xpath = "(//button[text()='Add to cart'])[2]")
    private WebElement product1;
    @FindBy(xpath = "(//button[text()='Add to cart'])[3]")
    private WebElement product2;
    @FindBy(className ="shopping_cart_link")
    WebElement shoppingCart;
    @FindBy(id = "checkout")
    WebElement buttonCheckout;


    public SelectProducts(WebDriver driver)
    {
        super(driver);
    }

    public void selectProducts()
    {
        clickOnElement(product1);
        clickOnElement(product2);
        clickOnElement(shoppingCart);
        clickOnElement(buttonCheckout);
    }
}
