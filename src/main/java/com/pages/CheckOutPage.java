package com.pages;

import com.model.User;
import com.utils.CsvDataProvider;
import java.util.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOutPage extends BasePage {

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

    public CheckOutPage(WebDriver driver) {
        super(driver);
    }
    public void fillUserData() {
        List<User> users = CsvDataProvider.csvUserDataProvider();
        if (!users.isEmpty()) {
            User user = users.get(0);
            typeOnField(firstNameField, user.getFirstName());
            typeOnField(lastNameField, user.getLastName());
            typeOnField(postalCodeField, user.getPostalCode());
            clickOnElement(buttonContinue);
            clickOnElement(buttonFinish);
        }

    }
}

