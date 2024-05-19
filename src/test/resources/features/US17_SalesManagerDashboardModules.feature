@B33G13-82
Feature: Default

	Background: User is already in the log in page
		Given the user is on the login page
		Given the user logged in with username as "salesmanager6@info.com" and password as "salesmanager"


	@B28-220
	Scenario: As a sales manager, I should be able to access the different modules.
		Given user is on sales manager profile
		#When user sees all modules on the dashboard
		Then user clicks on each module on the dashboard


