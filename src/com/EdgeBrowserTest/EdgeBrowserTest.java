package com.EdgeBrowserTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","C:\\Edge Browser Jars\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.bing.com/");
		//driver.manage().window().maximize();
		WebDriver driver2 = new EdgeDriver();
		driver2.get("https://opensource-demo.orangehrmlive.com/");
		WebDriver driver3 = new EdgeDriver();
		driver3.get("https://demo.opencart.com/");
		WebDriver driver4 = new EdgeDriver();
		driver4.get("https://www.freecrm.com/");
		WebDriver driver5 = new EdgeDriver();
		driver5.get("https://www.half.ebay.com/");
		
	}

}
