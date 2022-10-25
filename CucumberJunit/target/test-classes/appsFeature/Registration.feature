Feature: User Registration

  Scenario: user registration with different data
    Given user is on registration page
    When ueser enters following user details
      | Akmal | Hossain | akmalcode@hotmail.com | 762-217-9223 |
      | Bazee | Oossain | akmalcode@hotmail.com | 762-217-9223 |
      | Camze | Lossain | akmalcode@hotmail.com | 762-217-9223 |
    Then user registration should be successful login

  Scenario: user registration with different data with row and column
    Given user is on registration page
    When user enters following user details with row and column
      | firstName | lastName | eMail              | phoneNumber  | cityName      |
      | Akmal     | Gossain  | max@hotmail.com    | 762-217-9223 | georgia       |
      | Naveen    | Oossain  | naveen@hotmail.com | 762-217-9223 | lawrenceville |
      | Pretom    | Lossain  | pretom@hotmail.com | 762-217-9223 | cumming       |
      | Areyan    | Hossain  | areyan@gmail.com   | 999-888-7777 | lawrenceville |
    Then user registration should be successful login
