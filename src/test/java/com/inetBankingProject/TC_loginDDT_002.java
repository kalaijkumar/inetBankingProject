package com.inetBankingProject;

import java.io.IOException;

import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.inetBankingProjectPageObjects.loginPage;
import com.inetBankingUtilities.XLUtils;

public class TC_loginDDT_002  extends BaseClass {
	
@Test(dataProvider ="LoginData")	
public void loginDDT(String user,String pwd) throws InterruptedException
    {
	loginPage lp = new loginPage(driver);
	
	lp.setUserName(user);
	logger.info(" username  provided ");
    lp.setPassword(pwd);
    logger.info("password  provided");
    lp.clickSubmit(null);
	
    
    
    Thread.sleep(3000);
    
    if(isAlertPresent()==true)
    {
    	driver.switchTo().alert().accept(); //close alert
    	driver.switchTo().defaultContent();
    	Assert.assertTrue(false);
       logger.warn("Login Failed ");	
    	
    }
    else 
    {
    	Assert.assertTrue(true);
    	logger.info("Login passed");
    	
    	lp.clickLogout();
    	Thread.sleep(3000);
    	driver.switchTo().alert().accept(); //close logout alert
    	driver.switchTo().defaultContent();
    	
    	
       }
    
 
    }

     public boolean isAlertPresent() // user defined method created to check alert is present or not 
   {
	
	 {
		try
		{
			
	    driver.switchTo().alert();
		return true;
	
        }
     catch(NoAlertPresentException e)
		{
	return false;
		 }

	    }

    }


	@DataProvider(name ="LoginData")
	String [][] getdata() throws IOException
	{
	String path	= System.getProperty("user.dir")+ "/src/test/java/com/inetBankingProject/testdata/LoginData.xlsx" ;
	
	
	
	
	int rownum =XLUtils.getRowCount(path, "sheet1");
	int colcount = XLUtils.getRowCount(path, "sheet1");
	
	
	String logindata[][]= new String[rownum][colcount];
	
	for (int i=1; i<=rownum; i++)
	{
		
	for (int j= 0; j<colcount; j++ )
	{
		logindata[i-1][j]=XLUtils.getcellcount(path, "sheet1" , i); // 1 0 
		
		
	         }
		
	     }
		
	     return logindata;
	
      }
	
    }
