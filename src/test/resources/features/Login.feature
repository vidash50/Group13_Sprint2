@login
Feature: Users should be able to login

  Background: User is already in the log in page
    Given the user is on the login page

  @wip
  Scenario: Verify login with different user types
    Given the user logged in as "CRM_manager"
#    Given the user logged in with username as "eventscrmmanager10@info.com" and password as "eventscrmmanager"



  @dekked
  Scenario Outline: Verify login with different user types

    Given the user logged in with username as "<userName>" and password as "<password>"

    Examples:

      | userName               | password   |
      | posmanager6@info.com   | posmanager |
      | posmanager16@info.com  | posmanager |
      | posmanager61@info.com  | posmanager |
      | posmanager50@info.com  | posmanager |
      | posmanager126@info.com | posmanager |