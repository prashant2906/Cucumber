Feature: Verify BP PCS-NA SB in production

  @ProdSanityPCS_SB
  Scenario: Test production NA BP PCS_SB flow
  
    Given Click on PCS Prod rw link
    Then Prod rw PCS page should open
    Then Enter all the details to rediect to IBM PCS page
    Then GUI home page should open
    And Click on SelectARole dropdown and select SP1 Maint - COV TR X1
    And Click on Start button
    Then Home page should open
    And Click on Create quote button
    Then In Overview tab enter the required details_SB
    And Click on Save and Continue
    Then Add product manually for PCS
    Then click on collect pricing for PCS
    Then fill details inside Registration and customer tab for PCS
    Then in Details pricing tab click on Submit price request
    Then inside submit and send popup enter email id and send email
    Then close the window
    When Click on Prod Rewrite GUI link
    Then GUI home page should open
    And Click on SelectARole dropdown and select X1 Channel Pricer
    And Click on Start button
    And Search for the quoteID from excel sheet for PCS NA BP prod rw
    Then Click on comments and status and remove the quote from on hold status
    Then Click on pricing tab and approve the quote
    Then verify reports for BP

    