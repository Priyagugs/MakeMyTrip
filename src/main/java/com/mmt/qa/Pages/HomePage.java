package com.mmt.qa.Pages;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mmt.qa.base.TestBase;


public class HomePage  extends TestBase {

	@FindBy(xpath = "//*[@class='_1frb']")
	WebElement txtSearch;
	
	
	WebElement txtSearch1;
	WebElement button_ecellniit,likes,closemessage;
	WebElement message;
	
	
	 
	 public  HomePage()
		{
			PageFactory.initElements(driver, this);
		}
	
	 WebDriverWait wait = new WebDriverWait(driver,90);
	public void searchText()
	{ 
		 
		
		wait.until(ExpectedConditions.visibilityOf(txtSearch));
		txtSearch.sendKeys("E-Cell, NIT Trichy");
		
	}	
	public SearchResults clickSearch()
	{
		wait.until(ExpectedConditions.visibilityOf(txtSearch));
		txtSearch.sendKeys(Keys.RETURN);
		return new SearchResults();
	}
	
	public void restfxn()
	{
		
	
	
	
	int likescount=driver.findElements(By.xpath("//i[contains(@class, 'q9uorilb l9j0dhe7 hm271qws ov9facns khgy6jzf sp_nUm-Frhgfk0 sx_586093')]")).size();
	System.out.println("Amount of like elements: " + likescount);
	

// loop and click through all elements found
for(int j=0;j<likescount;j++)
{
	 List<WebElement> List_likes =driver.findElements(By.xpath("//i[contains(@class, 'q9uorilb l9j0dhe7 hm271qws ov9facns khgy6jzf sp_nUm-Frhgfk0 sx_586093')]"));
     WebElement click_like = List_likes.get(j);
     WebDriverWait wait = new WebDriverWait(driver,90);
    		 wait.until(ExpectedConditions.visibilityOf(click_like));
     click_like.click();
    /* try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
     click_like.click();*/
     int elementsCount= driver.findElements(By.xpath("//div[contains(@class, '_5j0e fsl fwb fcb')]")).size();
     System.out.println("Amount of elements: " + elementsCount);
    for (int x = 0; x < elementsCount; x++) {
        List<WebElement> elements =driver.findElements(By.xpath("//div[contains(@class, '_5j0e fsl fwb fcb')]"));
        WebElement client = elements.get(x);
        wait.until(ExpectedConditions.elementToBeClickable(client));
        client.click();
        try {
 			Thread.sleep(3000);
 		} catch (InterruptedException e) {
 			// TODO Auto-generated catch block
 			e.printStackTrace();
 		}
       /* try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
     
       
   /*  JavascriptExecutor js =(JavascriptExecutor)driver;
     js.executeScript("window.scrollTo(250,0)");
     message=(new WebDriverWait(driver, 90))
			 .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(@class, '_42ft _4jy0 _4jy4 _517h _51sy')]")));
     message.click();
        
	
     JavascriptExecutor js1 =(JavascriptExecutor)driver;
     js1.executeScript("window.scrollTo(250,0)");
     closemessage=(new WebDriverWait(driver, 90))
			 .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(@aria-label, 'Close tab')]")));
     closemessage.click();*/
    
		 /* closemessage=(new WebDriverWait(driver, 90))
				  .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(@aria-label, 'Close tab')]")));
		  
		//actions.moveToElement(closemessage).click().perform();
		  closemessage.click();*/
		
		driver.navigate().back();
		
		/*likes=(new WebDriverWait(driver, 90))
				  .until(ExpectedConditions.presenceOfElementLocated
		(By.xpath("//a[contains(@ajaxify, '/ufi/reaction/profile/dialog/?ft_ent_identifier=ZmVlZGJhY2s6MjcxODYyOTgzNDgxNjgzNg%3D%3D&reaction_type=1&av=100000735369851')]")));
		likes.click();*/
		 try {
	 			Thread.sleep(3000);
	 		} catch (InterruptedException e) {
	 			// TODO Auto-generated catch block
	 			e.printStackTrace();
	 		}
		 if(x<elementsCount-1){
		 List<WebElement> List_likes1 =driver.findElements(By.xpath("//i[contains(@class, 'q9uorilb l9j0dhe7 hm271qws ov9facns khgy6jzf sp_nUm-Frhgfk0 sx_586093')]"));
	     WebElement click_like1 = List_likes1.get(j);
	    // WebDriverWait wait = new WebDriverWait(driver,60);
	    		 wait.until(ExpectedConditions.elementToBeClickable(click_like1));
	    		 try {
	 	 			Thread.sleep(5000);
	 	 		} catch (InterruptedException e) {
	 	 			// TODO Auto-generated catch block
	 	 			e.printStackTrace();
	 	 		}	
	    		
	     click_like1.click();
		  }
		  

    }
    
 }
	/* public void sendMessage()
	    {
		 WebElement message= driver.findElements(By.xpath("//a[contains(@class, '_42ft _4jy0 _4jy4 _517h _51sy')]"));
	        message.click();
	    }
		 
		
	    }*/
	}
		
}
	
	

