Feature: User Search
  As a LinkedIn user
  I want to be able to search other users' profiles
  To be able to connect with them and expand my network

  Scenario: Search by Username
    Given I have successfully logged into my LinkedIn account
    When I enter the username I want to search for in the search field
    And I clicked the "Search" button
    Then I will see search results relevant to the username I'm looking for