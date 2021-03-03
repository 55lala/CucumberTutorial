 @vehicle
  Feature: Create vehicle

    As a user, I want to be able to create vehicles

    Scenario: Create  vehicle
      Given user is on the landing page
      When user logs in with "storemanager85" and "UserUser123" credentials
      Then user navigates to "Fleet" and "Vehicles"
      And user click on create car button
      Then user enter vehicles information:
        |License Plate|Driver|Location    |Model Year|
        | test_plates | SDET | Washington | 2020     |