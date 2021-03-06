$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("ProdRWTestcase_AP.feature");
formatter.feature({
  "id": "verify-ap-geo-in-production",
  "description": "",
  "name": "Verify AP geo in production",
  "keyword": "Feature",
  "line": 1
});
formatter.scenario({
  "id": "verify-ap-geo-in-production;test-production-ibm-gui-flow-for-ap",
  "tags": [
    {
      "name": "@ProdSanityAP",
      "line": 3
    }
  ],
  "description": "",
  "name": "Test production IBM GUI flow for AP",
  "keyword": "Scenario",
  "line": 4,
  "type": "scenario"
});
formatter.step({
  "name": "Click on Prod Rewrite GUI link",
  "keyword": "Given ",
  "line": 6
});
formatter.step({
  "name": "GUI home page should open",
  "keyword": "Then ",
  "line": 7
});
formatter.step({
  "name": "Click on SelectARole dropdown and select TROOPPRV1-AP OO on profit plan (V1-Dummy-Singapore)",
  "keyword": "And ",
  "line": 8
});
formatter.step({
  "name": "Click on Start button",
  "keyword": "And ",
  "line": 9
});
formatter.step({
  "name": "Home page should open",
  "keyword": "Then ",
  "line": 10
});
formatter.step({
  "name": "Click on Create quote button",
  "keyword": "And ",
  "line": 11
});
formatter.step({
  "name": "New quote page should open for prod rw AP",
  "keyword": "Then ",
  "line": 12
});
formatter.step({
  "name": "Enter QuoteTitle OppID OppOwnerName for AP /LA",
  "keyword": "Then ",
  "line": 13
});
formatter.step({
  "name": "Click on Save and Continue",
  "keyword": "And ",
  "line": 14
});
formatter.step({
  "name": "On Customer information page click on Add a new Customer",
  "keyword": "Then ",
  "line": 15
});
formatter.step({
  "name": "Enter customer name",
  "keyword": "Then ",
  "line": 16
});
formatter.step({
  "name": "Click on Save and Continue on customer tab",
  "keyword": "And ",
  "line": 17
});
formatter.step({
  "name": "Add product manually",
  "keyword": "Then ",
  "line": 18
});
formatter.step({
  "name": "click on collect pricing",
  "keyword": "Then ",
  "line": 19
});
formatter.step({
  "name": "Click on Save and Continue on Configuration tab",
  "keyword": "And ",
  "line": 20
});
formatter.step({
  "name": "Click on Request Approval and send the quote for approval",
  "keyword": "Then ",
  "line": 21
});
formatter.step({
  "name": "Verify the status of the quote",
  "keyword": "Then ",
  "line": 22
});
formatter.step({
  "name": "close the window",
  "keyword": "Then ",
  "line": 23
});
formatter.step({
  "name": "Click on Prod Rewrite GUI link",
  "keyword": "When ",
  "line": 24
});
formatter.step({
  "name": "GUI home page should open",
  "keyword": "Then ",
  "line": 25
});
formatter.step({
  "name": "Click on SelectARole dropdown and select TRPRV1-AP Pricer (V1-Dummy-Singapore)",
  "keyword": "And ",
  "line": 26
});
formatter.step({
  "name": "Click on Start button",
  "keyword": "And ",
  "line": 27
});
formatter.step({
  "name": "Search for the quoteID from excel sheet for AP prod rw",
  "keyword": "And ",
  "line": 28
});
formatter.step({
  "name": "Click on Reviwer tab and add a reviwer",
  "keyword": "Then ",
  "line": 29
});
formatter.step({
  "name": "Click on pricing tab",
  "keyword": "Then ",
  "line": 30
});
formatter.step({
  "name": "Approve the quote using Approval tab for AP",
  "keyword": "Then ",
  "line": 31
});
formatter.step({
  "name": "Verify the quote status and check the reports",
  "keyword": "And ",
  "line": 32
});
formatter.match({
  "location": "Smoketest.click_on_Prod_Rewrite_GUI_link()"
});
formatter.result({
  "duration": 40728597909,
  "status": "passed"
});
formatter.match({
  "location": "Smoketest.GUI_home_page_should_open()"
});
formatter.result({
  "duration": 76953730,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 49
    },
    {
      "val": "1",
      "offset": 74
    }
  ],
  "location": "Smoketest.click_on_SelectARole_dropdown_and_select_TROOPPRV_AP_OO_on_profit_plan_V_Dummy_Singapore(int,int)"
});
formatter.result({
  "duration": 240897351,
  "status": "passed"
});
formatter.match({
  "location": "Smoketest.Click_on_Start_button()"
});
formatter.result({
  "duration": 1351752524,
  "status": "passed"
});
formatter.match({
  "location": "Smoketest.Home_page_should_open()"
});
formatter.result({
  "duration": 4503130751,
  "status": "passed"
});
formatter.match({
  "location": "Smoketest.Click_on_Create_quote_button()"
});
formatter.result({
  "duration": 6182517060,
  "status": "passed"
});
formatter.match({
  "location": "Smoketest.new_quote_page_should_open_for_prod_rw_AP()"
});
formatter.result({
  "duration": 1141283162,
  "status": "passed"
});
formatter.match({
  "location": "Smoketest.enter_QuoteTitle_OppID_OppOwnerNameAPLA()"
});
formatter.result({
  "duration": 6680442535,
  "status": "passed"
});
formatter.match({
  "location": "Smoketest.click_on_Save_and_Continue()"
});
formatter.result({
  "duration": 5283172750,
  "status": "passed"
});
formatter.match({
  "location": "Smoketest.on_Customer_information_page_click_on_Add_a_new_Customer()"
});
formatter.result({
  "duration": 6392244787,
  "status": "passed"
});
formatter.match({
  "location": "Smoketest.enter_customer_name()"
});
formatter.result({
  "duration": 3233565790,
  "status": "passed"
});
formatter.match({
  "location": "Smoketest.click_on_Save_and_Continue_on_customer_tab()"
});
formatter.result({
  "duration": 5321611908,
  "status": "passed"
});
formatter.match({
  "location": "Smoketest.add_product_manually()"
});
formatter.result({
  "duration": 23256642136,
  "status": "passed"
});
formatter.match({
  "location": "Smoketest.click_on_collect_pricing()"
});
formatter.result({
  "duration": 38314108102,
  "status": "passed"
});
formatter.match({
  "location": "Smoketest.click_on_Save_and_Continue_on_Configuration_tab()"
});
formatter.result({
  "duration": 9194775002,
  "status": "passed"
});
formatter.match({
  "location": "Smoketest.click_on_Request_Approval_and_send_the_quote_for_approval()"
});
formatter.result({
  "duration": 30226552391,
  "status": "passed"
});
formatter.match({
  "location": "Smoketest.verify_the_status_of_the_quote()"
});
formatter.result({
  "duration": 2098838195,
  "status": "passed"
});
formatter.match({
  "location": "Smoketest.close_the_window()"
});
formatter.result({
  "duration": 1012236077,
  "status": "passed"
});
formatter.match({
  "location": "Smoketest.click_on_Prod_Rewrite_GUI_link()"
});
formatter.result({
  "duration": 143261074986,
  "status": "passed"
});
formatter.match({
  "location": "Smoketest.GUI_home_page_should_open()"
});
formatter.result({
  "duration": 38536437,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 46
    },
    {
      "val": "1",
      "offset": 60
    }
  ],
  "location": "Smoketest.click_on_SelectARole_dropdown_and_select_TRPRV_AP_Pricer_V_Dummy_Singapore(int,int)"
});
formatter.result({
  "duration": 332660121,
  "status": "passed"
});
formatter.match({
  "location": "Smoketest.Click_on_Start_button()"
});
formatter.result({
  "duration": 3789668076,
  "status": "passed"
});
formatter.match({
  "location": "Smoketest.search_for_the_quoteID_from_excel_sheet_for_AP_prod_rw()"
});
formatter.result({
  "duration": 25773293214,
  "status": "passed"
});
formatter.match({
  "location": "Smoketest.click_on_Reviwer_tab_and_add_a_reviwer()"
});
formatter.result({
  "duration": 22070965321,
  "status": "passed"
});
formatter.match({
  "location": "Smoketest.click_on_pricing_tab()"
});
formatter.result({
  "duration": 2262606449,
  "status": "passed"
});
formatter.match({
  "location": "Smoketest.approve_the_quote_using_Approval_tab_for_AP()"
});
formatter.result({
  "duration": 30749262381,
  "status": "passed"
});
formatter.match({
  "location": "Smoketest.verify_the_quote_status_and_check_the_reports()"
});
formatter.result({
  "duration": 17026879120,
  "status": "failed",
  "error_message": "org.openqa.selenium.ElementNotVisibleException: Element is not currently visible and so may not be interacted with\nCommand duration or timeout: 23 milliseconds\nBuild info: version: \u00272.53.0\u0027, revision: \u002735ae25b1534ae328c771e0856c93e187490ca824\u0027, time: \u00272016-03-15 10:43:46\u0027\nSystem info: host: \u0027IBM638-PC073DB9\u0027, ip: \u00279.78.199.12\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.7.0_25\u0027\nSession ID: b9feaf3e-472b-419a-ab49-e9dd496e439d\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities [{platform\u003dWINDOWS, acceptSslCerts\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, databaseEnabled\u003dtrue, browserName\u003dfirefox, handlesAlerts\u003dtrue, nativeEvents\u003dfalse, webStorageEnabled\u003dtrue, rotatable\u003dfalse, locationContextEnabled\u003dtrue, applicationCacheEnabled\u003dtrue, takesScreenshot\u003dtrue, version\u003d43.0.1}]\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:678)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:327)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:85)\r\n\tat StepDef.Smoketest.verify_the_quote_status_and_check_the_reports(Smoketest.java:1013)\r\n\tat ✽.And Verify the quote status and check the reports(ProdRWTestcase_AP.feature:32)\r\nCaused by: org.openqa.selenium.ElementNotVisibleException: Element is not currently visible and so may not be interacted with\nBuild info: version: \u00272.53.0\u0027, revision: \u002735ae25b1534ae328c771e0856c93e187490ca824\u0027, time: \u00272016-03-15 10:43:46\u0027\nSystem info: host: \u0027IBM638-PC073DB9\u0027, ip: \u00279.78.199.12\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.7.0_25\u0027\nDriver info: driver.version: unknown\r\n\tat \u003canonymous class\u003e.fxdriver.preconditions.visible(file:///C:/Users/IBM_AD~1/AppData/Local/Temp/anonymous2195514971103781038webdriver-profile/extensions/fxdriver@googlecode.com/components/command-processor.js:10092)\r\n\tat \u003canonymous class\u003e.DelayedCommand.prototype.checkPreconditions_(file:///C:/Users/IBM_AD~1/AppData/Local/Temp/anonymous2195514971103781038webdriver-profile/extensions/fxdriver@googlecode.com/components/command-processor.js:12644)\r\n\tat \u003canonymous class\u003e.DelayedCommand.prototype.executeInternal_/h(file:///C:/Users/IBM_AD~1/AppData/Local/Temp/anonymous2195514971103781038webdriver-profile/extensions/fxdriver@googlecode.com/components/command-processor.js:12661)\r\n\tat \u003canonymous class\u003e.DelayedCommand.prototype.executeInternal_(file:///C:/Users/IBM_AD~1/AppData/Local/Temp/anonymous2195514971103781038webdriver-profile/extensions/fxdriver@googlecode.com/components/command-processor.js:12666)\r\n\tat \u003canonymous class\u003e.DelayedCommand.prototype.execute/\u003c(file:///C:/Users/IBM_AD~1/AppData/Local/Temp/anonymous2195514971103781038webdriver-profile/extensions/fxdriver@googlecode.com/components/command-processor.js:12608)\r\n"
});
formatter.after({
  "duration": 6721618424,
  "status": "passed"
});
formatter.uri("ProdRWTestcase_BP_PCS_NA_SB.feature");
formatter.feature({
  "id": "verify-bp-pcs-na-sb-in-production",
  "description": "",
  "name": "Verify BP PCS-NA SB in production",
  "keyword": "Feature",
  "line": 1
});
formatter.scenario({
  "id": "verify-bp-pcs-na-sb-in-production;test-production-na-bp-pcs-sb-flow",
  "tags": [
    {
      "name": "@ProdSanityPCS_SB",
      "line": 3
    }
  ],
  "description": "",
  "name": "Test production NA BP PCS_SB flow",
  "keyword": "Scenario",
  "line": 4,
  "type": "scenario"
});
formatter.step({
  "name": "Click on PCS Prod rw link",
  "keyword": "Given ",
  "line": 6
});
formatter.step({
  "name": "Prod rw PCS page should open",
  "keyword": "Then ",
  "line": 7
});
formatter.step({
  "name": "Enter all the details to rediect to IBM PCS page",
  "keyword": "Then ",
  "line": 8
});
formatter.step({
  "name": "GUI home page should open",
  "keyword": "Then ",
  "line": 9
});
formatter.step({
  "name": "Click on SelectARole dropdown and select SP1 Maint - COV TR X1",
  "keyword": "And ",
  "line": 10
});
formatter.step({
  "name": "Click on Start button",
  "keyword": "And ",
  "line": 11
});
formatter.step({
  "name": "Home page should open",
  "keyword": "Then ",
  "line": 12
});
formatter.step({
  "name": "Click on Create quote button",
  "keyword": "And ",
  "line": 13
});
formatter.step({
  "name": "In Overview tab enter the required details_SB",
  "keyword": "Then ",
  "line": 14
});
formatter.step({
  "name": "Click on Save and Continue",
  "keyword": "And ",
  "line": 15
});
formatter.step({
  "name": "Add product manually for PCS",
  "keyword": "Then ",
  "line": 16
});
formatter.step({
  "name": "click on collect pricing for PCS",
  "keyword": "Then ",
  "line": 17
});
formatter.step({
  "name": "fill details inside Registration and customer tab for PCS",
  "keyword": "Then ",
  "line": 18
});
formatter.step({
  "name": "in Details pricing tab click on Submit price request",
  "keyword": "Then ",
  "line": 19
});
formatter.step({
  "name": "inside submit and send popup enter email id and send email",
  "keyword": "Then ",
  "line": 20
});
formatter.step({
  "name": "close the window",
  "keyword": "Then ",
  "line": 21
});
formatter.step({
  "name": "Click on Prod Rewrite GUI link",
  "keyword": "When ",
  "line": 22
});
formatter.step({
  "name": "GUI home page should open",
  "keyword": "Then ",
  "line": 23
});
formatter.step({
  "name": "Click on SelectARole dropdown and select X1 Channel Pricer",
  "keyword": "And ",
  "line": 24
});
formatter.step({
  "name": "Click on Start button",
  "keyword": "And ",
  "line": 25
});
formatter.step({
  "name": "Search for the quoteID from excel sheet for PCS NA BP prod rw",
  "keyword": "And ",
  "line": 26
});
formatter.step({
  "name": "Click on comments and status and remove the quote from on hold status",
  "keyword": "Then ",
  "line": 27
});
formatter.step({
  "name": "Click on pricing tab and approve the quote",
  "keyword": "Then ",
  "line": 28
});
formatter.step({
  "name": "verify reports for BP",
  "keyword": "Then ",
  "line": 29
});
formatter.match({
  "location": "Smoketest.click_on_PCS_Prod_rw_link()"
});
formatter.result({
  "duration": 39395270675,
  "status": "passed"
});
formatter.match({
  "location": "Smoketest.Prod_rw_PCS_page_should_open()"
});
formatter.result({
  "duration": 985111084,
  "status": "passed"
});
formatter.match({
  "location": "Smoketest.Enter_all_the_details_to_rediect_to_IBM_PCS_page()"
});
formatter.result({
  "duration": 142180418885,
  "status": "failed",
  "error_message": "org.openqa.selenium.UnhandledAlertException: Unexpected modal dialog (text: To display this page, Firefox must send information that will repeat any action (such as a search or order confirmation) that was performed earlier.): To display this page, Firefox must send information that will repeat any action (such as a search or order confirmation) that was performed earlier.\nBuild info: version: \u00272.53.0\u0027, revision: \u002735ae25b1534ae328c771e0856c93e187490ca824\u0027, time: \u00272016-03-15 10:43:46\u0027\nSystem info: host: \u0027IBM638-PC073DB9\u0027, ip: \u00279.78.199.12\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.7.0_25\u0027\n*** Element info: {Using\u003dcss selector, value\u003dselect[name\u003d\u0027SelectARole\u0027]}\nSession ID: 1cc29ed7-8204-4f74-9a10-ece8983530bf\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities [{platform\u003dWINDOWS, acceptSslCerts\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, databaseEnabled\u003dtrue, browserName\u003dfirefox, handlesAlerts\u003dtrue, nativeEvents\u003dfalse, webStorageEnabled\u003dtrue, rotatable\u003dfalse, locationContextEnabled\u003dtrue, applicationCacheEnabled\u003dtrue, takesScreenshot\u003dtrue, version\u003d43.0.1}]\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createUnhandledAlertException(ErrorHandler.java:187)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:154)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:678)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByCssSelector(RemoteWebDriver.java:492)\r\n\tat org.openqa.selenium.By$ByCssSelector.findElement(By.java:430)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:355)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.findElement(ExpectedConditions.java:899)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.access$000(ExpectedConditions.java:41)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$7.apply(ExpectedConditions.java:205)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$7.apply(ExpectedConditions.java:201)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:238)\r\n\tat StepDef.Smoketest.Enter_all_the_details_to_rediect_to_IBM_PCS_page(Smoketest.java:2364)\r\n\tat ✽.Then Enter all the details to rediect to IBM PCS page(ProdRWTestcase_BP_PCS_NA_SB.feature:8)\r\n"
});
formatter.match({
  "location": "Smoketest.GUI_home_page_should_open()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 43
    },
    {
      "val": "1",
      "offset": 61
    }
  ],
  "location": "Smoketest.click_on_SelectARole_dropdown_and_select_SP_Maint_COV_TR_X(int,int)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Smoketest.Click_on_Start_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Smoketest.Home_page_should_open()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Smoketest.Click_on_Create_quote_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Smoketest.in_Overview_tab_enter_the_required_details_SB()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Smoketest.click_on_Save_and_Continue()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Smoketest.add_product_manually_for_PCS()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Smoketest.click_on_collect_pricing_for_PCS()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Smoketest.fill_details_inside_Registration_and_customer_tab_for_PCS()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Smoketest.in_Details_pricing_tab_click_on_Submit_price_request()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Smoketest.inside_submit_and_send_popup_enter_email_id_and_send_email()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Smoketest.close_the_window()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Smoketest.click_on_Prod_Rewrite_GUI_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Smoketest.GUI_home_page_should_open()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 42
    }
  ],
  "location": "Smoketest.click_on_SelectARole_dropdown_and_select_X_Channel_Pricer(int)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Smoketest.Click_on_Start_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Smoketest.search_for_the_quoteID_from_excel_sheet_for_PCS_NA_BP_prod_rw()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Smoketest.click_on_comments_and_status_and_remove_the_quote_from_on_hold_status()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Smoketest.click_on_pricing_tab_and_approve_the_quote()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Smoketest.verify_reports_for_BP()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 2785921082,
  "status": "passed"
});
formatter.uri("ProdRWTestcase_EMEA.feature");
formatter.feature({
  "id": "verify-emea-geo-in-production",
  "description": "",
  "name": "Verify EMEA geo in production",
  "keyword": "Feature",
  "line": 1
});
formatter.scenario({
  "id": "verify-emea-geo-in-production;test-production-ibm-gui-flow-for-emea",
  "tags": [
    {
      "name": "@ProdSanityEMEA",
      "line": 3
    }
  ],
  "description": "",
  "name": "Test production IBM GUI flow for EMEA",
  "keyword": "Scenario",
  "line": 4,
  "type": "scenario"
});
formatter.step({
  "name": "Click on Prod Rewrite GUI link",
  "keyword": "Given ",
  "line": 6
});
formatter.step({
  "name": "GUI home page should open",
  "keyword": "Then ",
  "line": 7
});
formatter.step({
  "name": "Click on SelectARole dropdown and select EU Transaction Quotes GTS Opportunity Owner ZZ",
  "keyword": "And ",
  "line": 8
});
formatter.step({
  "name": "Click on Start button",
  "keyword": "And ",
  "line": 9
});
formatter.step({
  "name": "Home page should open",
  "keyword": "Then ",
  "line": 10
});
formatter.step({
  "name": "Click on Create quote button",
  "keyword": "And ",
  "line": 11
});
formatter.step({
  "name": "New quote page should open for prod rw EMEA",
  "keyword": "Then ",
  "line": 12
});
formatter.step({
  "name": "Enter QuoteTitle OppID OppOwnerName",
  "keyword": "Then ",
  "line": 13
});
formatter.step({
  "name": "Click on Save and Continue",
  "keyword": "And ",
  "line": 14
});
formatter.step({
  "name": "On Customer information page click on Search Customer for EMEA",
  "keyword": "Then ",
  "line": 15
});
formatter.step({
  "name": "Click on Save and Continue on customer tab",
  "keyword": "And ",
  "line": 16
});
formatter.step({
  "name": "Add product manually",
  "keyword": "Then ",
  "line": 17
});
formatter.step({
  "name": "click on collect pricing",
  "keyword": "Then ",
  "line": 18
});
formatter.step({
  "name": "Click on Save and Continue on Configuration tab",
  "keyword": "And ",
  "line": 19
});
formatter.step({
  "name": "Inside Copra tab close the pop up and click on prices tab",
  "keyword": "Then ",
  "line": 20
});
formatter.step({
  "name": "Click on Request Approval and send the quote for approval for EMEA with COPRA failing error pop up",
  "keyword": "Then ",
  "line": 21
});
formatter.step({
  "name": "Verify the status of the quote",
  "keyword": "Then ",
  "line": 22
});
formatter.step({
  "name": "close the window",
  "keyword": "Then ",
  "line": 23
});
formatter.step({
  "name": "Click on Prod Rewrite GUI link",
  "keyword": "When ",
  "line": 24
});
formatter.step({
  "name": "GUI home page should open",
  "keyword": "Then ",
  "line": 25
});
formatter.step({
  "name": "Click on SelectARole dropdown and select TRPR-EU Pricer ZZ-Dummy-France",
  "keyword": "And ",
  "line": 26
});
formatter.step({
  "name": "Click on Start button",
  "keyword": "And ",
  "line": 27
});
formatter.step({
  "name": "Search for the quoteID from excel sheet for EMEA prod rw",
  "keyword": "And ",
  "line": 28
});
formatter.step({
  "name": "Click on Reviwer tab and add a reviwer",
  "keyword": "Then ",
  "line": 29
});
formatter.step({
  "name": "Click on pricing tab",
  "keyword": "Then ",
  "line": 30
});
formatter.step({
  "name": "Approve the quote using Approval tab for EMEA with error pop up",
  "keyword": "Then ",
  "line": 31
});
formatter.step({
  "name": "Verify the quote status and check the reports",
  "keyword": "And ",
  "line": 32
});
formatter.step({
  "name": "Navigate to COPRA screen and mark as COPRA PRICED",
  "keyword": "Then ",
  "line": 33
});
formatter.match({
  "location": "Smoketest.click_on_Prod_Rewrite_GUI_link()"
});
formatter.result({
  "duration": 89587150535,
  "status": "passed"
});
formatter.match({
  "location": "Smoketest.GUI_home_page_should_open()"
});
formatter.result({
  "duration": 32660032,
  "status": "passed"
});
formatter.match({
  "location": "Smoketest.click_on_SelectARole_dropdown_and_select_EU_Transaction_Quotes_GTS_Opportunity_Owner_ZZ()"
});
formatter.result({
  "duration": 282384261,
  "status": "passed"
});
formatter.match({
  "location": "Smoketest.Click_on_Start_button()"
});
formatter.result({
  "duration": 1158578596,
  "status": "passed"
});
formatter.match({
  "location": "Smoketest.Home_page_should_open()"
});
formatter.result({
  "duration": 6405025265,
  "status": "passed"
});
formatter.match({
  "location": "Smoketest.Click_on_Create_quote_button()"
});
formatter.result({
  "duration": 6157658470,
  "status": "passed"
});
formatter.match({
  "location": "Smoketest.new_quote_page_should_open_for_prod_rw_EMEA()"
});
formatter.result({
  "duration": 961219030,
  "status": "passed"
});
formatter.match({
  "location": "Smoketest.enter_QuoteTitle_OppID_OppOwnerName()"
});
formatter.result({
  "duration": 7167714712,
  "status": "passed"
});
formatter.match({
  "location": "Smoketest.click_on_Save_and_Continue()"
});
formatter.result({
  "duration": 5260096404,
  "status": "passed"
});
formatter.match({
  "location": "Smoketest.on_Customer_information_page_click_on_Search_Customer_for_EMEA()"
});
formatter.result({
  "duration": 17072563271,
  "status": "passed"
});
formatter.match({
  "location": "Smoketest.click_on_Save_and_Continue_on_customer_tab()"
});
formatter.result({
  "duration": 7045788569,
  "status": "passed"
});
formatter.match({
  "location": "Smoketest.add_product_manually()"
});
formatter.result({
  "duration": 19083891269,
  "status": "passed"
});
formatter.match({
  "location": "Smoketest.click_on_collect_pricing()"
});
formatter.result({
  "duration": 38467111945,
  "status": "passed"
});
formatter.match({
  "location": "Smoketest.click_on_Save_and_Continue_on_Configuration_tab()"
});
formatter.result({
  "duration": 9198429180,
  "status": "passed"
});
formatter.match({
  "location": "Smoketest.inside_Copra_tab_close_the_pop_up_and_click_on_prices_tab()"
});
formatter.result({
  "duration": 6999898260,
  "status": "passed"
});
formatter.match({
  "location": "Smoketest.click_on_Request_Approval_and_send_the_quote_for_approval_for_EMEA_with_COPRA_failing_error_pop_up()"
});
formatter.result({
  "duration": 34924172110,
  "status": "passed"
});
formatter.match({
  "location": "Smoketest.verify_the_status_of_the_quote()"
});
formatter.result({
  "duration": 2068392804,
  "status": "passed"
});
formatter.match({
  "location": "Smoketest.close_the_window()"
});
formatter.result({
  "duration": 1015550229,
  "status": "passed"
});
formatter.match({
  "location": "Smoketest.click_on_Prod_Rewrite_GUI_link()"
});
formatter.result({
  "duration": 104808964407,
  "status": "passed"
});
formatter.match({
  "location": "Smoketest.GUI_home_page_should_open()"
});
formatter.result({
  "duration": 33744371,
  "status": "passed"
});
formatter.match({
  "location": "Smoketest.click_on_SelectARole_dropdown_and_select_TRPREU_Pricer_ZZ_Dummy_France()"
});
formatter.result({
  "duration": 271042430,
  "status": "passed"
});
formatter.match({
  "location": "Smoketest.Click_on_Start_button()"
});
formatter.result({
  "duration": 1177068143,
  "status": "passed"
});
formatter.match({
  "location": "Smoketest.search_for_the_quoteID_from_excel_sheet_for_EMEA_prod_rw()"
});
formatter.result({
  "duration": 23158792787,
  "status": "passed"
});
formatter.match({
  "location": "Smoketest.click_on_Reviwer_tab_and_add_a_reviwer()"
});
formatter.result({
  "duration": 22438209618,
  "status": "passed"
});
formatter.match({
  "location": "Smoketest.click_on_pricing_tab()"
});
formatter.result({
  "duration": 2318847513,
  "status": "passed"
});
formatter.match({
  "location": "Smoketest.approve_the_quote_using_Approval_tab_for_EMEA_with_error_pop_up()"
});
formatter.result({
  "duration": 39219433680,
  "status": "passed"
});
formatter.match({
  "location": "Smoketest.verify_the_quote_status_and_check_the_reports()"
});
formatter.result({
  "duration": 37664865979,
  "status": "passed"
});
formatter.match({
  "location": "Smoketest.Navigate_to_COPRA_screen_and_mark_as_COPRA_PRICED()"
});
formatter.result({
  "duration": 11251770641,
  "status": "passed"
});
formatter.after({
  "duration": 150570550,
  "status": "passed"
});
formatter.uri("ProdRWTestcase_LA.feature");
formatter.feature({
  "id": "verify-la-geo-in-production",
  "description": "",
  "name": "Verify LA geo in production",
  "keyword": "Feature",
  "line": 1
});
formatter.scenario({
  "id": "verify-la-geo-in-production;test-production-ibm-gui-flow-for-la",
  "tags": [
    {
      "name": "@ProdSanityLA",
      "line": 3
    }
  ],
  "description": "",
  "name": "Test production IBM GUI flow for LA",
  "keyword": "Scenario",
  "line": 4,
  "type": "scenario"
});
formatter.step({
  "name": "Click on Prod Rewrite GUI link",
  "keyword": "Given ",
  "line": 6
});
formatter.step({
  "name": "GUI home page should open",
  "keyword": "Then ",
  "line": 7
});
formatter.step({
  "name": "DUMMY Y1 Transaction Quotes Profit Opportunity Owner",
  "keyword": "And ",
  "line": 8
});
formatter.step({
  "name": "Click on Start button",
  "keyword": "And ",
  "line": 9
});
formatter.step({
  "name": "Home page should open",
  "keyword": "Then ",
  "line": 10
});
formatter.step({
  "name": "Click on Create quote button",
  "keyword": "And ",
  "line": 11
});
formatter.step({
  "name": "New quote page should open for prod rw LA",
  "keyword": "Then ",
  "line": 12
});
formatter.step({
  "name": "Enter QuoteTitle OppID OppOwnerName for AP /LA",
  "keyword": "Then ",
  "line": 13
});
formatter.step({
  "name": "Click on Save and Continue",
  "keyword": "And ",
  "line": 14
});
formatter.step({
  "name": "On Customer information page click on Add a new Customer",
  "keyword": "Then ",
  "line": 15
});
formatter.step({
  "name": "Enter customer name",
  "keyword": "Then ",
  "line": 16
});
formatter.step({
  "name": "Click on Save and Continue on customer tab",
  "keyword": "And ",
  "line": 17
});
formatter.step({
  "name": "Add product manually",
  "keyword": "Then ",
  "line": 18
});
formatter.step({
  "name": "click on collect pricing",
  "keyword": "Then ",
  "line": 19
});
formatter.step({
  "name": "Click on Save and Continue on Configuration tab",
  "keyword": "And ",
  "line": 20
});
formatter.step({
  "name": "Click on Request Approval and send the quote for approval for LA",
  "keyword": "Then ",
  "line": 21
});
formatter.step({
  "name": "Verify the status of the quote",
  "keyword": "Then ",
  "line": 22
});
formatter.step({
  "name": "Approve the quote using Approval tab",
  "keyword": "Then ",
  "line": 23
});
formatter.step({
  "name": "Verify the quote status and check the reports",
  "keyword": "And ",
  "line": 24
});
formatter.match({
  "location": "Smoketest.click_on_Prod_Rewrite_GUI_link()"
});
formatter.result({
  "duration": 80759135670,
  "status": "passed"
});
formatter.match({
  "location": "Smoketest.GUI_home_page_should_open()"
});
formatter.result({
  "duration": 39502525,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 7
    }
  ],
  "location": "Smoketest.dummy_Y_Transaction_Quotes_Profit_Opportunity_Owner(int)"
});
formatter.result({
  "duration": 284316884,
  "status": "passed"
});
formatter.match({
  "location": "Smoketest.Click_on_Start_button()"
});
formatter.result({
  "duration": 1167744164,
  "status": "passed"
});
formatter.match({
  "location": "Smoketest.Home_page_should_open()"
});
formatter.result({
  "duration": 7201750026,
  "status": "passed"
});
formatter.match({
  "location": "Smoketest.Click_on_Create_quote_button()"
});
formatter.result({
  "duration": 6192006144,
  "status": "passed"
});
formatter.match({
  "location": "Smoketest.new_quote_page_should_open_for_prod_rw_LA()"
});
formatter.result({
  "duration": 305362437,
  "status": "passed"
});
formatter.match({
  "location": "Smoketest.enter_QuoteTitle_OppID_OppOwnerNameAPLA()"
});
formatter.result({
  "duration": 7011705063,
  "status": "passed"
});
formatter.match({
  "location": "Smoketest.click_on_Save_and_Continue()"
});
formatter.result({
  "duration": 5277041993,
  "status": "passed"
});
formatter.match({
  "location": "Smoketest.on_Customer_information_page_click_on_Add_a_new_Customer()"
});
formatter.result({
  "duration": 6429051636,
  "status": "passed"
});
formatter.match({
  "location": "Smoketest.enter_customer_name()"
});
formatter.result({
  "duration": 3450977601,
  "status": "passed"
});
formatter.match({
  "location": "Smoketest.click_on_Save_and_Continue_on_customer_tab()"
});
formatter.result({
  "duration": 5305551639,
  "status": "passed"
});
formatter.match({
  "location": "Smoketest.add_product_manually()"
});
formatter.result({
  "duration": 21051809998,
  "status": "passed"
});
formatter.match({
  "location": "Smoketest.click_on_collect_pricing()"
});
formatter.result({
  "duration": 38499291833,
  "status": "passed"
});
formatter.match({
  "location": "Smoketest.click_on_Save_and_Continue_on_Configuration_tab()"
});
formatter.result({
  "duration": 9190828096,
  "status": "passed"
});
formatter.match({
  "location": "Smoketest.click_on_Request_Approval_and_send_the_quote_for_approval_for_LA()"
});
formatter.result({
  "duration": 38020955861,
  "status": "passed"
});
formatter.match({
  "location": "Smoketest.verify_the_status_of_the_quote()"
});
formatter.result({
  "duration": 2096513782,
  "status": "passed"
});
formatter.match({
  "location": "Smoketest.approve_the_quote_using_Approval_tab()"
});
formatter.result({
  "duration": 28890582134,
  "status": "passed"
});
formatter.match({
  "location": "Smoketest.verify_the_quote_status_and_check_the_reports()"
});
formatter.result({
  "duration": 37658587967,
  "status": "passed"
});
formatter.after({
  "duration": 67200476,
  "status": "passed"
});
formatter.uri("ProdRWTestcase_NA.feature");
formatter.feature({
  "id": "verify-na-geo-in-production",
  "description": "",
  "name": "Verify NA geo in production",
  "keyword": "Feature",
  "line": 1
});
formatter.scenario({
  "id": "verify-na-geo-in-production;test-production-ibm-gui-flow-for-na",
  "tags": [
    {
      "name": "@ProdSanityNA",
      "line": 3
    }
  ],
  "description": "",
  "name": "Test production IBM GUI flow for NA",
  "keyword": "Scenario",
  "line": 4,
  "type": "scenario"
});
formatter.step({
  "name": "Click on Prod Rewrite GUI link",
  "keyword": "Given ",
  "line": 6
});
formatter.step({
  "name": "GUI home page should open",
  "keyword": "Then ",
  "line": 7
});
formatter.step({
  "name": "Click on SelectARole dropdown and select X1 Channel Pricer",
  "keyword": "And ",
  "line": 8
});
formatter.step({
  "name": "Click on Start button",
  "keyword": "And ",
  "line": 9
});
formatter.step({
  "name": "Home page should open",
  "keyword": "Then ",
  "line": 10
});
formatter.step({
  "name": "Click on Create quote button",
  "keyword": "And ",
  "line": 11
});
formatter.step({
  "name": "New quote page should open for prod rw NA",
  "keyword": "Then ",
  "line": 12
});
formatter.step({
  "name": "Enter QuoteTitle OppID OppOwnerName",
  "keyword": "Then ",
  "line": 13
});
formatter.step({
  "name": "Click on Save and Continue",
  "keyword": "And ",
  "line": 14
});
formatter.step({
  "name": "On Customer information page click on Search Customer for NA",
  "keyword": "Then ",
  "line": 15
});
formatter.step({
  "name": "Click on Save and Continue on customer tab",
  "keyword": "And ",
  "line": 16
});
formatter.step({
  "name": "Add product manually",
  "keyword": "Then ",
  "line": 17
});
formatter.step({
  "name": "click on collect pricing",
  "keyword": "Then ",
  "line": 18
});
formatter.step({
  "name": "Click on Save and Continue on Configuration tab",
  "keyword": "And ",
  "line": 19
});
formatter.step({
  "name": "Click on Request Approval and send the quote for approval",
  "keyword": "Then ",
  "line": 20
});
formatter.step({
  "name": "Verify the status of the quote",
  "keyword": "Then ",
  "line": 21
});
formatter.step({
  "name": "Approve the quote using Approval tab",
  "keyword": "Then ",
  "line": 22
});
formatter.step({
  "name": "Verify the quote status and check the reports",
  "keyword": "And ",
  "line": 23
});
formatter.step({
  "name": "Navigate to COPRA screen for NA",
  "keyword": "Then ",
  "line": 24
});
formatter.match({
  "location": "Smoketest.click_on_Prod_Rewrite_GUI_link()"
});
formatter.result({
  "duration": 223052742174,
  "status": "passed"
});
formatter.match({
  "location": "Smoketest.GUI_home_page_should_open()"
});
formatter.result({
  "duration": 40689943,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 42
    }
  ],
  "location": "Smoketest.click_on_SelectARole_dropdown_and_select_X_Channel_Pricer(int)"
});
formatter.result({
  "duration": 283312867,
  "status": "passed"
});
formatter.match({
  "location": "Smoketest.Click_on_Start_button()"
});
formatter.result({
  "duration": 1225999511,
  "status": "passed"
});
formatter.match({
  "location": "Smoketest.Home_page_should_open()"
});
formatter.result({
  "duration": 34620043053,
  "status": "passed"
});
formatter.match({
  "location": "Smoketest.Click_on_Create_quote_button()"
});
formatter.result({
  "duration": 6206087829,
  "status": "passed"
});
formatter.match({
  "location": "Smoketest.new_quote_page_should_open_for_prod_rw_NA()"
});
formatter.result({
  "duration": 1249388219,
  "status": "passed"
});
formatter.match({
  "location": "Smoketest.enter_QuoteTitle_OppID_OppOwnerName()"
});
formatter.result({
  "duration": 7003540390,
  "status": "passed"
});
formatter.match({
  "location": "Smoketest.click_on_Save_and_Continue()"
});
formatter.result({
  "duration": 5241840236,
  "status": "passed"
});
formatter.match({
  "location": "Smoketest.on_Customer_information_page_click_on_Search_Customer_for_NA()"
});
formatter.result({
  "duration": 18091800700,
  "status": "failed",
  "error_message": "org.openqa.selenium.ElementNotVisibleException: Element is not currently visible and so may not be interacted with\nCommand duration or timeout: 15.06 seconds\nBuild info: version: \u00272.53.0\u0027, revision: \u002735ae25b1534ae328c771e0856c93e187490ca824\u0027, time: \u00272016-03-15 10:43:46\u0027\nSystem info: host: \u0027IBM638-PC073DB9\u0027, ip: \u00279.78.199.12\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.7.0_25\u0027\nSession ID: b21fbb5d-3142-4aac-b578-2ed7efa87952\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities [{platform\u003dWINDOWS, acceptSslCerts\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, databaseEnabled\u003dtrue, browserName\u003dfirefox, handlesAlerts\u003dtrue, nativeEvents\u003dfalse, webStorageEnabled\u003dtrue, rotatable\u003dfalse, locationContextEnabled\u003dtrue, applicationCacheEnabled\u003dtrue, takesScreenshot\u003dtrue, version\u003d43.0.1}]\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:678)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:327)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:85)\r\n\tat StepDef.Smoketest.on_Customer_information_page_click_on_Search_Customer_for_NA(Smoketest.java:523)\r\n\tat ✽.Then On Customer information page click on Search Customer for NA(ProdRWTestcase_NA.feature:15)\r\nCaused by: org.openqa.selenium.ElementNotVisibleException: Element is not currently visible and so may not be interacted with\nBuild info: version: \u00272.53.0\u0027, revision: \u002735ae25b1534ae328c771e0856c93e187490ca824\u0027, time: \u00272016-03-15 10:43:46\u0027\nSystem info: host: \u0027IBM638-PC073DB9\u0027, ip: \u00279.78.199.12\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.7.0_25\u0027\nDriver info: driver.version: unknown\r\n\tat \u003canonymous class\u003e.fxdriver.preconditions.visible(file:///C:/Users/IBM_AD~1/AppData/Local/Temp/anonymous7416048896674236198webdriver-profile/extensions/fxdriver@googlecode.com/components/command-processor.js:10092)\r\n\tat \u003canonymous class\u003e.DelayedCommand.prototype.checkPreconditions_(file:///C:/Users/IBM_AD~1/AppData/Local/Temp/anonymous7416048896674236198webdriver-profile/extensions/fxdriver@googlecode.com/components/command-processor.js:12644)\r\n\tat \u003canonymous class\u003e.DelayedCommand.prototype.executeInternal_/h(file:///C:/Users/IBM_AD~1/AppData/Local/Temp/anonymous7416048896674236198webdriver-profile/extensions/fxdriver@googlecode.com/components/command-processor.js:12661)\r\n\tat \u003canonymous class\u003e.fxdriver.Timer.prototype.setTimeout/\u003c.notify(file:///C:/Users/IBM_AD~1/AppData/Local/Temp/anonymous7416048896674236198webdriver-profile/extensions/fxdriver@googlecode.com/components/command-processor.js:625)\r\n"
});
formatter.match({
  "location": "Smoketest.click_on_Save_and_Continue_on_customer_tab()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Smoketest.add_product_manually()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Smoketest.click_on_collect_pricing()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Smoketest.click_on_Save_and_Continue_on_Configuration_tab()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Smoketest.click_on_Request_Approval_and_send_the_quote_for_approval()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Smoketest.verify_the_status_of_the_quote()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Smoketest.approve_the_quote_using_Approval_tab()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Smoketest.verify_the_quote_status_and_check_the_reports()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Smoketest.Navigate_to_COPRA_screen_for_NA()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 8357609741,
  "status": "passed"
});
formatter.uri("SendExcel.feature");
formatter.feature({
  "id": "send-excel-sheet",
  "description": "",
  "name": "Send excel sheet",
  "keyword": "Feature",
  "line": 1
});
formatter.scenario({
  "id": "send-excel-sheet;send-quote-id\u0027s",
  "tags": [
    {
      "name": "@SendExcel",
      "line": 3
    }
  ],
  "description": "",
  "name": "Send quote id\u0027s",
  "keyword": "Scenario",
  "line": 4,
  "type": "scenario"
});
formatter.step({
  "name": "Send excel in email",
  "keyword": "Given ",
  "line": 5
});
formatter.match({
  "location": "Smoketest.send_excel_in_email()"
});
formatter.result({
  "duration": 15830907,
  "status": "passed"
});
formatter.after({
  "duration": 73972020,
  "status": "passed"
});
});