package com.mmt.qa.utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TestUtil {
	public static long Page_load_Timeout=30;
	public static long Implicit_Wait=30;

	public static void takeScreenshotAtEndOfTest(WebDriver driver) throws IOException {
		
		
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//String currentDir=System.getProperty("user.dir");
		// Now you can do whatever you need to do with it, for example copy somewhere
		FileUtils.copyFile(scrFile, new File("C:\\screenshots\\"+System.currentTimeMillis()+".png"));
		
		
	}

}
