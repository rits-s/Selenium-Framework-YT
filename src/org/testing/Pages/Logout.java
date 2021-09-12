package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Logout {
	WebDriver driver;
	Properties pr;

	public Logout(WebDriver driver2, Properties pr2) {
		this.driver = driver2;
		this.pr = pr2;
	}

	public void signout() throws InterruptedException {
		WebElement w = driver.findElement(By.xpath("//button[@id='avatar-btn']")); // logout
		w.click();
		for (int i = 0; i < 5; i++) {
			w.sendKeys(Keys.ARROW_DOWN);
			if (w.getText().equalsIgnoreCase("sign out")) {
				w.click();
				break;
			}
		}
		driver.findElement(By.xpath("//*[contains(text(), 'Sign out')]")).click();
	}

}
