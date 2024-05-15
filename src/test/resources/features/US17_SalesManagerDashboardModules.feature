@B33G13-82
Feature: Default
	Background: User is already in the log in page
		Given the user is on the login page
		Given the user logged in with username as "salesmanager6@info.com" and password as "salesmanager"


	@B28-220
	Scenario: As a sales manager, I should be able to access the different modules.
		Given user is on sales manager profile
		#When user is on sales manager dashboard
		Then user sees all modules on the dashboard

		|Discuss|
		|Calendar|
		|Notes|
		|Contacts|
		|CRM|
		|Sales|
		|Website|
		|Point of Sale|
		|Purchases|
		|Inventory|
		|Repairs|
		|Invoicing|
		|Email Marketing|
		|Events|
		|Employees|
		|Leaves|
		|Expenses|
		|Maintenance|
		|Dashboards|
