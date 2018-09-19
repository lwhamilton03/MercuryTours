package com.qa.MercuryTours;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage {

	@FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/input")
	private WebElement firstName; 
	
	@FindBy(xpath = "//*[@id=\"email\"]")
	private WebElement userName; 
	
	@FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[15]/td[2]/input")
	private WebElement password; 
	
	@FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[16]/td[2]/input")
	private WebElement confirmPassword; 
	
	public void fillForm(String firstNom, String user, String pass, String confirm)
	{
		firstName.click();
		firstName.sendKeys(firstNom); 
		userName.click();
		userName.sendKeys(user);
		password.click();
		password.sendKeys(pass);
		confirmPassword.click();
		confirmPassword.sendKeys(confirm);
		
	}
}
