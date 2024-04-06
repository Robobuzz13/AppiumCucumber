@test
Feature:
  To test valid signup feature

  Scenario Outline: test app with valid signup
    Given I am in login page
    When I click signup link
    And I enter name "<name>"
    And I enter email "<email>"
    And I enter password "<password>"
    And I enter confirm password "<confirmPassword>"
    And I click register button
    Examples:
      | name | email | password | confirmPassword |
      | tests | tests@yopmail.com | test1234 | test1234 |
