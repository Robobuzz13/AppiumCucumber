@test
Feature:
  To test valid and invalid login feature

  Scenario Outline: test app with valid login
    Given I am in login page
    When I enter userName "<userName>"
    And I enter password "<password>"
    And I click login button
    Then I am in all account page
    Examples:
      | userName | password |
      | test@yopmail.com | test1234 |

  Scenario Outline: test app with invalid username
    Given I am in login page
    When I enter userName "<userName>"
    And I enter password "<password>"
    And I click login button
    Then Error message is displayed
    Examples:
      | userName | password |
      | invalid@yopmail.com | test1234 |

  Scenario Outline: test app with invalid password
    Given I am in login page
    When I enter userName "<userName>"
    And I enter password "<password>"
    And I click login button
    Then Error message is displayed
    Examples:
      | userName | password |
      | test@yopmail.com | invalid |

