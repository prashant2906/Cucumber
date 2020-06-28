Feature: Test Production DR flow

  @ProdSanityDR
  Scenario: Test Production DR error popup message
    Given Click on Prod DR link
    Then GUI home page should open
    And Click on SelectARole dropdown and select TROOPPRV1-AP OO on profit plan (V1-Dummy-Singapore)
    And Click on Start button
    Then Home page should open
    And Click on Create quote button
    Then verify if alert is present
