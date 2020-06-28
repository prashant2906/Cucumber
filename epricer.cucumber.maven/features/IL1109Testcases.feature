@IL1109Sanity
Feature: Verify IL1109 all Geo testcases

@IL1109SanityLA  
  Scenario: IL1109 Test internal IBM GUI flow for LA
    Given Open firefox and start application
    When Click on 1109 India Lab GUI link
    Then GUI home page should open
    And Click on SelectARole dropdown and select GITC TRN LA role
    And Click on Start button
    Then Home page should open
    And Click on Create quote button
    Then New quote page should open for LA IL1109
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
    Then Approve the quote using Approval tab for LA

@IL1109SanityNA
  Scenario: IL1109 Test internal IBM GUI flow for NA
    Given Open firefox and start application
    When Click on 1109 India Lab GUI link
    Then GUI home page should open
    And Click on SelectARole dropdown and select GITC TRN NA role
    And Click on Start button
    Then Home page should open
    And Click on Create quote button
    Then New quote page should open for NA IL1109
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

@IL1109SanityAP  
  Scenario: IL1109 Test internal IBM GUI flow for AP
    Given Open firefox and start application
    When Click on 1109 India Lab GUI link
    Then GUI home page should open
    And Click on SelectARole dropdown and select GITC TRN AP role
    And Click on Start button
    Then Home page should open
    And Click on Create quote button
    Then New quote page should open for AP IL1109
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

@IL1109SanityEMEA  
  Scenario: IL1109 Test internal IBM GUI flow for EMEA
    Given Open firefox and start application
    When Click on 1109 India Lab GUI link
    Then GUI home page should open
    And Click on SelectARole dropdown and select GITC TRN EMEA role
    And Click on Start button
    Then Home page should open
    And Click on Create quote button
    Then New quote page should open for EMEA IL1109
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

@IL1109SanityJP  
  Scenario: IL1109 Test internal IBM GUI flow for Japan
    Given Open firefox and start application
    When Click on 1109 India Lab GUI link
    Then GUI home page should open
    And Click on SelectARole dropdown and select GITC TRN AP-Japan role
    And Click on Start button
    Then Home page should open
    And Click on Create quote button
    Then New quote page should open for Japan IL1109
    Then In Overview select country as Japan
    Then Enter QuoteTitle OppID OppOwnerName
    And Click on Save and Continue
    Then On Customer information page click on Search Customer for JP
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
