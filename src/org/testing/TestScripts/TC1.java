package org.testing.TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testing.Assertions.AssertionHandle;
import org.testing.Base.Base;
import org.testing.Pages.Login;
import org.testing.Utilities.LogsCapture;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC1 extends Base {
	@Test
	public void testcase1() throws InterruptedException {
		/*String expectedUrl = "https://www.youtube.com";
		
		System.out.println("I am in TC1");
		System.out.println(driver);
		System.out.println(pr);
		
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(expectedUrl, actualUrl);
		AssertionHandle.handleAssertion(expectedUrl, actualUrl);*/
		
		
		Thread.sleep(5000);
		Login login = new Login(driver, pr);	//signin
		login.signin("teggy.gy@gmail.com", "Youtube123");
		
		LogsCapture.takeLogs("TC1", "Login Successful For TC1");
		

		Thread.sleep(5000);
		driver.findElement(By.xpath(pr.getProperty("EXPLORE"))).click(); //Explore

		Thread.sleep(5000);
		driver.findElement(By.xpath(pr.getProperty("TRENDING"))).click(); // Trending yes
		
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
		
		LogsCapture.takeLogs("TC1", "TC1 Passed Successfully");
	}
}
