Feature: Amazon searching

  Scenario: Amazon search products
    Given I want to write a step with search on Amazon page
    When I search for product with "Apple phone" and price is 1200
    Then product with name "Apple phone" should displayed
    Then Order is is 123456 and user name is "Akmal"

  Scenario: Amazon search products
    Given I want to write a step with search on Amazon page
    When I search for product with "Apple Mac" and price is 2100
    Then product with name "Apple Mac" should displayed
    Then Order is is 67890 and user name is "Akmal"
