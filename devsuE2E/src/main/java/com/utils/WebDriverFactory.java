package com.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.edge.EdgeOptions;

public class WebDriverFactory {

    private static WebDriver driver;

    public static WebDriver getDriver(String browser) {
        if (driver == null) {
            switch (browser.toLowerCase()) {
                case "chrome":
                    System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");

                    ChromeOptions chromeOptions = new ChromeOptions();
                    // Puedes configurar opciones aquí si quieres
                    // chromeOptions.addArguments("--headless");
                    driver = new ChromeDriver(chromeOptions);
                    break;

                case "firefox":
                    System.setProperty("webdriver.gecko.driver", "path/to/geckodriver.exe");

                    FirefoxOptions firefoxOptions = new FirefoxOptions();
                    // Configura opciones si deseas
                    driver = new FirefoxDriver(firefoxOptions);
                    break;

                case "edge":
                    System.setProperty("webdriver.edge.driver", "path/to/msedgedriver.exe");

                    EdgeOptions edgeOptions = new EdgeOptions();
                    // Configura opciones si deseas
                    driver = new EdgeDriver(edgeOptions);
                    break;

                default:
                    throw new IllegalArgumentException("Browser not supported: " + browser);
            }
        }
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
