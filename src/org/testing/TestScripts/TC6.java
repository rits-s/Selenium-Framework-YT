package org.testing.TestScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testing.Base.Base;
import org.testing.Pages.Login;
import org.testing.Pages.VideoPlayer;
import org.testing.Utilities.LogsCapture;
import org.testng.annotations.Test;

public class TC6 extends Base {
	@Test
	public void testcase6() throws InterruptedException {
		Thread.sleep(5000);
		Login login = new Login(driver, pr);
		login.signin("teggy.gy@gmail.com", "Youtube123");
		
		LogsCapture.takeLogs("TC6", "Login Successful For TC6");
		
		Thread.sleep(5000);	
		VideoPlayer v = new VideoPlayer(driver, pr);//video play
		v.playVideo();
						
		Thread.sleep(5000);		
		JavascriptExecutor js = (JavascriptExecutor) driver;		
		js.executeScript("window.scrollBy(0,700)");
		Thread.sleep(7000);		
		
		WebDriverWait wait = new WebDriverWait(driver, 5000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(pr.getProperty("COMMENT_BOX_AREA")))).click();
		
		WebElement comment = driver.findElement(By.id(pr.getProperty("COMMENT_BOX")));
		comment.click();
		Thread.sleep(4000);
		comment.sendKeys("Good doc"); // Type comment
		Thread.sleep(5000);
		driver.findElement(By.xpath(pr.getProperty("COMMENT_SUBMIT"))).click(); // Comments
		Thread.sleep(5000);
		
		Thread.sleep(5000);
		WebElement w = driver.findElement(By.xpath("//button[@id='avatar-btn']"));  //logout
		w.click();
		for(int i=0;i<5;i++) {
			w.sendKeys(Keys.ARROW_DOWN);		
			if (w.getText().equalsIgnoreCase("sign out")) {
				w.click();
				break;				
			}
		}
		driver.findElement(By.xpath("//*[contains(text(), 'Sign out')]")).click();
	}

}
