package com.saucetest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.utils.CsvDataProvider;


public class LoadData extends BasePage
{
    @FindBy(id="first-name")
    WebElement firstNameField;
    @FindBy(id="last-name")
    WebElement lastNameField;
    @FindBy(id="postal-code")
    WebElement postalCodeField;
    @FindBy(id="continue")
    WebElement buttonContinue;
    @FindBy(id="finish")
    WebElement buttonFinish;


    public LoadData(WebDriver driver)
    {
        super(driver);
    }

    public void loadData()
    {
        Object[][] data = CsvDataProvider.csvDataProvider();
        typeOnField(firstNameField, ((String)(data[0][0])));
        typeOnField(lastNameField, ((String)(data[0][1])));
        typeOnField(postalCodeField, ((String)(data[0][2])));
        clickOnElement(buttonContinue);
        clickOnElement(buttonFinish);
    }
}