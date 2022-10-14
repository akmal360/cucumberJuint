Feature: Uber Booking Feature

  Scenario: Booking Cab
    Given User wnats to select a car type "sedan" from uber app
    When User select car "saden" and pick up point "banglore" and drop location "pune"
    Then Driver starts the journey
    And Driver ends the journey
    Then User pays 1000 USD
