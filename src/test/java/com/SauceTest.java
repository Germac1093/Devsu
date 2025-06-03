package com;

import com.pages.CartPage;
import com.pages.CheckOutPage;
import com.pages.LoginPage;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

public class SauceTest extends BaseTest {
    String product1 = "Sauce Labs Backpack";
    String product2 = "Sauce Labs Bike Light";

    private LoginPage loginPage;
    private CartPage cartPage;
    private CheckOutPage checkOutPage;

    @BeforeClass
    public void initializePages() {

        loginPage = new LoginPage(driver);
        cartPage = new CartPage(driver);
        checkOutPage = new CheckOutPage(driver);
    }

    @Test
    public void testApp() throws InterruptedException {
        loginPage.navigateTo(loginPage.getConfigProperties("url"));
        loginPage.login(loginPage.getConfigProperties("username"), loginPage.getConfigProperties("password"));
        cartPage.selectTowProducts(product1, product2);
        cartPage.proceedToCheckout();
        checkOutPage.fillUserData();

    }
}