Feature: Log
  As a user, I want to be able to login with username and password

  Background:  go to login page


  @scenario_1
  Scenario: Login as store manager
    When user logs in as a store consultant
    Then user should be able to see Dashboard page




    @scenario_2
    Scenario: Login as driver
      When user logs in as a driver
      Then user should be able to see Dashboard page

      @scenario_outline
      Scenario Outline: Login under different credentials as <username>
        When user enters "<username>" and "<password>"
        Then user should be able to see Dashboard page

        Examples:
          |username      | password  |
          |user          | UserUser123  |
          |user          | UserUser123  |
          |user          | UserUser123  |
          |user          | UserUser123  |
          |storemanager85| UserUser123  |
          |storemanager23| UserUser123  |
          |storemanager22| UserUser123  |