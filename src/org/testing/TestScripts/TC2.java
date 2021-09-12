package org.testing.TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testing.Base.Base;
import org.testing.Pages.Login;
import org.testing.Pages.Logout;
import org.testing.Utilities.LogsCapture;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC2 extends Base {
	@Test
	public void testcase2() throws InterruptedException {
		Thread.sleep(5000);
		Login login = new Login(driver, pr);	//signin
		login.signin("teggy.gy@gmail.com", "Youtube123");
		
		LogsCapture.takeLogs("TC2", "Login Successful For TC2");

		Thread.sleep(5000);
		driver.findElement(By.xpath(pr.getProperty("HAMBURGER"))).click(); //Hamburger menu
		driver.findElement(By.xpath(pr.getProperty("HISTORY"))).click(); // History
		
		Thread.sleep(5000);
		Logout l = new Logout(driver, pr);
		l.signout();
		
		LogsCapture.takeLogs("TC2", "TC2 Passed Successfully");
	}
}
