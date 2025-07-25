package NavigationCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		System.out.println(driver.getTitle()); // title
		System.out.println(driver.getPageSource()); // pagesource
		
		String URL = driver.getCurrentUrl();
		URL = driver.getCurrentUrl();
		System.out.println(URL);
		driver.quit();
		
		WebDriver driver2 = new ChromeDriver();
		driver2.manage().window().maximize();
		driver2.navigate().to("https://demo.opencart.com/");
		
		String URL2 = driver2.getCurrentUrl();
		URL2 = driver2.getCurrentUrl();
		System.out.println(URL2);
		driver2.quit();
		
		
		WebDriver driver3 = new ChromeDriver();
		driver3.manage().window().maximize();
		driver3.navigate().to("https://www.bing.com/");
		
		String URL3 = driver3.getCurrentUrl();
		URL3 = driver3.getCurrentUrl();
		System.out.println(URL3);
		driver3.quit();
		
		WebDriver driver4 = new ChromeDriver();
		driver4.manage().window().maximize();
		driver4.navigate().to("https://www.freecrm.com/");
		
		String URL4 = driver4.getCurrentUrl();
		URL4 = driver4.getCurrentUrl();
		System.out.println(URL4);
		driver4.quit();
		
		WebDriver driver5 = new ChromeDriver();
		driver5.manage().window().maximize();
		driver5.navigate().to("https://half.ebay.com/");
		
		String URL5 = driver5.getCurrentUrl();
		URL5 = driver5.getCurrentUrl();
		System.out.println(URL5);
		driver5.quit();
	}

}
