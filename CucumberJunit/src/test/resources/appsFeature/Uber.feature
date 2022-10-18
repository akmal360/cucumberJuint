Feature: Uber Booking Feature

  @Smoke
  Scenario: Booking Cab sadan
    Given User wnats to select a car type "sedan" from uber app
    When User select car "saden" and pick up point "banglore" and drop location "pune"
    Then Driver starts the journey
    And Driver ends the journey
    Then User pays 1000 USD

  @Regression
  Scenario: Booking Cab suv
    Given User wnats to select a car type "suv" from uber app
    When User select car "saden" and pick up point "banglore" and drop location "pune"
    Then Driver starts the journey
    And Driver ends the journey
    Then User pays 1000 USD

  @Prod
  Scenario: Booking Cab mini
    Given User wnats to select a car type "mini" from uber app
    When User select car "saden" and pick up point "banglore" and drop location "pune"
    Then Driver starts the journey
    And Driver ends the journey
    Then User pays 1000 USD
