@login
Feature: Users should be able to login

  Background: User is already in the log in page
    Given the user is on the login page

  @wip
  Scenario: Verify login with different user types
    Given the user logged in as "CRM_manager"
#    Given the user logged in with username as "eventscrmmanager10@info.com" and password as "eventscrmmanager"