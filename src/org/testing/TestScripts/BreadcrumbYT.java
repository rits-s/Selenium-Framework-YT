package org.testing.TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BreadcrumbYT {

	public static void main(String[] args) throws InterruptedException {  //perfect
		
		//System.setProperty("webdriver.firefox.driver", "../YTFramework/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "../SeleniumStart/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();

		driver.get("https://www.youtube.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[text()= 'Sign in']")).click();
		WebElement user = driver.findElement(By.xpath("//*[@id='identifierId']"));
		user.sendKeys("teggy.gy@gmail.com");
		driver.findElement(By.xpath("//*[@id='identifierNext']")).click();//username
		
		Thread.sleep(5000);
		WebElement pass = driver.findElement(By.xpath("//*[@name='password']"));
		pass.sendKeys("Youtube123");
		driver.findElement(By.xpath("//*[@id='passwordNext']")).click(); //password 
		
			
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id='start']//*[@id='guide-icon']")).click(); //hamburger menu
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@id='endpoint']//*[contains(text(), 'Watch later')]")).click(); //watch later
	}

}
