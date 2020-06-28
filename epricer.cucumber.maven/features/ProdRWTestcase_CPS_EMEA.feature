Feature: Verify TSS EMEA geo in production

  @ProdTSSSanityEMEA
  Scenario: Test production IBM GUI flow for TSS EMEA
   
    Given Click on Prod Rewrite GUI link
    Then GUI home page should open
    And Click on SelectARole dropdown and select TRPR-EU Pricer ZZ-Dummy-France
    And Click on Start button
    Then Home page should open
    And Click on Create quote button
    Then New quote page should open for prod rw EMEATSS
    Then Enter QuoteTitle OppID OppOwnerName phone no,ooname
    Then Click on SelectARole dropdown and select Channel indicator
    Then Click on SelectARole dropdown and select Solution type
    And Click on Save and Continue
    Then On Customer information page click on Search Customer for EMEA
    And Click on Save and Continue on customer tab
    Then In Configuration tab upload TSS cfr file
    Then click on collect pricing
    And Click on Save and Continue on Configuration tab
    Then Inside Copra tab close the pop up and click on prices tab
    Then Open the TSS Maintenance tab and verify it 
    Then Click on Request Approval and send the quote for approval for EMEA with COPRA failing error pop up
    Then Verify the status of the quote
    Then Approve the quote using Approval tab for EMEA with error pop up
    And Verify the TSS quote status and check the reports
    
