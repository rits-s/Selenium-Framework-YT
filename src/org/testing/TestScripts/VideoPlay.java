package org.testing.TestScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VideoPlay {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "../YTFramework/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.youtube.com/");
	driver.manage().window().maximize();

	List <WebElement> window = driver.findElements(By.id("video-title"));
	System.out.println(window.size());
	window.get(3).click();
	
	
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id=\"top-level-buttons\"]/ytd-toggle-button-renderer[1]/a")).click(); //likes
	//subscribe
	driver.findElement(By.xpath("  //*[@id=\"subscribe-button\"]/ytd-subscribe-button-renderer/paper-button/yt-formatted-string")).click();
	
	
	driver.findElement(By.xpath("//*[@id=\"contenteditable-root\"]")).sendKeys("Good video"); //Type comment
	driver.findElement(By.xpath("//*[@id='submit-button']")).click(); //Comments
	
	Thread.sleep(5000);
	driver.findElement(By.xpath(""));  //watch later
	
	
}
}


