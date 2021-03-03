Feature: Sales
  As a user, I should see the sales manager login

  @scenario_1
  Scenario: Login as sales manager
    Given user is on the sales page
    When user logs in as a sales manager
    Then user should see the Sales dashboard
