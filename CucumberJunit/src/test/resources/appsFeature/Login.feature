Feature: Login Freature

  Scenario Outline: Login failed - possible combinations
    Given user is on Application landing page
    When user click on the Sign In button
    Then user is displayed login screen
    When user enters "<UserName>" is username field
    And user enters "<Password>" in password field
    And user clicks Sign In button
    Then user gets login failed error message

    Examples: 
      | UserName          | Password          |
      | incorrectuserName |             12345 |
      | correctuserName   | incorrectPassword |
      | incorrectUsername | incorrectPassword |
