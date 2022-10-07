Feature: Amazon searching

  Scenario: Amazon search products
    Given I want to write a step with search on Amazon page
    When I search for product with "Apple phone" and price is 1200
    Then product with name "Apple phone" should displayed
    And program is execute
