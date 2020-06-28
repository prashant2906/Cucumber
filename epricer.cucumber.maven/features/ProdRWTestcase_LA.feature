Feature: Verify LA geo in production

  @ProdSanityLA
  Scenario: Test production IBM GUI flow for LA
    
    Given Click on Prod Rewrite GUI link
    Then GUI home page should open
    And DUMMY Y1 Transaction Quotes Profit Opportunity Owner
    And Click on Start button
    Then Home page should open
    And Click on Create quote button
    Then New quote page should open for prod rw LA
    Then Enter QuoteTitle OppID OppOwnerName for AP /LA
    And Click on Save and Continue
    Then On Customer information page click on Add a new Customer
    Then Enter customer name
    And Click on Save and Continue on customer tab
    Then Add product manually
    Then click on collect pricing
    And Click on Save and Continue on Configuration tab
    Then Click on Request Approval and send the quote for approval for LA
    Then Verify the status of the quote
    Then Approve the quote using Approval tab
    And Verify the quote status and check the reports
