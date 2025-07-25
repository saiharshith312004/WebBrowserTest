package com.EdgeBrowserTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class BrowserLauncher {
    public static void main(String[] args) {
    	
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://opensource-demo.orangehrmlive.com/");
        System.out.println("Current URL: " + driver.getCurrentUrl());
        System.out.println("Title: " + driver.getTitle());
        System.out.println("Page Source Length: " + driver.getPageSource());
        System.out.println("--------------------------------------------------");

        driver.get("https://demo.opencart.com/");
        System.out.println("Current URL: " + driver.getCurrentUrl());
        System.out.println("Title: " + driver.getTitle());
        System.out.println("Page Source Length: " + driver.getPageSource());
        System.out.println("--------------------------------------------------");

        driver.get("http://www.bing.com");
        System.out.println("Current URL: " + driver.getCurrentUrl());
        System.out.println("Title: " + driver.getTitle());
        System.out.println("Page Source Length: " + driver.getPageSource());
        System.out.println("--------------------------------------------------");

        driver.get("https://www.freecrm.com/");
        System.out.println("Current URL: " + driver.getCurrentUrl());
        System.out.println("Title: " + driver.getTitle());
        System.out.println("Page Source Length: " + driver.getPageSource());
        System.out.println("--------------------------------------------------");

        driver.get("http://www.half.ebay.com");
        System.out.println("Current URL: " + driver.getCurrentUrl());
        System.out.println("Title: " + driver.getTitle());
        System.out.println("Page Source Length: " + driver.getPageSource());
        System.out.println("--------------------------------------------------");
        driver.quit();
    }
}