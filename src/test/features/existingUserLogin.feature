Feature:    Verify existing user login

            As an existing user
            I should login to application

  Scenario: To verify Login popup is displayed
    Given   Landed on Home Page
    When    I click on Login button

    Then    I should see Login page

  Scenario: To verify Google sign in popup is displayed
    Given   I am in Login page "https://www.upwork.com"
    When    I click Sign in with Google Account

    Then    I should see Sign in with Google dialog

    Given   I am in Sign in with Google dialog
    When    Existing Google account is clicked

    Then    User should be logged in successfuly
