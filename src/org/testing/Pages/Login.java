package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testing.Assertions.AssertionHandle;
import org.testng.Assert;

public class Login {
	WebDriver driver;
	Properties pr;

	public Login(WebDriver driver1, Properties pr1) {
		this.driver = driver1;
		this.pr = pr1;
	}

	public void signin(String username, String password) throws InterruptedException {
		Thread.sleep(8000);
		String expectedUrl = "https://www.youtube.com/";		
		String actualUrl = driver.getCurrentUrl();
		//Assert.assertEquals(expectedUrl, actualUrl);
		AssertionHandle.handleAssertion(expectedUrl, actualUrl);
		
		driver.findElement(By.xpath(pr.getProperty("SIGNIN"))).click();
		WebElement user = driver.findElement(By.xpath(pr.getProperty("USERNAME"))); // username
		user.sendKeys(username);
		Thread.sleep(5000);
		driver.findElement(By.xpath(pr.getProperty("USERNEXTBTN"))).click();

		Thread.sleep(5000);
		WebElement pass = driver.findElement(By.xpath(pr.getProperty("PASSWORD"))); // password
		pass.sendKeys(password);
		driver.findElement(By.xpath(pr.getProperty("PASSWORDNEXTBTN"))).click();
	}	
}
