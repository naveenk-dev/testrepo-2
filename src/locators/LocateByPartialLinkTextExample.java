package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByPartialLinkTextExample 
{
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("https://www.facebook.com");
		driver.findElement(By.partialLinkText("Create")).click();
		driver.navigate().back();
		driver.quit();
		System.out.println("Browser closed successfully...");
		
	}
}
