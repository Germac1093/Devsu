package com.saucetest;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.utils.ConfigReader;


public class LoginPage extends BasePage
{
    @FindBy(id="user-name")
    public WebElement inputUsername;
    @FindBy(id="password")
    public WebElement inputPassword;
    @FindBy(id="login-button")
    public WebElement loginButton;

    ConfigReader configProperties;


    public LoginPage(WebDriver driver)
    {
        super(driver);
        driver.manage().window().maximize();
        configProperties = new ConfigReader("config.properties");
    }

    public void login(String name, String password)
    {
        typeOnField(inputUsername, name);
        typeOnField(inputPassword, password);
        clickOnElement(loginButton);
    }


    public String getConfigProperties(String key)
    {
        return configProperties.getProperty(key);
    }


}
