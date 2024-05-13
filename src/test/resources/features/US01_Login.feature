@login
Feature: Users should be able to login

  Background: User is already in the log in page
    Given the user is on the login page

    #  Scenario: Verify login with different user types
#    Given the user logged in as "CRM_manager"
#    Given the user logged in with username as "eventscrmmanager10@info.com" and password as "eventscrmmanager"

#  1. Verify that the user can log in with valid credentials either by clicking on the
#  "Login" button or hitting the "Enter" key on the keyboard, and see his/her username
#  in the home page after successfully login.

#  2. Verify the "Wrong login/password" error message should be displayed after
#  entering the invalid credentials (valid username-invalid password and invalid
#  username-valid password).

#  3. Verify that the user gets the "Please fill out this field." message for at least
#  one blank field.
  @AC1
  Scenario Outline: Verify login with different user types
    Given the user logged in as "<userType>"
    Examples:
      | userType          |
      | CRM_manager       |
      | sales manager     |
      | inventory manager |
      | expenses manager  |

  @AC2
  Scenario Outline: Verify login with "Wrong login/password"
    Given user logged in with incorrect username as "<userName-incorrect>" and incorrect password as "<password-incorrect>"
    Then user should see Wrong login message displayed
    Examples:
      | userName-incorrect        | password-incorrect |
      | posmanager500@info.com    | posmanager2        |
      | eventscrmmanager@info.com | eventscrmmanager3  |
      | salesmanager7@info.com    | salesmanage        |
      | imm10@info.com            | inventmanager      |

  @AC3
  Scenario Outline: Verify one blank field
#    Given the user logged in with only "<userName>"
    Given the user logged without providing  "<userName>" and/or "<password>"
    Then the user should see Please fill out this field message displayed
    Examples:
      | userName                    | password          |
      | posmanager6@info.com        |                   |
      |                             | eventscrmmanager  |
      | posmanager20@info.com       |                   |
      |                             | eventscrmmanager  |
      | salesmanager7@info.com      |                   |
      |                             | inventmanager     |
