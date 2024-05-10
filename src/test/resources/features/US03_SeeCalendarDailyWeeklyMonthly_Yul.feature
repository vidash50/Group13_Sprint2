
Feature: Users should be able to see the calendar page as daily, weekly (as a default) and monthly

  Background: User is already in the log in page
    Given the user is on the login page


  Scenario: Verify login with different user types
    Given the user logged in as "CRM_manager"
#    Given the user logged in with username as "eventscrmmanager10@info.com" and password as "eventscrmmanager"


  @log_calendar_weekly
  Scenario: Verify users see the calendar as a weekly
    Given the user logged in as "CRM_manager"
    When the user select Calendar module from Discuss (landing) page
    And the user clicks on the Week button
    Then verify that user see the calendar as weekly

  @log_calendar_daily
  Scenario: Verify users see the calendar as a daily
    Given the user logged in as "CRM_manager"
    When the user select Calendar module from Discuss (landing) page
    And the user clicks on the Day button
    Then verify that user see the calendar as daily

  @log_calendar_daily
  Scenario: Verify users see the calendar as a monthly
    Given the user logged in as "CRM_manager"
    When the user select Calendar module from Discuss (landing) page
    And the user clicks on the Month button
    Then verify that user see the calendar as monthly





  @dekked
  Scenario Outline: Verify login with different user types

    Given the user logged in with username as "<userName>" and password as "<password>"

    Examples:

      | userName                     | password         |
      | posmanager6@info.com         | posmanager       |
      | posmanager16@info.com        | posmanager       |
      | posmanager61@info.com        | posmanager       |
      | eventscrmmanager10@info.com  | eventscrmmanager |
      | eventscrmmanager100@info.com | eventscrmmanager |
      | eventscrmmanager59@info.com  | eventscrmmanager |
      | salesmanager6@info.com       | salesmanager     |
      | salesmanager49@info.com      | salesmanager     |
      | salesmanager101@info.com     | salesmanager     |
      | imm10@info.com               | inventorymanager |
      | imm83@info.com               | inventorymanager |
      | imm160@info.com              | inventorymanager |
      | expensesmanager10@info.com   | expensesmanager  |
      | expensesmanager74@info.com   | expensesmanager  |
      | expensesmanager110@info.com  | expensesmanager  |