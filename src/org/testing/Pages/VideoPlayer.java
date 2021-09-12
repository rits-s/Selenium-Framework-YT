package org.testing.Pages;

import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VideoPlayer {
	WebDriver driver;
	Properties pr;

	public VideoPlayer(WebDriver driver1, Properties pr1) {
		this.driver = driver1;
		this.pr = pr1;
	}

	public void playVideo() throws InterruptedException {
		Thread.sleep(5000);
		List<WebElement> window = driver.findElements(By.id(pr.getProperty("VIDEO_PLAY"))); // video play
		System.out.println(window.size());
		window.get(2).click();
		
	}
}
