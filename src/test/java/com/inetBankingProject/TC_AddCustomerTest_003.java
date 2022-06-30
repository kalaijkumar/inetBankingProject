package com.inetBankingProject;

import java.io.IOException;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetBankingProjectPageObjects.AddCustomerPage;
import com.inetBankingProjectPageObjects.loginPage;

public class TC_AddCustomerTest_003  extends BaseClass
{

	@Test
	public void addNewCustomer() throws InterruptedException, IOException
	{
		loginPage lp = new loginPage(driver);
		lp.setUserName(username);
		logger.info("username is provided");
		lp.setPassword(password);
		logger.info("password is provided");
		lp.clickSubmit(null);
		
		
		Thread.sleep(3000);
		
		AddCustomerPage addcust = new AddCustomerPage(driver);
		addcust.clickNewcustomer(null);
		
		
		logger.info("providing customer details ");
		
		
		addcust.CustomerName("kumar");
		addcust.clickGender("male");
		addcust.DOB("10", "15", "1963");
		Thread.sleep(3000);
		addcust.Address("india");
		addcust.city("coimbatore");
		addcust.state("tn");
		addcust.pinNUM("634123");
		addcust.Telephone("888999");
		
		String email = randomestring()+"@gmail.com";
		addcust.Email(email);
		addcust.clickSubmit(null);
		
		Thread.sleep(3000);
		
		logger.info("validation started ");
		
    	boolean res =	driver.getPageSource().contains("Customer Registered Succesfully!!!");
        if (res ==true)
        {
    	Assert.assertTrue(true);
    	logger.info("Testcase is passed");
        }
	
        else
        {
        logger.info("Testcase is failed");	
    	captureScreen(driver, "addNewCustomer");
    	Assert.assertFalse(false);
    	
        }
    
    
    
	   }
}
