package co.oftwaretestingboard.selenium.webdriver.Scenario1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class senario1 {
	
	WebDriver driver;
	
	public void invokeBrowser() {
		
	   try {
		   System.setProperty("Webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			
			driver.get("https://magento.softwaretestingboard.com/");
			searchtext();
			
	} catch (Exception e) {
		e.printStackTrace();
	}
	   		

	}
	

	public  void searchtext(String actualresult , String expectedresult) {
		
		try {
			
			driver.findElement(By.id("search")).sendKeys("Breathe-Easy Tank");
			Thread.sleep(3000);
			driver.findElement(By.className("action search")).click();
			
			actualresult = "Search results for: 'Zoe Tank'";
			expectedresult = driver.getTitle();
			
			if(actualresult.equalsIgnoreCase(expectedresult)) {
				
				System.out.println("Search Results Matched");
			}
			
			else {
				System.out.println("Search Results Incorrect");
			}
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
	}

	
	public static void main (String[] args) {
		
	 senario1 myobj = new senario1();
	 myobj.invokeBrowser();
		
		
		
	}

}