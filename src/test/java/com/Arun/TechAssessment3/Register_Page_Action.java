package com.Arun.TechAssessment3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Register_Page_Action {
	WebDriver driver;
	Register_Page_Loctor DemoRegisterPageLocator = null; 
	public Register_Page_Action() {
		this.DemoRegisterPageLocator = new Register_Page_Loctor();
		PageFactory.initElements(Demo_Helper_Class.getDriver(),DemoRegisterPageLocator);		
	}
//	public void Register() {
//		DemoRegisterPageLocator.Register.click();
//	}
//	public void Gender() {
//		DemoRegisterPageLocator.Gender.click();
//	}
	public void FirstName(String FirstName) {
		DemoRegisterPageLocator.FirstName.sendKeys(FirstName);
	}
	public void LastName(String Lastname) {
		DemoRegisterPageLocator.LastName.sendKeys(Lastname);
	}
	public void Email(String Email) {
		DemoRegisterPageLocator.Email.sendKeys(Email);
	}
	public void Password(String UserPassword) {
		DemoRegisterPageLocator.Password.sendKeys(UserPassword);
	}
	public void Confirm_Password(String ConfirmPassword) {
		DemoRegisterPageLocator.Confirm_Password.sendKeys(ConfirmPassword);
	}
//	public void Register_Button() {
//		DemoRegisterPageLocator.Register_Button.click();
//	}
	public Boolean RegisterCompleted() {
		return DemoRegisterPageLocator.RegisterCompleted.isDisplayed();
		
	}
	
}
