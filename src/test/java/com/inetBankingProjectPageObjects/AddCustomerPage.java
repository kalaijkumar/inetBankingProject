package com.inetBankingProjectPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {
	
	
	
    WebDriver driver;
	

	
	public AddCustomerPage(WebDriver rdriver)
	{
	
		driver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	
	
	@FindBy(how = How.XPATH, using ="//a[contains(text(),'New Customer')]")
	WebElement Newcustomer;

	@FindBy(how = How.NAME ,using ="name")
	WebElement CustomerName;
	
	@FindBy(how = How.NAME , using ="rad1")
	WebElement Gender;
	
	@FindBy(how = How.ID, using ="dob")
	WebElement DOB;
	
	@FindBy(how = How.NAME , using ="addr")
	WebElement Address;
	
	@FindBy(how =How.NAME , using ="city")
	WebElement city;
	
	@FindBy(how = How.NAME , using ="state")
	WebElement state;
	
	@FindBy(how =How.NAME , using ="pinno")
	WebElement pinNUM;
	
	
	@FindBy(how = How.NAME, using ="telephoneno")
	WebElement Telephone;
	
	@FindBy(how = How.NAME, using ="emailid")
	WebElement Email;
	
	@FindBy(how = How.NAME , using ="sub")
	WebElement Submit;
	
	
	public void clickNewcustomer(String button)
	{
		Newcustomer.click();
		
	}
	
	
	public void CustomerName(String Cname)
	{
		CustomerName.sendKeys(Cname);
	}
	
	public void clickGender(String gender) 
	{
		Gender.click();
	}
	public void DOB(String mm, String dd , String yy)
	{
		DOB.sendKeys(mm);
		DOB.sendKeys(dd);
		DOB.sendKeys(yy);
	}
	
	public void Address(String address)
	{
		Address.sendKeys(address);
	}
	public void city(String cities)
	{
		city.sendKeys(cities);
		
	}
	
	public void state(String states)
	{
		state.sendKeys(states);
	}
	
	public void pinNUM(String pin)
	{
		pinNUM.sendKeys(pin);
	}
	
	public void Telephone(String telephone)
	{
		Telephone.sendKeys(telephone);
	}
	
	public void Email(String email)
	{
		Email.sendKeys(email);
		
	}
	
	public void clickSubmit(String submit)
	{
		Submit.click();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
