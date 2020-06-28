Feature: Verify BP PCS-NA VS in production

  @ProdSanityPCS_VS
  Scenario: Test production NA BP PCS_VS flow
  
    Given Click on PCS Prod rw link
    Then Prod rw PCS page should open
    Then Enter all the details to rediect to IBM PCS page
    Then GUI home page should open
    And Click on SelectARole dropdown and select SP1 Maint - COV TR X1
    And Click on Start button
    Then Home page should open
    And Click on Create quote button
    Then In Overview tab enter the required details_VS
    And Click on Save and Continue
    Then Add product manually for PCS
    Then click on collect pricing for PCS
    Then fill details inside Registration and customer tab for PCS
    Then in Details pricing tab click on Accept value seller offer
    Then Click on Addendum
    Then close the window
    
