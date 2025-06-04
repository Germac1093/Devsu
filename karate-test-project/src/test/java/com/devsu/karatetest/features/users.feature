Feature: Sample API tests with Karate

Background:
    * url baseUrl
    * header Accept = 'application/json'
    * header Content-Type = 'application/json'
    * def randomUserNameJS = karate.call('classpath:com/devsu/karatetest/jsFunctions/createRandomUser.js')
    * def UtilsJava = Java.type('com.devsu.karate.utils.Utils')
    * def anotherRadomUserName = 'User' + UtilsJava.getRandomString(8)
    * print 'Random User Name: ' + randomUserNameJS
    * print 'Another Random User Name: ' + anotherRadomUserName

@CreateUser
Scenario: Create a new user
    Given path '/signup'
    * def user = { username: '#(randomUserNameJS)', password: 'SoftwareTester' }
    And request user
    When method POST
    Then status 200
    And match response contains '#string'

@LoginUser
Scenario: Login with existing user
    Given path '/login'
    * def user = call read('@CreateUser')
    And request user.user
    When method POST
    Then status 200
    And match response contains 'Auth_token'

@CreateUserWithExistingUsername
Scenario: Try to create a user with an existing username
    Given path '/signup'
    And request { username: 'User783107', password: 'AnotherPassword' }
    When method POST
    Then status 200
    And match response.errorMessage contains 'This user already exist'

@LoginWithWrongCredentials
Scenario Outline: Login with wrong credentials
    Given path '/login'
    * def createUserScenario = call read('@CreateUser')
    And request { 'username': '#(createUserScenario.user.username)', 'password': '#(password)' }
    When method POST
    Then status 200
    And match response.errorMessage contains 'Wrong password'
    Examples:
        | read('../data/data.csv') |
#        | password          |
#        | WrongPassword     |
#        | AnotherWrongPass  |
