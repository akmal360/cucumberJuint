Feature: Amazon Order Page
  In order to check my order details 
  As a registered user
  I want to specify the features of order details page

  Background: 
    Given a registered user exisrts and user is on Amazon page
    When user enters username
    And user enters password
    And user clickes on login button
    Then user navigates to order page

  Scenario: check previous order details
    When user clicks on order link
    Then user checks the previous order details

  Scenario: check open order details
    When user clicks on open orders link
    Then user checks open roder details

  Scenario: check cancelled order details
    When user clicks on cancelled orders link
    Then checks the cancelled order details
