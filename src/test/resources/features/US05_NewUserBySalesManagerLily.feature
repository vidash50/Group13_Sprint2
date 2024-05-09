@B33G13-73
Feature: Default

	Background: User is already in the log in page
		Given the user is on the login page

	
	@B33G13-71
	Scenario:  The user can create a new customer by filling only the Name input box and
	after clicking the save button, the information of the customer which the user entered should be displayed.
		Given user is on the "sales manager" profile
		When "sales manager" can create a new customer
		And filling only the Name input box 
		And click the save button 
		Then user sees information of the customer is displayed.	

	
	@B33G13-72
	Scenario: All input boxes can be editable by clicking any customer and then the edit button. 
		Given user sees information of the customer is displayed.
		And user clicks on edit 
		Then user fills out all the empty input boxes 
		Then user clicks save button