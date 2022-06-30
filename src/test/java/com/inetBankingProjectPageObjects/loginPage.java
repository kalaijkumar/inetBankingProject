package com.inetBankingProjectPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.inetBankingProject.BaseClass;

public class loginPage  {
	
	
	 WebDriver driver;
	
	  
	
	public loginPage(WebDriver rdriver)
	{
	
		driver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	@FindBy(name ="uid")
	WebElement txtUserName;
	
	@FindBy(name = "password")
	WebElement txtPassword;
	
	@FindBy(name ="btnLogin")
	WebElement loginButton;
	
	
	
	@FindBy(xpath = "/html/body/div[3]/div/ul/li[10]/a")
	WebElement lnkLogout;
	
	
	
	
	
	public void setUserName(String uname )
	
	{
	txtUserName.sendKeys(uname);	
	}
	
	
    public void setPassword(String Password )
	
	{
	txtPassword.sendKeys(Password);	
	}
	
    public void clickSubmit(String button )
	
	{
	
    loginButton.click();
	}
	
	
	
	
	public void clickLogout()
	{
		lnkLogout.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
