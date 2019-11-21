package com.mmt.qa.Pages;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mmt.qa.base.TestBase;
public class LoginFB extends TestBase{
	@FindBy(id="loginbutton")
	WebElement BtnLogin;
	
	@FindBy(css = "#SW > div.landingContainer > div.headerOuter > div.modal.displayBlock.modalLogin.dynHeight.personal > section > form > div.makeFlex.socialBtnContainer.vrtlCenter > div.makeFlex.googleLoginBtn.flexOne > span.font14.darkGreyText.latoBold > span")
	WebElement BtnLoginWithGoogle;
	
	@FindBy(id="email")
	WebElement Username;
	
	@FindBy(id="pass")
	WebElement Password;
	String TestFile = "C:\\Users\\priya.arora\\Documents\\temp.txt";
	
	
	public LoginFB()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String validatePageTitle()
	{
		
		
		return driver.getTitle();
		
	}
	WebDriverWait wait = new WebDriverWait(driver,90);

	public HomePage Login(String uid,String pwd) throws IOException
	{
		
		/* FileReader FR = new FileReader(TestFile);
		  BufferedReader BR = new BufferedReader(FR);
		  String Content = "";
		  String uname="";
		  int i=1;
		  while((Content = BR.readLine())!= null){
			  if(i==1)
			  {
				  uname=Content;
			  }
			  i++;
			   System.out.println(uname);
			   
			  }*/
	//	BtnLogin.click();
	//BtnLoginWithGoogle.click();
		Username.sendKeys(uid);
		//BtnNext.click();
		Password.sendKeys(pwd);
		//BtnPasswordNext.click();
		BtnLogin.click();
		 
		return new HomePage();
		
		
	
	
}

}
