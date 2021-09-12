package org.testing.TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testing.Base.Base;
import org.testing.Pages.Login;
import org.testing.Utilities.LogsCapture;
import org.testng.annotations.Test;

public class TC7 extends Base{
	@Test
		public void testcase7() throws InterruptedException {
		Thread.sleep(5000);
		Login login = new Login(driver, pr);
		login.signin("teggy.gy@gmail.com", "Youtube123");
		
		LogsCapture.takeLogs("TC7", "Login Successful For TC7");
		
		
		Thread.sleep(5000);
		driver.findElement(By.xpath(pr.getProperty("HAMBURGER"))).click(); //hamburger menu
		Thread.sleep(5000);
		driver.findElement(By.xpath(pr.getProperty("WATCH_LATER"))).click(); //watch later
		
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


