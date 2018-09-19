package com.qa.MercuryTours; 

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.*;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

public class TestRegisterationLogIn {

	WebDriver driver = null; 
	public static ExtentReports report; 
	public ExtentTest test; 
	
	
	
	@BeforeClass 
	public static void initial()
	{
		report = new ExtentReports(Constants.reportFile, false);
	}
	
	@Before 
	private void setUp()
	{
		System.setProperty("webdriver.chrome.drive", Constants.chromeDrive);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void registerLog()
	{
		Home home = PageFactory.initElements(driver, Home.class);
		home.clickRegister(); 
		//Boolean nextPage = (new WebDriverWait(driver, 10)).until(ExpectedConditions.urlMatches(Constants.registerPage));
		RegisterPage reg = PageFactory.initElements(driver, RegisterPage.class);
		reg.fillForm("Henri", "kiwi", "licker", "otto");
		
		test = report.startTest("TITLE OF THE TEST APPLICATION"); 
		
	}
	
	@After
	public void tearDown()
	{
		report.endTest(test);
		driver.quit();
	}
	
	@AfterClass
	public void end()
	{
		report.flush();
	}
}
