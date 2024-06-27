Feature: I want to retrieve the card number from saucelab site

  Scenario: get card number

    Given  I enter a username as standard_user
    When I enter a password as secret_sauce
    Then I click login button
    And I click on add to cart button
    Then I click on cart icon
    And I click on checkout button
    Given I enter fist name as firstname
    When I enter last name as lastname
    And I enter postal code as 32013
    And I click continue button
    Then I retrieve the card number

