Feature: Verify AP geo in production

  @ProdSanityAP
  Scenario: Test production IBM GUI flow for AP
   
    Given Click on Prod Rewrite GUI link
    Then GUI home page should open
    And Click on SelectARole dropdown and select TROOPPRV1-AP OO on profit plan (V1-Dummy-Singapore)
    And Click on Start button
    Then Home page should open
    And Click on Create quote button
    Then New quote page should open for prod rw AP
    Then Enter QuoteTitle OppID OppOwnerName for AP /LA
    And Click on Save and Continue
    Then On Customer information page click on Add a new Customer
    Then Enter customer name
    And Click on Save and Continue on customer tab
    Then Add product manually
    Then click on collect pricing
    And Click on Save and Continue on Configuration tab
    Then Click on Request Approval and send the quote for approval
    Then Verify the status of the quote
    Then close the window
    When Click on Prod Rewrite GUI link
    Then GUI home page should open
    And Click on SelectARole dropdown and select TRPRV1-AP Pricer (V1-Dummy-Singapore)
    And Click on Start button
    And Search for the quoteID from excel sheet for AP prod rw
    Then Click on Reviwer tab and add a reviwer
    Then Click on pricing tab
    Then Approve the quote using Approval tab for AP
    And Verify the quote status and check the reports
    
