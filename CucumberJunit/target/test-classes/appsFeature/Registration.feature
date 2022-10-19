Feature: User Registration

  Scenario: user registration with different data
    Given user is on registration page
    When ueser enters following user details
      | Akmal | Gossain | akmalcode@hotmail.com | 762-217-9223 |
      | Bazee | Oossain | akmalcode@hotmail.com | 762-217-9223 |
      | Camze | Lossain | akmalcode@hotmail.com | 762-217-9223 |
    Then user registration should be successful login
