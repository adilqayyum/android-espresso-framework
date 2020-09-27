Feature: Android App Test

  @login-validation-feature
  Scenario Outline: Click Me Button Validation
    Given I input email <email>
    And I input password "<password>"
    When I press sign in button
    And Wait for "5" seconds
    Then Click me button is present

    Examples:
      | email | password  |
      | percival@gmail.com  | 123456 |
      | arthur@gmail.com | 98765 |


  @label-validation-feature
  Scenario Outline: Text Display Validation
    Given I input email <email>
    And I input password "<password>"
    When I press sign in button
    And Wait for "5" seconds
    Then Click me button is present
    And I press click me button
    Then "<text>" Text is present

    Examples:
      | email | password  | text |
      | percival@gmail.com  | 123456 | Welcome! |