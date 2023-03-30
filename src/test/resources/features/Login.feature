Feature: Main page
  As a LinkedIn user
  I'd like to see an attractive and informative LinkedIn homepage look
  To be able to easily find the information I need and explore LinkedIn features

  Scenario: Sign in to your LinkedIn Account
    Given I'm on the main LinkedIn page
    When I click the "Login" button
    And I entered a valid email and password
    Then I will be able to successfully login to my LinkedIn account

    Scenario: Sign in with a Google or Microsoft Account
      Given I'm on the main LinkedIn page
      When I click the "Login" button
      And I chose the login option with a Google or Microsoft account
      And I entered a valid email and password
      And I clicked the "Login" button
      Then I will be able to successfully login to my LinkedIn account



