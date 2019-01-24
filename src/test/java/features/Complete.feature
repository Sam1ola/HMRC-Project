@FunctionalTest
Feature: Registration, add to Cart and re-log in to check

@CreateAccount
  Scenario Outline: Positive Test creating an account
    Given I Initialize the browser with Chrome and Navigate to "http://automationpractice.com/index.php" Site
    And click on sign in button and land on Authentication page
    When I enter my email <username> and click on create account,Registration page is displayed
    And I enter the required personal information and click Register
    Then My account is successfully created and my account page is displayed


    Examples:
      |username               |password  |
      |jamesade15@outlook.com |Blackgold1|

@AddToCart
    Scenario Outline:  Add Dress to Cart
    Given I Initialize the browser with Chrome and Navigate to "http://automationpractice.com/index.php" Site
    And click on sign in button and land on Authentication page
    When I enter my <username> and <password> and click sign in
    And I Successfully logged in, selected Dresses and Evening Dresses and click on add to cart
    Then Item is then Displayed in cart




    Examples:
      |username               |password  |
      |jamesade15@outlook.com |Blackgold1|


@CheckCart
  Scenario Outline: Check Cart
    Given I Initialize the browser with Chrome and Navigate to "http://automationpractice.com/index.php" Site
    And click on sign in button and land on Authentication page
    When I enter my <username> and <password> and click sign in
    Then I Successfully logged in to check my cart but empty cart displayed



    Examples:
      |username               |password  |
      |jamesade15@outlook.com |Blackgold1|
