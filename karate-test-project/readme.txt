Karate Test Project - DemoBlaze API

This project showcases my skills in API testing using the Karate framework. It includes test cases for multiple HTTP methods, data-driven testing, and HTML report generation.

=======================
PREREQUISITES
=======================
- Java 21.0.7
- Maven 3.9.6

=======================
KEY FEATURES
=======================
- REST API testing
- Data-driven testing using Scenario Outline and CSV files
- HTML report generation
- Support for multiple environments
- Use of Java and JavaScript inside test scripts

=======================
TEST SCENARIOS
=======================
The tests perform the following actions:

- Create a new user using the /signup endpoint
- Attempt to create a user that already exists
- Log in with correct username and password via /login
- Log in with incorrect username and/or password

=======================
RUNNING TESTS
=======================

To run all tests:

    `mvn clean test '-Dtest=KarateRunner'`

Alternatively

     `mvnw clean test '-Dtest=KarateRunner'`

To run tests with a specific tag (e.g., @CreateUser):

    mvn test -Dkarate.options="--tags @CreateUser" -Dtest=KarateRunner

=======================
TEST REPORTS
=======================
After execution, HTML reports can be found at:

    target/karate-reports/karate-summary.html

Detailed logs are available at:

    target/karate.log

=======================
API ENDPOINTS TESTED
=======================
- POST /signup - User registration
- POST /login - User login

=======================
CONFIGURATION
=======================
Main configuration file:

    src/test/java/karate-config.js

From this file you can:
- Change the base URL
- Set environment-specific configurations
- Adjust timeout settings
- Define global variables

=======================
AUTHOR
=======================
Developed by: Gerardo Macias
Contact: geramacias3312@gmail.com
