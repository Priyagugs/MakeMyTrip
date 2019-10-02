package com.mmt.qa.TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mmt.qa.Pages.HomePage;
import com.mmt.qa.Pages.LoginFB;
import com.mmt.qa.Pages.LoginPage;
import com.mmt.qa.Pages.Post_liked_User_Profile;
import com.mmt.qa.Pages.SearchResults;
import com.mmt.qa.Pages.Searched_Profile_Home_Page;
import com.mmt.qa.base.TestBase;

import junit.framework.Assert;

public class LoginPageTest extends TestBase {
	
	  LoginFB lp;
	  HomePage homepage;
	  
	public LoginPageTest()
	{
		super();
	}
	
	@BeforeMethod
	
	public void Setup()
	{
		initalization();
		lp =new LoginFB();
		
	}
	

	
	@Test(priority=1)
	
	public void HomepageLogin() throws InterruptedException
	
	{
	homepage =lp.Login(prop.getProperty("username"), prop.getProperty("password"));
	homepage.searchText();
	
	
	SearchResults sr = homepage.clickSearch();
	
	
	Searched_Profile_Home_Page Sch_profile=sr.Click_Searched_Text();
	Sch_profile.Click_Post_Likes();
//	pl.Click_Post_Liked_Profiles();

	
	}
	
	
/*@AfterMethod
	
	public void teardown()
	{
		driver.quit();
	}*/
}
	

