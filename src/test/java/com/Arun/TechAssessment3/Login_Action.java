package com.Arun.TechAssessment3;

import org.openqa.selenium.support.PageFactory;

public class Login_Action {
	Login_Locator DemologinPageLocators=null;
	
	public Login_Action() {
		this.DemologinPageLocators=new Login_Locator();
		PageFactory.initElements(HelperClass.getDriver(), DemologinPageLocators);
	}
	public void LoginPage() {
		DemologinPageLocators.LoginPage.click();
	}
	public void setEmail(String strEmail) {
		DemologinPageLocators.Email.sendKeys(strEmail);
	}
	public void setPassword(String strPassword) {
		DemologinPageLocators.Password.sendKeys(strPassword);
	}
	public void RemeberMe() {
		DemologinPageLocators.RememberMe.click();
	}
	public void LoginButton() {
		DemologinPageLocators.loginButton.click();
	}
	public String verifyText() {
		return DemologinPageLocators.SuccessMessage.getText();
	}
	public void setInvalidEmail(String strInvalidEmail) {
		DemologinPageLocators.InvalidEmail.sendKeys(strInvalidEmail);
	}
	public void setInvalidPassword(String strInvalidPassword) {
		DemologinPageLocators.InvalidPassword.sendKeys(strInvalidPassword);
	}
	public String VerifyErrorMessage() {
		return DemologinPageLocators.ErrorMessage.getText();
	}
 
	
	public void login(String Email, String password){
		
		
		this.setEmail(Email);
		this.setPassword(password);
	}
		public void Invalidlogin(String InvalidEmail,String InvalidPassword) {
		this.setInvalidEmail(InvalidEmail);
		this.setInvalidPassword(InvalidPassword);
	}
 
}