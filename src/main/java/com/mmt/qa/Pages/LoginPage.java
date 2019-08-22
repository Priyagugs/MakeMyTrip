package com.mmt.qa.Pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mmt.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	
	@FindBy(xpath="//*[@id='SW']/div[2]/div[1]/ul/li[6]/div/p")
	WebElement BtnLogin;
	
	@FindBy(css = "#SW > div.landingContainer > div.headerOuter > div.modal.displayBlock.modalLogin.dynHeight.personal > section > form > div.makeFlex.socialBtnContainer.vrtlCenter > div.makeFlex.googleLoginBtn.flexOne > span.font14.darkGreyText.latoBold > span")
	WebElement BtnLoginWithGoogle;
	
	@FindBy(css="#username")
	WebElement Username;
	
	@FindBy(css="#password1")
	WebElement Password;
	
	@FindBy(xpath="//*[@id='SW']/div[2]/div[2]/div[2]/section/form/div[4]/button/span")
	WebElement Login;
	
	@FindBy(css="#identifierId")
	WebElement BtnUsername;
	
	@FindBy(css="#password > div.aCsJod.oJeWuf > div > div.Xb9hP > input")
	WebElement BtnPassword;
	
	@FindBy(css="#identifierNext > span > span")
	WebElement BtnNext;
	
	@FindBy(css="#passwordNext > span > span")
	WebElement BtnPasswordNext;

	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String validatePageTitle()
	{
		
		
		return driver.getTitle();
		
	}

	public HomePage Login(String uid,String pwd)
	{
		BtnLogin.click();
	//BtnLoginWithGoogle.click();
		Username.sendKeys(uid);
		//BtnNext.click();
		Password.sendKeys(pwd);
		//BtnPasswordNext.click();
		Login.click();
		
		return new HomePage();
		
		
	
	
}
}
