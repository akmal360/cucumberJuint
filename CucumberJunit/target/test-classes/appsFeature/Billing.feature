Feature: Calculate billing amount

  Scenario Outline: billing amount
    Given user is billling page
    When user enter billing amount <billingAmount>
    When user enters tax amount <taxAmount>
    And user clicks on cucumber button
    Then it gives the final amount <finalAmount>

    Examples: 
      | billingAmount | taxAmount | finalAmount |
      |          1000 |        20 |        1020 |
      |           500 |        30 |         530 |
      |           100 |       5.5 |       105.5 |
