package org.testing.Utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.firefox.FirefoxDriver;
//didn't write WebDriver because getScreenshotAs is defined only inside ChromeDriver or FirefoxDriver


//To take screenshot and capture by calling it inside test cases
public class ScreenshotCapture {
	public static void takeScreenshot(FirefoxDriver driver, String path) throws IOException{
		File f1 = driver.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f1, new File (path));
	}
}
