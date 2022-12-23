package co.oftwaretestingboard.selenium.webdriver.Scenario1;

import java.security.PublicKey;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ISelect;


public class Scenario2 {
	
	WebDriver driver;
	
	public void invokeBrowser() {
		
	   try {
		   System.setProperty("Webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			
			driver.get("https://magento.softwaretestingboard.com/");
			
			
			navigateToWomen();
			Verifyresult();
			
			
			
	} catch (Exception e) {
		e.printStackTrace();
	}
	   		
		
	}
	
	
	
	public void navigateToWomen(String actualresult) {
		
		WebElement Woemen = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/nav[1]/ul[1]/li[2]/a[1]/span[2]"));
		
		Actions action = new Actions(driver);
		action.moveToElement(Woemen).perform();
		//click on the tops
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/nav[1]/ul[1]/li[2]/ul[1]/li[1]/a[1]/span[2]")).click();
		//click on the CATEGORY 
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/main[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]")).click();
		//click on the Jackets   
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/main[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/ol[1]/li[1]/a[1]")).click();
		//click on the COLOR  
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/main[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/ol[1]/li[1]/a[1]")).click();
		//click on the ColorBlack
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/main[1]/div[3]/div[2]/div[1]/div[2]/div[3]/div[4]/div[2]/div[1]/div[1]/a[1]/div[1]")).click();
		
		
	
		
	}
	
	
	public void Verifyresult(String Actual,String Expected ) {
		
		 
		Actual = driver.findElements(By.xpath("/html[1]/body[1]/div[2]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]"));
		
		Expected = "/html[1]/body[1]/div[2]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]";
	
		if (Actual == Expected) {
			
			System.out.println("Result is correct");
		}
			
		else {
			System.out.println("Result is incorrect");
		}
			
		
	
	}
	

	
	public static void main (String[] args) {
		
	 Scenario2 myobj = new Scenario2();
	 myobj.invokeBrowser();

		
	
		
		
	}

}
