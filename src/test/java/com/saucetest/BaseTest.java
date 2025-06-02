package com.saucetest;


import com.utils.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    protected WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Obtener el navegador desde una variable de entorno o argumento de línea de comandos
        String browser = System.getProperty("browser", "chrome"); // Default to chrome if not set
        driver = WebDriverFactory.getDriver(browser);
    }

//    @AfterClass
//    public void tearDown() {
//        if (driver != null) {
//            driver.quit();
//        }
//    }
}