package org.testing.TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testing.Base.Base;

public class TestCase1 extends Base {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.firefox.driver", "../YTFramework/geckodriver.exe");
		//System.setProperty("webdriver.chrome.driver", "../SeleniumStart/chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();
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
		
		/*Thread.sleep(5000);
		driver.findElement(By.xpath("//span[contains(text(),'Explore')]")).click(); //Explore
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@id='destination-content-root']")).click(); //Trending yes
*/		
		/*Thread.sleep(5000);
		driver.findElement(By.xpath("//span[contains(text(), 'History')]")).click(); //History yes
*/		
		/*Thread.sleep(5000);
		driver.findElement(By.xpath("//*[contains(text(),'Subscriptions')]")).click();//Subscriptions yes
*/		
		/*Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id='items']//*[contains(text(),'Library')]")).click(); //library  yes
*/				
		/*Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id='start']//*[@id='guide-icon']")).click(); //hamburger menu
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@id='endpoint']//*[contains(text(), 'Watch later')]")).click(); //watch later
*/		
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
		driver.findElement(By.xpath("//*[contains(text(), 'Sign out')]")).click();//check this line if needed
		
		////button[@id='avatar-btn']
		//div[@id='start']//*[@id="guide-icon"]  for hamburger menu
	}
}
