package com.Arun.TechAssessment3;

import java.time.Duration;
import java.util.List;
import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Register_Feature_Class {
	Register_Page_Action DemoRegisterPageLocator = new Register_Page_Action();
	
	WebDriver driver = new EdgeDriver();
	Demo_Helper_Class Helper_Class = new Demo_Helper_Class();
	
	@Given("User is on the Demo Webshop Application page")
	public void user_is_on_the_demo_webshop_application_page() {
		driver.get("https://demowebshop.tricentis.com");	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(11));
	}

	@Then("User click Register")
	public void user_click_register() {
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).click();
	}
	@Then("User click the Gender")
	public void user_click_the_gender() {
		driver.findElement(By.xpath("//*[@id='gender-male']")).click();
	}

	@When("User enter the FirstName")
	public void user_enter_the_first_name(io.cucumber.datatable.DataTable dataTable) {
		System.out.println(" User Entered Firstname");
		List<Map<String,String>> signupForm =dataTable.asMaps(String.class,String.class);
		for(Map<String,String>form:signupForm) {
			String FirstName =form.get("FirstName");
			DemoRegisterPageLocator.FirstName(FirstName);
		}
	}

	@When("User enter the LastName")
	public void user_enter_the_last_name(io.cucumber.datatable.DataTable dataTable) {
		System.out.println("User Entered Lastname");
		List<Map<String,String>> signupForm =dataTable.asMaps(String.class,String.class);
		for(Map<String,String>form:signupForm) {
			String Lastname =form.get("Lastname");
			DemoRegisterPageLocator.LastName(Lastname);
		}
	}

	@When("User enter the Email")
	public void user_enter_the_email(io.cucumber.datatable.DataTable dataTable) {
		System.out.println("User Entered Email");
		List<Map<String,String>> signupForm =dataTable.asMaps(String.class,String.class);
		for(Map<String,String>form:signupForm) {
			String Email =form.get("Email");
			DemoRegisterPageLocator.Email(Email);
		}
	}

	@When("User enter the UserPassword")
	public void user_enter_the_user_password(io.cucumber.datatable.DataTable dataTable) {
		System.out.println("User Entered UserPassword");
		List<Map<String,String>> signupForm =dataTable.asMaps(String.class,String.class);
		for(Map<String,String>form:signupForm) {
			String UserPassword =form.get("UserPassword");
			DemoRegisterPageLocator.Password(UserPassword);
		}
	}

	@When("User enter the ConfirmPassword")
	public void user_enter_the_confirm_password(io.cucumber.datatable.DataTable dataTable) {
		System.out.println("User Entered ConfirmPassword");
		List<Map<String,String>> signupForm =dataTable.asMaps(String.class,String.class);
		for(Map<String,String>form:signupForm) {
			String ConfirmPassword =form.get("ConfirmPassword");
			DemoRegisterPageLocator.Confirm_Password(ConfirmPassword);
			
		}
	}

	@When("User click the RegisterButton")
	public void user_click_the_register_button() {
		driver.findElement(By.xpath("//*[@id='register-button']")).click();
	}

	@Then("Check weather User register successfully")
	public void check_weather_user_register_successfully() {
		Assert.assertEquals(DemoRegisterPageLocator.RegisterCompleted(),"Your registration completed");
	}



}
