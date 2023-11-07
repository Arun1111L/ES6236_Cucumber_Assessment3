package com.Arun.TechAssessment3;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_Locator {
	@FindBy(xpath="/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")
	WebElement LoginPage;
	
	@FindBy(xpath="//*[@id='Email']")
	WebElement Email;
	
	@FindBy(xpath="//*[@id='Email']")
	WebElement InvalidEmail;
	
	@FindBy(xpath="//*[@id='Password']")
	WebElement Password;
	
	@FindBy(xpath="//*[@id='Password']")
	WebElement InvalidPassword;
	
	@FindBy(xpath="//*[@id='RememberMe']")
	WebElement RememberMe;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")
	WebElement loginButton;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")
	WebElement SuccessMessage;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[1]/div")
	WebElement ErrorMessage;

	}