package com.mmt.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.mmt.qa.utils.TestUtil;
import com.mmt.qa.utils.WebEventListener;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	public static EventFiringWebDriver e_driver;
	public static WebEventListener eventListener;
	
	public TestBase()
	{
		try{
			prop=new Properties();
			FileInputStream ip=new FileInputStream("C:\\Automation\\Automation_Practice\\MakeMyTrip\\src\\main\\java\\com\\mmt\\qa\\config\\Config.Properties");
			prop.load(ip);
			}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void initalization()
	{
		String browserName=prop.getProperty("browser");
		
		
		
		
		
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Automation_Practice\\chromedriver.exe");
			driver= new ChromeDriver();
			
			
			
			e_driver=new EventFiringWebDriver(driver);
			eventListener = new WebEventListener();
			e_driver.register(eventListener);
			driver=e_driver;
			
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
		//	driver.manage().timeouts().pageLoadTimeout(TestUtil.Page_load_Timeout, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Wait,TimeUnit.SECONDS );
			driver.get(prop.getProperty("url"));
					
		}
		
		
	}
	}


