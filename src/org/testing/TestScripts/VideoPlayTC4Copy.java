package org.testing.TestScripts;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testing.Base.Base;
import org.testing.Pages.Login;
import org.testing.Pages.Logout;
import org.testing.Pages.VideoPlayer;
import org.testing.Utilities.ScreenshotCapture;
import org.testng.annotations.Test;
 
public class VideoPlayTC4Copy extends Base {
	@Test
	public void playVideo() throws InterruptedException, IOException {
		Thread.sleep(5000);		
		Login l = new Login(driver, pr);
		l.signin("teggy.gy@gmail.com", "Youtube123");
		
		//To take screenshot and capture it 
		ScreenshotCapture.takeScreenshot(driver, "C://Users//Rits//OneDrive//Desktop//Capture101");
		
		Thread.sleep(5000);	
		VideoPlayer v = new VideoPlayer(driver, pr);
		v.playVideo();

		Thread.sleep(5000);
		driver.findElement(By.xpath(pr.getProperty("LIKES"))).click(); // likes
		
		
		/*Thread.sleep(5000);
		Logout s = new Logout(driver, pr);
		s.signout();*/
	}
}