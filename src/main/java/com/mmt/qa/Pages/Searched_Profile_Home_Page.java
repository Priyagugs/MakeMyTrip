package com.mmt.qa.Pages;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Predicate;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mmt.qa.base.TestBase;

public class Searched_Profile_Home_Page extends TestBase {

	@FindBy(xpath = "//span[contains(@data-testid, 'UFI2TopReactions/tooltip_LIKE')]")
	List<WebElement> PostLikes;

	@FindBy(xpath = "//div[contains(@class, '_5j0e fsl fwb fcb')]")
	List<WebElement> Post_liked_Profiles;

	@FindBy(xpath = "//a[@class='_42ft _4jy0 _4jy4 _517h _51sy']")
	WebElement btnMessage;

	@FindBy(xpath = "//a[contains(@id, 'u_0_f') and text() = 'New Message']")
	WebElement btnNewMessage;

	WebElement sendmessage;
	
	@FindBy(xpath = "//a[@data-testid='dialog_title_close_button'] | //div[contains(@class, 'close')]")
	WebElement closeMessage;
	
	
	

	public Searched_Profile_Home_Page() {

		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 90), this);
	}

	WebDriverWait wait = new WebDriverWait(driver, 90);

	public void Click_Post_Likes() throws InterruptedException {

		for (int i = 0; i < PostLikes.size(); i++) {

			Thread.sleep(2000);
			wait.until(ExpectedConditions.visibilityOf(PostLikes.get(i)));
			wait.until(ExpectedConditions.elementToBeClickable(PostLikes.get(i))).click();
			int post_liked_profiles_count = Post_liked_Profiles.size();

			for (int j = 0; j < post_liked_profiles_count; j++) {
				Thread.sleep(2000);
				wait.until(ExpectedConditions.visibilityOfAllElements(Post_liked_Profiles));
				if(!Post_liked_Profiles.get(j).getText().equals("Priya Ruchir Arora"))
{
				wait.until(ExpectedConditions.elementToBeClickable(Post_liked_Profiles.get(j))).click();
				SendMessage();
				driver.navigate().back();

				if (j < (post_liked_profiles_count - 1))

				{
					Thread.sleep(2000);

					wait.until(ExpectedConditions.visibilityOfAllElements(PostLikes));

					// wait.until(ExpectedConditions.visibilityOf(PostLikes.get(i)));
					wait.until(ExpectedConditions.elementToBeClickable(PostLikes.get(i))).click();

				}

			}

		}
	}
	}

	public void SendMessage() throws InterruptedException {

		driver.manage().window().maximize();
	//	wait.until(ExpectedConditions.visibilityOf(btnMessage));
//		wait.until(ExpectedConditions.elementToBeClickable(btnMessage));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(500,0)");
		
		sendmessage=(new WebDriverWait(driver, 120)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@class='_42ft _4jy0 _4jy4 _517h _51sy']")));
		/*message = (new WebDriverWait(driver, 90))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@class='_42ft _4jy0 _4jy4 _517h _51sy']")));*/
		//message.click();
	//js.executeScript("arguments[0].scrollIntoView()", sendmessage);
	//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='_42ft _4jy0 _4jy4 _517h _51sy']")));
	//driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _4jy4 _517h _51sy']")).click();
	//	driver.navigate().refresh();
		driver.manage().window().maximize();
		Thread.sleep(3000);
sendmessage.click();
		

	/*	JavascriptExecutor jse1 = (JavascriptExecutor) driver;
		jse1.executeScript("window.scrollTo(250,0)");
		//jse1.executeScript("arguments[0].scrollIntoView()", btnMessage);
		 btnMessage.click();*/
		
		wait.until(ExpectedConditions.visibilityOf(closeMessage));
		JavascriptExecutor jse2 = (JavascriptExecutor) driver;
		jse2.executeScript("window.scrollTo(250,0)");
		closeMessage.click();

		// return new SearchResults();
	}
}
