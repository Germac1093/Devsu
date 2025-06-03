package com.pages;


import com.utils.ScreenShots;
import com.utils.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.File;

public class BaseTest {
    protected WebDriver driver;

    @BeforeClass
    public void setUp() {
        File folder = new File("screenshots");
        if (folder.exists() && folder.isDirectory()) {
            for (File file : folder.listFiles()) {
                if (!file.isDirectory()) {
                    file.delete();
                }
            }
        }
        driver = WebDriverFactory.getDriver();
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            ScreenShots.take(driver, "final_state");
            driver.quit();
        }
    }
}