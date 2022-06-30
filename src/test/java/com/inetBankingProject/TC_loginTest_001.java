package com.inetBankingProject;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetBankingProjectPageObjects.loginPage;

public class TC_loginTest_001  extends BaseClass {
	
	 
	 
	 
	
	
	@Test
	public void loginTest() throws IOException {
	

		
	
	
	logger.info(" url is opened ");
	
	loginPage lp = new loginPage(driver);
	lp.setUserName(username);
	
	logger.info(" Entered  username ");
	
	lp.setPassword(password);
	logger.info(" Entered  passowrd ");
	
	lp.clickSubmit(null);
	
	if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
	{
		Assert.assertTrue(true);
		logger.info(" loggin testcase passed  ");
		
	}
	else
	{
		captureScreen(driver, "loginTest");
		
		Assert.assertTrue(false);
		logger.info(" loggin testcase failed  ");
		
	}
	
	
	
	}
	

}
