Feature: To verify new user sign up

          As a new user
          I should able to sign up to the application

  Scenario: To verify Signup popup is displayed
    Given   Landed on Home page
    When    I click on Sign Up button
    Then    Get your free account page should be loaded

  Scenario: To verify sign in with Google popup is displayed
    Given   Landed on Get your free account page
    When    I click Continue with Google button

    Then    Sing in with Google popup should be displayed

  Scenario: To verify Sign up with Work as Freelancer
    Given   Landed on Sign in with Google popup
    When    I click a new Google account
    And     I select Work as Freelancer button
    And     I select User Agreement
    And     I click Create My Account button

    Then    User Account should be created for the selected Google account

Scenario: Logout check
    Given user should be in logged in
    When  Hover to user account icon
    And   Click Logout

    Then  User should be logged out successfully


