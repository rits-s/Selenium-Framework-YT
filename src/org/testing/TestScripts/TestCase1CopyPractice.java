package org.testing.TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testing.Base.Base;
import org.testing.Pages.Login;
import org.testing.Pages.Logout;
import org.testng.annotations.Test;

public class TestCase1CopyPractice extends Base {
	@Test
	public void testcase1() throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("I am in TC1");
		System.out.println(driver);
		System.out.println(pr);
		
		Login l = new Login(driver, pr);
		l.signin("teggy.gy@gmail.com", "Youtube123");

		Thread.sleep(5000);
		driver.findElement(By.xpath(pr.getProperty("EXPLORE"))).click(); //Explore

		Thread.sleep(5000);
		driver.findElement(By.xpath(pr.getProperty("TRENDING"))).click(); // Trending yes
		
		Logout s = new Logout(driver, pr);
		s.signout();
	}
}
