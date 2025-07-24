package com.EdgeBrowserTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.setProperty("webdriver.Firefox.driver","C:\\Edge Browser Jars\\msedgedriver.exe");
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://www.bing.com/");
		// driver.manage().window().maximize();
		WebDriver driver2 = new ChromeDriver();
		driver2.get("https://opensource-demo.orangehrmlive.com/");
		
		WebDriver driver3 = new ChromeDriver();
		driver3.get("https://demo.opencart.com/");
		
		WebDriver driver4 = new ChromeDriver();
		driver4.get("https://www.freecrm.com/");
		
		WebDriver driver5 = new ChromeDriver();
		driver5.get("https://www.half.ebay.com/");
	}
}
