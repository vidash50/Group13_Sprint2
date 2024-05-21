@logout
Feature: Users should be able to login
  US02 As a user, I should be able to log out.

  Background: User is already in the log in page
    Given the user is on the login page


#  1. Verify the user logs out by clicking “Log out” button in profile menu and lands on
#  Log in page.
#  2. Verify that the user can see 5 options under the profile name.
#  (Documentation, Support, Preferences, My Odoo.com account, Log out)
@AC01
  Scenario Outline: Verify log out functionality

    Given the user logged in with username as "<userName>" and "<password>"
    Then the user should see username on the homepage.
    Then the user click on profile menu
    Then the user should see the logout button and click

    Examples:

      | userName               | password   |
      | eventscrmmanager10@info.com | eventscrmmanager |
      | expensesmanager15@info.com | expensesmanager |
      | posmanager55@info.com  | posmanager |
      | salesmanager10@info.com | salesmanager |
      | imm13@info.com | inventorymanager |

