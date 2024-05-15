@B33G13-82
Feature: Default

	
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
