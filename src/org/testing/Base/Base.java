package org.testing.Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testing.Assertions.AssertionHandle;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {
	public FirefoxDriver driver;
	public Properties pr;

	@BeforeMethod
	public void init() throws IOException {
		// System.setProperty("webdriver.chrome.driver", "../YTFramework/chromedriver.exe");
		//driver=new ChromeDriver();
		System.setProperty("webdriver.gecko.driver", "../YTFramework/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();		
		driver.get("https://www.youtube.com");

		File f = new File("../YTFramework/Object.properties"); // to make connection with the object.properties file
		FileInputStream fis = new FileInputStream(f);
		pr = new Properties();
		pr.load(fis);
		//System.out.println("Property class loaded" + pr);

		 /*
		  @AfterMethod public void close() { 
		  	driver.close(); 
		  }
		 */
	}
}
