package com.EdgeBrowserTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.setProperty("webdriver.Firefox.driver","C:\\Edge Browser Jars\\msedgedriver.exe");
		WebDriver driver1 = new FirefoxDriver();
		driver1.get("https://www.bing.com/");
		// driver.manage().window().maximize();
		WebDriver driver2 = new FirefoxDriver();
		driver2.get("https://opensource-demo.orangehrmlive.com/");
		
		WebDriver driver3 = new FirefoxDriver();
		driver3.get("https://demo.opencart.com/");
		
		WebDriver driver4 = new FirefoxDriver();
		driver4.get("https://www.freecrm.com/");
		
		WebDriver driver5 = new FirefoxDriver();
		driver5.get("https://www.half.ebay.com/");
	}

}
