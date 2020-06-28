@CDTDevSanity
Feature: Verify CDT Dev all Geo testcases

  @CDTDevSanityPCS
  Scenario: CDT Dev Test PCS SB flow
    Given Open firefox and start application
    When Click on CDT Dev BP Bypass link
    Then Click on PCS and Distirbutor radio button and click on ePricer
    Then GUI home page should open
    And Click on SelectARole dropdown and select NA Distributor: Avnet Hall-Mark, all quotes
    And Click on Start button
    And Click on Create quote button
    Then In Overview tab enter the required details for CDT Dev
    And Click on Save and Continue
    Then In Configuration tab upload cfr file for PCS
    Then Add product manually for PCS
    Then click on collect pricing for PCS
    Then fill details inside Registration and customer tab for PCS
    Then in Details pricing tab click on Submit price request for PCS
    Then inside submit and send popup enter email id and send email
    Then close the window
    When Click on CDT Dev IBM GUI link
    Then GUI home page should open
    And Click on SelectARole dropdown and select GITC TRN NA role
    And Click on Start button
    And Search for the quoteID from excel sheet for CDT Dev PCS NA BP
    Then Click on comments and status and remove the quote from on hold status
    Then Click on pricing tab and approve the quote
    Then verify reports for BP

  @CDTDevSanityAP
  Scenario: CDT Dev Test internal IBM GUI flow for AP
    Given Open firefox and start application
    When Click on CDT Dev India Lab GUI link
    Then GUI home page should open
    And Click on SelectARole dropdown and select GITC TRN AP role
    And Click on Start button
    Then Home page should open
    And Click on Create quote button
    Then New quote page should open for AP CDT Dev
    Then In Overview select country as India
    Then Enter QuoteTitle OppID OppOwnerName
    And Click on Save and Continue
    Then On Customer information page click on Search Customer for others
    And Click on Save and Continue on customer tab
    Then In Configuration tab upload cfr file
    Then Add product manually
    Then click on collect pricing
    And Click on Save and Continue on Configuration tab
    Then Inside pricing tab Apply Discount to the line items for the role below deligation level
    Then Click on Request Approval and send the quote for approval for the role below deligation level
    Then Approve the quote using Approval tab for AP
    And Verify the quote status and check the reports
    Then Search for the created quote

  @CDTDevSanityNA
  Scenario: CDT Dev Test internal IBM GUI flow for NA
    Given Open firefox and start application
    When Click on CDT Dev India Lab GUI link
    Then GUI home page should open
    And Click on SelectARole dropdown and select GITC TRN NA role
    And Click on Start button
    Then Home page should open
    And Click on Create quote button
    Then New quote page should open for NA CDT Dev
    Then In Overview select country as United States
    Then Enter QuoteTitle OppID OppOwnerName
    And Click on Save and Continue
    Then On Customer information page click on Search Customer for NA
    And Click on Save and Continue on customer tab
    Then In Configuration tab upload cfr file
    Then Add product manually
    Then click on collect pricing
    And Click on Save and Continue on Configuration tab
    Then Inside pricing tab Apply Discount to the line items
    Then Click on Request Approval and send the quote for approval
    Then Approve the quote using Approval tab
    And Verify the quote status and check the reports
    Then Search for the created quote

  @CDTDevSanityEMEA
  Scenario: CDT Dev Test internal IBM GUI flow for EMEA
    Given Open firefox and start application
    When Click on CDT Dev India Lab GUI link
    Then GUI home page should open
    And Click on SelectARole dropdown and select GITC TRN EMEA role
    And Click on Start button
    Then Home page should open
    And Click on Create quote button
    Then New quote page should open for EMEA CDT Dev
    Then In Overview select country as United Kingdom
    Then Enter QuoteTitle OppID OppOwnerName
    And Click on Save and Continue
    Then On Customer information page click on Search Customer for others
    And Click on Save and Continue on customer tab
    Then In Configuration tab upload cfr file
    Then Add product manually
    Then click on collect pricing
    Then Insert sleep time
    And Click on Save and Continue on Configuration tab
    Then Inside pricing change the Table View to component view
    Then Inside pricing tab Apply Discount to the line items
    Then Insert sleep time
    Then Click on Request Approval and send the quote for approval
    Then Approve the quote using Approval tab for AP
    And Verify the quote status and check the reports
    Then Search for the created quote

  @CDTDevSanityJP
  Scenario: CDT Dev Test internal IBM GUI flow for Japan
    Given Open firefox and start application
    When Click on CDT Dev India Lab GUI link
    Then GUI home page should open
    And Click on SelectARole dropdown and select JP Channel Pricer role
    And Click on Start button
    Then Home page should open
    And Click on Create quote button
    Then New quote page should open for Japan CDT Dev
    Then In Overview select country as Japan
    Then Enter ReqPhn QuoteTitle OppID OppOwnerName ChannelInd SolType
    And Click on Save and Continue
    Then On Customer information page click on Search Customer for JP
    And Click on Save and Continue on customer tab
    Then Add product manually
    Then click on collect pricing
    And Click on Save and Continue on Configuration tab for CDT Dev JP
    Then Inside pricing change the Table View to component view
    Then Inside pricing tab Apply Discount to the line items for the role below deligation level
    Then Click on Request Approval and send the quote for approval for the role below deligation level
    Then Approve the quote using Approval tab for AP
    And Verify the quote status and check the reports

  @CDTDevSanityLA
  Scenario: CDT Dev Test internal IBM GUI flow for LA
    Given Open firefox and start application
    When Click on CDT Dev India Lab GUI link
    Then GUI home page should open
    And Click on SelectARole dropdown and select GITC TRN LA role
    And Click on Start button
    Then Home page should open
    And Click on Create quote button
    Then New quote page should open for LA CDT Dev
    Then In Overview select country as Colombia
    Then Enter QuoteTitle OppID OppOwnerName
    And Click on Save and Continue
    Then On Customer information page click on Search Customer for others
    And Click on Save and Continue on customer tab
    Then In Configuration tab upload cfr file
    Then Add product manually
    Then click on collect pricing
    And Click on Save and Continue on Configuration tab
    Then Inside pricing change the Table View to component view
    Then Inside pricing tab Apply Discount to the line items
    Then Click on Request Approval and send the quote for approval for LA
    Then Approve the quote using Approval tab
    And Verify the quote status and check the reports
    Then Search for the created quote