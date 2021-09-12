package org.testing.TestScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testing.Base.Base;
import org.testing.Pages.Login;
import org.testing.Pages.VideoPlayer;
import org.testing.Utilities.LogsCapture;
import org.testng.annotations.Test;

public class TC5 extends Base{
	@Test
	public void testcase5() throws InterruptedException {
		Thread.sleep(5000);
		Login login = new Login(driver, pr);
		login.signin("teggy.gy@gmail.com", "Youtube123");
		
		LogsCapture.takeLogs("TC5", "Login Successful For TC5");

		Thread.sleep(5000);	
		VideoPlayer v = new VideoPlayer(driver, pr);//video play
		v.playVideo();
		
		//subscribe to a video
		Thread.sleep(5000);
		driver.findElement(By.xpath(pr.getProperty("SUBSCRIBE_VIDEO"))).click(); //subscribe 
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


