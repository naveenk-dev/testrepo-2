package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextMethodExample 
{
	public static void main(String args[]) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/login");
		
		driver.findElement(By.id("userName")).sendKeys("123");
		Thread.sleep(1000);
		
		driver.findElement(By.id("password")).sendKeys("1234@");
		Thread.sleep(5000);
		
		driver.findElement(By.id("login")).click();
		Thread.sleep(5000);
		
		String errorMessage = driver.findElement(By.xpath("//p[@id='name']")).getText();
		Thread.sleep(5000);
		
		System.out.println("Fetched Message: "+errorMessage);
		driver.quit();
		
		System.out.println("Browser Closed Successfully");
	}
}
