package com.Arun.TechAssessment3;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Register_Page_Loctor {


//	@FindBy(xpath = "/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")
//	WebElement Register;
//	
//	@FindBy(xpath = "//*[@id='gender-male']")
//	WebElement Gender;
//	
	@FindBy(xpath = "//*[@id='FirstName']")
	WebElement FirstName;
	
	@FindBy(xpath = "//*[@id='LastName']")
	WebElement LastName;
	
	@FindBy(xpath = "//*[@id='Email']")
	WebElement Email;
	
	@FindBy(xpath = "//*[@id='Password']")
	WebElement Password;
	
	@FindBy(xpath = "//*[@id='ConfirmPassword']")
	WebElement Confirm_Password;
	
//	@FindBy(xpath = "//*[@id='register-button']")
//	WebElement Register_Button;

	@FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]")
	WebElement RegisterCompleted;
	
}
