package com.Arun.TechAssessment3;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\alakshmanan\\eclipse-Cucumber_Assesment\\Arun\\src\\test\\resources\\feature\\Register.feature",glue="com.Arun.TechAssessment3",plugin={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
//@CucumberOptions(features="C:\Users\alakshmanan\eclipse-Cucumber_Assesment\Arun\src\test\resources\feature\Login.feature",glue="com.Arun.TechAssessment3",plugin={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})

public class Report_class {

}
