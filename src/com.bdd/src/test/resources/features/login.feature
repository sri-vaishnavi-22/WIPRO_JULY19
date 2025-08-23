Feature: Login Functionality
 


Background: Given User is on the login page
#Given User is on the login page
 
 @regression
Scenario: Verify the login functionality for valid credentials
   Given User is on the login page
   When user enters the username
   And user enters teh password
   And user clicks on the login button
   Then user is navigated to home page  
   
   #@regression @negative
  #Scenario: Verify login with invalid username
    #Given User is on the login page
    #When user enters the username "invalidUser"
    #And user enters the password "validPassword"
    #And user clicks on the login button
    #Then error message "Invalid username or password" should be displayed
    
  @sanity
Scenario Outline: Verify the login functionality for valid credentials using parameters
	Given User is on the login page
	When user enters the "<username>" and "<password>"
	And user clicks on the login button	
	Then user is naqvigated to home page 
	Examples:
	|username| password |
	|Admin| admin123 |
	|Admin | admin123 |
	|Admin | admin123 |