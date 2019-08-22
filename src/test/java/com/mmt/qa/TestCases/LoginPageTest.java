package com.mmt.qa.TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mmt.qa.Pages.HomePage;
import com.mmt.qa.Pages.LoginPage;
import com.mmt.qa.base.TestBase;

import junit.framework.Assert;

public class LoginPageTest extends TestBase {
	
	  LoginPage lp;
	  HomePage homepage;
	  
	public LoginPageTest()
	{
		super();
	}
	
	@BeforeMethod
	
	public void Setup()
	{
		initalization();
		lp =new LoginPage();
		
	}
	
	/*@Test(priority=1)
	public void LoginPageTitleTest() throws InterruptedException
	
	{ 
	String expected="MakeMyTrip - #1 Travel Website 50% OFF on Hotels, Flights &amp; Holiday";
	
		String title_actual =lp.validatePageTitle();
		Assert.assertEquals(expected, title_actual);
	}*/
	
	@Test(priority=1)
	
	public void HomepageLogin()
	
	{
	homepage=lp.Login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	
@AfterMethod
	
	public void teardown()
	{
		driver.quit();
	}
}
	

