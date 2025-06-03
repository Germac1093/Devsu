package com.saucetest;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class BasePage
{
    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage()
    {}

    public BasePage(WebDriver driver)
    {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }

    //Esperar hasta que el elemento sea visible
    protected void waitVisibilityElement(WebElement element)
    {
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    //Hacer click en un elemento clickeable
    protected void clickOnElement(WebElement element)
    {
        waitForClickability(element);
        element.click();
    }

    //Esperar hasta que un elemento sea clickeable
    protected void waitForClickability(WebElement element)
    {
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    //Tipear texto en un campo de entrada
    protected void typeOnField(WebElement element, String text)
    {
        waitVisibilityElement(element);
        element.clear();
        element.sendKeys(text);
    }

    //Obtener texto de un elemento
    protected String getTextOfElement(WebElement element)
    {
        waitVisibilityElement(element);
        return element.getText();
    }

    //Navegar hasta una pagina
    protected void navigateTo(String url)
    {
        driver.get(url);
    }

}