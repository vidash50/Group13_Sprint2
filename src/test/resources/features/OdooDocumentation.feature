@B33G13-76
Feature: Default


  @B33G13-74
  Scenario: Odoo Documentation Functionality
    Given Given the user logged in with username as "eventscrmmanager10@info.com" and password as "eventscrmmanager"
    And user click the profile menu
    Then user should see the “Documentation” button on the profile menu


  @B33G13-75
  Scenario: Verify that 4 main document topics (User Docs, Install and Maintain, Developer, Contribute) are listed in Odoo Documentation.
    Given the user logged in with username as "eventscrmmanager10@info.com" and password as "eventscrmmanager"
    And the user click the documentation button
    Then the user should be on the documentation page and see User Docs, Install and Maintain, Developer, Contributing