package NavigationCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigateforward {
    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.google.com");



            driver.navigate().to("https://opensource-demo.orangehrmlive.com/");

            System.out.println("Current URL: " + driver.getCurrentUrl());
            System.out.println("Title: " + driver.getTitle());
            System.out.println("Page Source Length: " + driver.getPageSource().length());

        
    }
}
