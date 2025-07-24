package com.EdgeBrowserTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class BrowserLauncher {
    public static void main(String[] args) {
        // Set ChromeDriver path if not already set via environment variables
        // System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        // 1. OrangeHRM
        driver.get("https://opensource-demo.orangehrmlive.com/");
        System.out.println("Current URL: " + driver.getCurrentUrl());
        System.out.println("Title: " + driver.getTitle());
        System.out.println("Page Source Length: " + driver.getPageSource().length());
        System.out.println("--------------------------------------------------");
        // 2. OpenCart
        driver.get("https://demo.opencart.com/");
        System.out.println("Current URL: " + driver.getCurrentUrl());
        System.out.println("Title: " + driver.getTitle());
        System.out.println("Page Source Length: " + driver.getPageSource().length());
        System.out.println("--------------------------------------------------");
        // 3. Bing
        driver.get("http://www.bing.com");
        System.out.println("Current URL: " + driver.getCurrentUrl());
        System.out.println("Title: " + driver.getTitle());
        System.out.println("Page Source Length: " + driver.getPageSource().length());
        System.out.println("--------------------------------------------------");
        // 4. FreeCRM
        driver.get("https://www.freecrm.com/");
        System.out.println("Current URL: " + driver.getCurrentUrl());
        System.out.println("Title: " + driver.getTitle());
        System.out.println("Page Source Length: " + driver.getPageSource().length());
        System.out.println("--------------------------------------------------");
        // 5. eBay (Half)
        driver.get("http://www.half.ebay.com");
        System.out.println("Current URL: " + driver.getCurrentUrl());
        System.out.println("Title: " + driver.getTitle());
        System.out.println("Page Source Length: " + driver.getPageSource().length());
        System.out.println("--------------------------------------------------");
        driver.quit();
    }
}