Feature: Test checkout flow

  Scenario: Test WebService links
    Given Open firefox and start application
    When Click on WS link1 and verify if it is working

  Scenario: Test Production DR flow
    Given Open firefox and start application
    When Click on Prod DR link
    Then GUI home page should open
    And Click on SelectARole dropdown and select TROOPPRV1-AP OO on profit plan (V1-Dummy-Singapore)
    And Click on Start button
    Then Home page should open
    And Click on Create quote button
    Then verify if alert is present

  Scenario: Test production IBM GUI flow for NA
    Given Open firefox and start application
    When Click on Prod Rewrite GUI link
    Then GUI home page should open
    And Click on SelectARole dropdown and select X1 Channel Pricer
    And Click on Start button
    Then Home page should open
    And Click on Create quote button
    Then New quote page should open for prod rw NA
    Then Enter QuoteTitle OppID OppOwnerName
    And Click on Save and Continue
    Then On Customer information page click on Add a new Customer
    Then Enter customer name
    And Click on Save and Continue on customer tab
    Then Add product manually
    Then click on collect pricing
    And Click on Save and Continue on Configuration tab
    Then Click on Request Approval and send the quote for approval
    Then Verify the status of the quote
    Then Approve the quote using Approval tab
    And Verify the quote status and check the reports

  Scenario: Test production NA BP PCS flow
    Given Open firefox and start application
    When Click on PCS Prod rw link
    Then Prod rw PCS page should open
    Then Enter all the details to rediect to IBM PCS page
    Then GUI home page should open
    And Click on SelectARole dropdown and select SP1 Maint - COV TR X1
    And Click on Start button
    Then Home page should open
    And Click on Create quote button
    Then In Overview tab enter the required details
    And Click on Save and Continue
    Then Add product manually for PCS
    Then click on collect pricing for PCS
    Then fill details inside Registration and customer tab
    Then in Details pricing tab click on Submit price request
    Then inside submit and send popup enter email id and send email
    Then close the window
    Given Open firefox and start application
    When Click on Prod Rewrite GUI link
    Then GUI home page should open
    And Click on SelectARole dropdown and select X1 Channel Pricer
    And Click on Start button
    And Search for the quoteID from excel sheet for PCS NA BP prod rw
    Then Click on comments and status and remove the quote from on hold status
    Then Click on pricing tab and approve the quote
    Then verify reports for BP

  Scenario: Test production IBM GUI flow for AP
    Given Open firefox and start application
    When Click on Prod Rewrite GUI link
    Then GUI home page should open
    And Click on SelectARole dropdown and select TROOPPRV1-AP OO on profit plan (V1-Dummy-Singapore)
    And Click on Start button
    Then Home page should open
    And Click on Create quote button
    Then New quote page should open for prod rw AP
    Then Enter QuoteTitle OppID OppOwnerName
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
    Given Open firefox and start application
    When Click on Prod Rewrite GUI link
    Then GUI home page should open
    And Click on SelectARole dropdown and select TRPRV1-AP Pricer (V1-Dummy-Singapore)
    And Click on Start button
    And Search for the quoteID from excel sheet for AP prod rw
    Then Click on pricing tab
    Then Approve the quote using Approval tab for AP
    And Verify the quote status and check the reports

  Scenario: Test production IBM GUI flow for EMEA
    Given Open firefox and start application
    When Click on Prod Rewrite GUI link
    Then GUI home page should open
    And Click on SelectARole dropdown and select EU Transaction Quotes GTS Opportunity Owner ZZ
    And Click on Start button
    Then Home page should open
    And Click on Create quote button
    Then New quote page should open for prod rw EMEA
    Then Enter QuoteTitle OppID OppOwnerName
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
    Given Open firefox and start application
    When Click on Prod Rewrite GUI link
    Then GUI home page should open
    And Click on SelectARole dropdown and select EU Transaction Quotes GTS Approver ZZ
    And Click on Start button
    And Search for the quoteID from excel sheet for EMEA prod rw
    Then Click on pricing tab
    Then Approve the quote using Approval tab for AP
    And Verify the quote status and check the reports

  Scenario: Test production IBM GUI flow for LA
    Given Open firefox and start application
    When Click on Prod Rewrite GUI link
    Then GUI home page should open
    And DUMMY Y1 Transaction Quotes Profit Opportunity Owner
    And Click on Start button
    Then Home page should open
    And Click on Create quote button
    Then New quote page should open for prod rw LA
    Then Enter QuoteTitle OppID OppOwnerName
    And Click on Save and Continue
    Then On Customer information page click on Add a new Customer
    Then Enter customer name
    And Click on Save and Continue on customer tab
    Then Add product manually
    Then click on collect pricing
    And Click on Save and Continue on Configuration tab
    Then Click on Request Approval and send the quote for approval for LA
    Then Verify the status of the quote
    Then Approve the quote using Approval tab for LA
    Then Verify the status of the quote
    Then close the window
    Given Open firefox and start application
    When Click on Prod Rewrite GUI link
    Then GUI home page should open
    And Click on SelectARole dropdown and select DUMMY Y1 Transaction Quotes Administrative Pricer
    And Click on Start button
    And Search for the quoteID from excel sheet for LA prod rw
    Then Click on pricing tab

  Scenario: Test Settings url
    Given Open firefox and start application
    When Click on Settings url
    Then select GMCADMIN - AP Grid Manager Country (V1-DUMMY-SINGAPORE) from the list
    Then click on launch epricer settings
    Then Check if all the links are working fine in settings

  Scenario: Test Authorization url
    Given Open firefox and start application
    When Click on Auth url
    Then select AUTHVIEW-WW Administrator for Registration (VIEW ONLY) from the list
    Then click on launch application
    Then Check if all the links are working fine

  Scenario: Test internal IBM GUI flow for NA
    Given Open firefox and start application
    When Click on India Lab GUI link
    Then GUI home page should open
    And Click on SelectARole dropdown and select GITC TRN NA role
    And Click on Start button
    Then Home page should open
    And Click on Create quote button
    Then New quote page should open for NA
    Then In Overview select country as United States
    Then Enter QuoteTitle OppID OppOwnerName
    And Click on Save and Continue
    Then On Customer information page click on Search Customer for NA
    Then Enter customer name
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

  Scenario: Test internal IBM GUI flow for AP
    Given Open firefox and start application
    When Click on India Lab GUI link
    Then GUI home page should open
    And Click on SelectARole dropdown and select GITC TRN AP role
    And Click on Start button
    Then Home page should open
    And Click on Create quote button
    Then New quote page should open for AP
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

  Scenario: Test internal IBM GUI flow for EMEA
    Given Open firefox and start application
    When Click on India Lab GUI link
    Then GUI home page should open
    And Click on SelectARole dropdown and select GITC TRN EMEA role
    And Click on Start button
    Then Home page should open
    And Click on Create quote button
    Then New quote page should open for EMEA
    Then In Overview select country as Switzerland
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
