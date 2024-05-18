@B33G13-87
Feature: Default
#Feature: Users should be able to see the calendar page as daily, weekly (as a default) and monthly
  Background: User is already in the log in page
#    Given the user logged in as "CRM_manager"
 #   Given the user logged in as "sales manager"
    Given the user logged in as "inventory manager"
 #   Given the user logged in as "expenses manager"
    #Given the user logged in as "posmanager" java.lang.IllegalArgumentException: Keys to send should be a not null CharSequence
    #Given the user logged in with username as "eventscrmmanager100@info.com" and password as "eventscrmmanager"
    #Given the user logged in with username as "expensesmanager110@info.com" and password as "expensesmanager"
    #Given the user logged in with username as "posmanager68@info.com" and password as "posmanager"
    #Given the user logged in with username as "salesmanager105@info.com" and password as "salesmanager"
    #Given the user logged in with username as "imm160@info.com" and password as "inventorymanager"



  @B33G13-85
  Scenario: Verify users see the calendar as a weekly
    When the user select Calendar module from Discuss (landing) page
    And the user clicks on the Week button
    Then verify that user see the calendar as weekly

  @B33G13-84
  Scenario: Verify users see the calendar as a daily
    When the user select Calendar module from Discuss (landing) page
    And the user clicks on the Day button
    Then verify that user see the calendar as daily

  @B33G13-86
  Scenario: Verify users see the calendar as a monthly
    When the user select Calendar module from Discuss (landing) page
    And the user clicks on the Month button
    Then verify that user see the calendar as monthly






