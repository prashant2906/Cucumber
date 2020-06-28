Feature: Test Authorization and settings module in Production RW module

  Scenario: Test Authorization url for DR
    Given Click on Auth url for DR
    Then select AUTHVIEW-WW Administrator for Registration (VIEW ONLY) from the list
    Then click on launch application
    Then Check if all the links are working fine in auth

  Scenario: Test Settings url for DR
    Given Click on Settings url for DR
    Then select GMCADMIN - AP Grid Manager Country (V1-DUMMY-SINGAPORE) from the list
    Then click on launch epricer settings
    Then Check if all the links are working fine in settings

  @ProdSanitySettingsAuth
  Scenario: Test Settings url
    Given Click on Settings url
    Then select GMCADMIN - AP Grid Manager Country (V1-DUMMY-SINGAPORE) from the list
    Then click on launch epricer settings
    Then Check if all the links are working fine in settings

  @ProdSanitySettingsAuth
  Scenario: Test Authorization url
    Given Click on Auth url
    Then select AUTHVIEW-WW Administrator for Registration (VIEW ONLY) from the list
    Then click on launch application
    Then Check if all the links are working fine in auth
