Feature: Verify NA geo in production

  @ProdSanityNA
  Scenario: Test production IBM GUI flow for NA
    
    Given Click on Prod Rewrite GUI link
    Then GUI home page should open
    And Click on SelectARole dropdown and select X1 Channel Pricer
    And Click on Start button
    Then Home page should open
    And Click on Create quote button
    Then New quote page should open for prod rw NA
    Then Enter QuoteTitle OppID OppOwnerName
    And Click on Save and Continue
    Then On Customer information page click on Search Customer for NA
    And Click on Save and Continue on customer tab
    Then Add product manually
    Then click on collect pricing
    And Click on Save and Continue on Configuration tab
    Then Click on Request Approval and send the quote for approval
    Then Verify the status of the quote
    Then Approve the quote using Approval tab
    And Verify the quote status and check the reports
    Then Navigate to COPRA screen for NA
