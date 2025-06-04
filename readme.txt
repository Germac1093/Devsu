 SAUCEDEMO TEST AUTOMATION

This project automates a functional test on the website https://www.saucedemo.com using Selenium WebDriver, Java, and TestNG.

TEST OBJECTIVE

The test performs the following steps:

Authenticate with username and password

Add two products to the cart.

view the shopping cart

complete the shopping form

finalize the purchase until confirmation: "Thank you for your order"

FRAMEWORK STRUCTURE

utils: Reusable utilities (e.g.,CsvDataProvider, WebDriverFactory, ScreenshotUtil)

pages:

BasePage: Base class with shared functions

CartPage: Handles the shopping cart

CheckoutPage: Handles checkout flow

config: config.properties for credentials and browser setup

testdata: DataProvider for input data

tests:

BaseTest: Common test setup/teardown

SauceTest: Main test logic

screenshots: Folder where the confirmation screenshot is stored

HOW TO RUN THE TEST

REQUIREMENTS:

Java version: 21.0.7

Maven version: 3.9.7

STEPS:

Ensure Java and Maven are installed and set up correctly.

Open a terminal and go to the root directory of the project.

Execute the following command:

`mvn clean test`

Alternative

`mvnw clean test` (maven wrapper)

BROWSER COMPATIBILITY

This test works correctly on:

Firefox

Edge

NOTE:
On Chrome, the test might fail because of Google's password warning popups (for weak or commonly known passwords), which interrupt the automation flow.

