package com.saucetest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

public class SauceTest extends BaseTest {

    private LoginPage loginPage;
    private SelectProducts products;
    private LoadData loadUserData;

    @BeforeClass
    public void initializePages() {
        // Inicializa las páginas después de que el WebDriver ha sido configurado en BaseTest
        loginPage = new LoginPage(driver);
        products = new SelectProducts(driver);
        loadUserData = new LoadData(driver);
    }

    @Test
    public void testApp() {
        loginPage.navigateTo(loginPage.getConfigProperties("url"));
        loginPage.login(loginPage.getConfigProperties("username"), loginPage.getConfigProperties("password"));
        products.selectProducts();
        loadUserData.loadData();
    }
}