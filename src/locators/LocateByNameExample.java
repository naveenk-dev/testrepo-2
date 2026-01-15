package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByNameExample 
{
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.name("email")).sendKeys("1234");
		Thread.sleep(1000); //for learning purpose
		
		driver.findElement(By.name("pass")).sendKeys("!@#$%^");
		Thread.sleep(1000);
		
		driver.quit();
		System.out.println("Browser Closed Successfully");
		
		
	}
}
