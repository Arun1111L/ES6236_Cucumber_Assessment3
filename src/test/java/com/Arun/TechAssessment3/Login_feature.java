package com.Arun.TechAssessment3;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class Login_feature {
	Login_Action DemoLogin = new Login_Action();
	Utility_Class data = new Utility_Class();
		
	@Given("User is in the DemoWeb HomePage")
	public void user_is_in_the_demo_web_home_page() {
		HelperClass.openPage(data.strUrl);
	    System.out.println("Home page");
	} 
	
	@When("User click login")
	public void user_click_login() { 
		DemoLogin.LoginPage();
		   System.out.println("User click login");
	}

	@When("User enter the valid Email and password")
	public void user_enter_the_valid_email_and_password() {
		DemoLogin.login(data.strEmail, data.strPassword);
		   System.out.println("User enter the valid Email and password");
	}

	@When("User Click rememberme")
	public void user_click_rememberme() {
		DemoLogin.RemeberMe();
		 System.out.println("User click remember Me");
	    
	}

	@When("User Click the login button")
	public void user_click_the_login_button() {
		DemoLogin.LoginButton();
		   System.out.println("User Click the login button");
	
	}
	@Then("User login and get Successful Message")
	public void user_login_and_get_successful_message() {
		Assert.assertTrue(DemoLogin.verifyText().contains("arun11@gmail.com"));
		   System.out.println("User login and get Successful Message");
	}

	@When("User enter the Invalid Email and password")
	public void user_enter_the_invalid_email_and_password() {
		DemoLogin.Invalidlogin(data.strInvalidEmail, data.strInvalidPassword);
		   System.out.println("User enter the Invalid Email and password");
	}

	@Then("User get Error Message")
	public void user_get_error_message() {
		Assert.assertTrue(DemoLogin.VerifyErrorMessage().contains("Login was unsuccessful. Please correct the errors and try again."));
		   System.out.println("sucessfull login");
	}



}
