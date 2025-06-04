SauceDemo Test Automation - Selenium WebDriver + Java + TestNG

This project automates a functional end-to-end test on the https://www.saucedemo.com website using Selenium WebDriver, Java, and TestNG. It covers the full purchase flow from login to order confirmation.

=======================
PREREQUISITES
=======================
- Java 21.0.7
- Maven 3.9.6


=======================
KEY FEATURES
=======================
- Functional UI test automation using Selenium WebDriver
- TestNG framework for structure
- Data-driven testing with TestNG DataProvider
- Reusable utilities and Page Object Model (POM)
- Automatic screenshot capture at confirmation step
- Configurable browser and credentials via config.properties

=======================
The automated test performs the following actions:
=======================
- Login with valid username and password
- Add two products to the shopping cart
- View and verify the shopping cart contents
- Complete the checkout form with user details
- Finalize the purchase and verify confirmation message: "Thank you for your order"

=======================
FRAMEWORK STRUCTURE
=======================
- utils/: Reusable utility classes, like CsvDataProvider, WebDriverFactory, ScreenShot

- pages/: Page Object classes
        BasePage: Shared base methods
        CartPage: Manages cart interactions
        CheckoutPage: Manages the checkout process

- config/: config.properties file for environment configuration

- testdata/: DataProvider for dynamic input values

- tests/: BaseTest: Common setup and teardown
        SauceTest: Main end-to-end test

- screenshots/: Stores screenshots taken after test completion

=======================
RUNNING TESTS
=======================
To run the test:
-----  `mvn clean test`
Alternatively, if using the Maven wrapper:
-----   `mvnw clean test`

=======================
BROWSER COMPATIBILITY
=======================
The test has been validated on the following browsers:
        - Firefox
        - Microsoft Edge

Note:
On Google Chrome, the test may fail due to password warning popups from the browser, which can interfere with the automation process.

=======================
AUTHOR
=======================
Developed by: Gerardo Macias
Contact: geramacias3312@gmail.com
