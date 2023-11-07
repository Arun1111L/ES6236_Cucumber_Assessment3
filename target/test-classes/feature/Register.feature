
Feature: To Register in Demo Webshop Application
  Scenario: Register the user details 
    Given User is on the Demo Webshop Application page
   Then User click Register 
   Then User click the Gender 
    When User enter the FirstName
    | FirstName |
    |  Arun     |
    And User enter the LastName
    | LastName |
    |    Kar   |
    And User enter the Email
    |     E-mail     | 
    | arunkar11@gmail.com | 
    And User enter the UserPassword
    | Password |
    | Arunkar@1111|
	  And User enter the ConfirmPassword
	  |ConfirmPassword |
	  |   Arunkar@111    |
    Then User click the RegisterButton
    Then Check weather User register successfully
     
    
    