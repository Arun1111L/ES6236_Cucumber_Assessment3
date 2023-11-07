Feature: User login to the DemoWebShop
 

  @ValidData
 
  Scenario: User login to the DemoWebShop with valid username and password
  Given User is in the DemoWeb HomePage
  When User click login
	And User enter the valid Email and password
	And User Click rememberme
	And User Click the login button
	Then User login and get Successful Message

  @InvalidData
  Scenario: User login to the DemoWebShop with Invalid username and password
  Given User is in the DemoWeb HomePage
  When User click login
	And User enter the Invalid Email and password
	And User Click rememberme
	And User Click the login button
	Then User get Error Message
