package com.mmt.qa.TestCases;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

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
	  String TestFile = "C:\\Users\\priya.arora\\Documents\\temp.txt";
	  String Content = "";
	  String uname="";
	  String pwd="";
			String Profile_Search="";
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
	
	public void FileRead() throws IOException
	{
		FileReader FR = new FileReader(TestFile);
		  BufferedReader BR = new BufferedReader(FR);
		 
		  int i=1;
		  while((Content = BR.readLine())!= null){
			  if(i==1)
			  {
				  uname=Content;
			  }
			  
			  if(i==2)
			  {
				  pwd=Content;
			  }
			  
			  if(i==3)
			  {
				  Profile_Search=Content;
			  }
			  
			  i++;
			  
			   
			  }
	}
	

	
	@Test(priority=1)
	
	public void HomepageLogin() throws InterruptedException, IOException
	
	{
		FileRead();
	homepage =lp.Login(uname,pwd);
	homepage.searchText(Profile_Search);
	//homepage.searchText(Profile_Search);
	
	
	SearchResults sr = homepage.clickSearch();
	
	
	Searched_Profile_Home_Page Sch_profile=sr.Click_Searched_Text(Profile_Search);
	Sch_profile.Click_Post_Likes();
//	pl.Click_Post_Liked_Profiles();

	
	}
	
	
/*@AfterMethod
	
	public void teardown()
	{
		driver.quit();
	}*/
}
	

