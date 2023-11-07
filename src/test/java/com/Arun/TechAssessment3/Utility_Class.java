package com.Arun.TechAssessment3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Utility_Class {
	String strEmail,strPassword,strInvalidEmail,strInvalidPassword,strUrl;
	public Utility_Class(){
		credentials();
	}
	public void credentials() {
File file = new File("C:\\Users\\alakshmanan\\eclipse-Cucumber_Assesment\\Arun\\src\\test\\resources\\feature\\login.properties");
		
		FileInputStream fileInput = null;
		try {
			fileInput = new FileInputStream(file);
		} catch(FileNotFoundException e) {
			e.printStackTrace();			
		}
		
		Properties property = new Properties();
		
		try {
			property.load(fileInput);
		} catch(IOException e) {
			e.printStackTrace();
		}
		strUrl=property.getProperty("url");
		strEmail = property.getProperty("Email");
		strPassword = property.getProperty("Password");
		strInvalidEmail = property.getProperty("InvalidEmail");
		strInvalidPassword = property.getProperty("InvalidPassword");
		
	}
}