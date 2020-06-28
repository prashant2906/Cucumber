Feature: Verify EMEA geo in production

  @ProdSanityEMEA
  Scenario: Test production IBM GUI flow for EMEA
   
    Given Click on Prod Rewrite GUI link
    Then GUI home page should open
    And Click on SelectARole dropdown and select EU Transaction Quotes GTS Opportunity Owner ZZ
    And Click on Start button
    Then Home page should open
    And Click on Create quote button
    Then New quote page should open for prod rw EMEA
    Then Enter QuoteTitle OppID OppOwnerName
    And Click on Save and Continue
    Then On Customer information page click on Search Customer for EMEA
    And Click on Save and Continue on customer tab
    Then Add product manually
    Then click on collect pricing
    And Click on Save and Continue on Configuration tab
    Then Inside Copra tab close the pop up and click on prices tab
    Then Click on Request Approval and send the quote for approval for EMEA with COPRA failing error pop up
    Then Verify the status of the quote
    Then close the window
    When Click on Prod Rewrite GUI link
    Then GUI home page should open
    And Click on SelectARole dropdown and select TRPR-EU Pricer ZZ-Dummy-France
    And Click on Start button
    And Search for the quoteID from excel sheet for EMEA prod rw
    Then Click on Reviwer tab and add a reviwer
    Then Click on pricing tab
    Then Approve the quote using Approval tab for EMEA with error pop up
    And Verify the quote status and check the reports
    Then Navigate to COPRA screen and mark as COPRA PRICED
