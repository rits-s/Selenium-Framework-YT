package org.testing.TestScripts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testing.Base.Base;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestTC extends Base {
	@Test
	public void testcase2() throws InterruptedException {
		driver.findElement(By.xpath("//*[text()= 'Sign in']")).click();
		WebElement user = driver.findElement(By.xpath("//*[@id='identifierId']"));
		user.sendKeys("teggy.gy@gmail.com");
		driver.findElement(By.xpath("//*[@id='identifierNext']")).click();// username

		Thread.sleep(5000);
		WebElement pass = driver.findElement(By.xpath("//*[@name='password']"));
		pass.sendKeys("Youtube123");
		driver.findElement(By.xpath("//*[@id='passwordNext']")).click(); // password

		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id='start']//*[@id='guide-icon']")).click();
		driver.findElement(By.xpath("//yt-formatted-string[contains(text(), 'History')]")).click(); // History 
	}
}
