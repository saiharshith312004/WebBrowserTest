package NavigationCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigateback {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		String URL = driver.getCurrentUrl();

		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		URL = driver.getCurrentUrl();
		System.out.println(URL); // get URL
		System.out.println(driver.getTitle()); // title
		System.out.println(driver.getPageSource()); // pagesource
		
		
		driver.navigate().back();
		URL = driver.getCurrentUrl(); // get URL
		System.out.println(URL);
		driver.quit();
		
		// 2
		
		WebDriver driver2 = new ChromeDriver();
		driver2.get("https://www.google.com/");
		String URL2 = driver2.getCurrentUrl();

		driver2.navigate().to("https://demo.opencart.com/");
		URL2 = driver2.getCurrentUrl();
		System.out.println(URL2);
		
		driver2.navigate().back();
		URL2 = driver2.getCurrentUrl();
		System.out.println(URL2);
		driver2.quit();
		
		
		// 3
		
		WebDriver driver3 = new ChromeDriver();
		driver3.get("https://www.google.com/");
		String URL3 = driver3.getCurrentUrl();

		driver3.navigate().to("http://www.bing.com/");
		URL3 = driver3.getCurrentUrl();
		System.out.println(URL3);
		
		driver3.navigate().back();
		URL3 = driver3.getCurrentUrl();
		System.out.println(URL3);
		driver3.quit();
		
		// 4
		
		WebDriver driver4 = new ChromeDriver();
		driver4.get("https://www.google.com/");
		String URL4 = driver4.getCurrentUrl();

		driver4.navigate().to("https://www.freecrm.com/");
		URL4 = driver4.getCurrentUrl();
		System.out.println(URL4);
		
		driver4.navigate().back();
		URL4 = driver4.getCurrentUrl();
		System.out.println(URL4);
		driver4.quit();
		
		// 5
		
		WebDriver driver5 = new ChromeDriver();
		driver5.get("https://www.google.com/");
		String URL5 = driver5.getCurrentUrl();

		driver5.navigate().to("http://www.half.ebay.com/");
		URL5 = driver5.getCurrentUrl();
		System.out.println(URL5);
		
		driver5.navigate().back();
		URL5 = driver5.getCurrentUrl();
		System.out.println(URL5);
		driver5.quit();
		
	}

}
