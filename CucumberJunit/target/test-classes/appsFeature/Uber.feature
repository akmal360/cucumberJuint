 Feature: Uber Booking Feature

  
  Scenario: Booking Cab sadan
    Given User wnats to select a car type "sedan" from uber app
    When User select car "saden" and pick up point "banglore" and drop location "pune"
    Then Driver starts the journey
    And Driver ends the journey
    Then User pays 1000 USD


  Scenario: Booking Cab suv
    Given User wnats to select a car type "suv" from uber app
    When User select car "saden" and pick up point "banglore" and drop location "pune"
    Then Driver starts the journey
    And Driver ends the journey
    Then User pays 1000 USD

  
  Scenario: Booking Cab mini
    Given User wnats to select a car type "mini" from uber app
    When User select car "saden" and pick up point "banglore" and drop location "pune"
    Then Driver starts the journey
    And Driver ends the journey
    Then User pays 1000 USD
