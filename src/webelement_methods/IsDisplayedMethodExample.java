package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedMethodExample 
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
		Thread.sleep(2000);
		
		boolean isDisplayed = driver.findElement(By.xpath("//p[@id='name']")).isDisplayed();
		
		if(isDisplayed)
		{
			System.out.println("displayed error message: "+errorMessage);
		}
		else
			System.out.println("error message is not displayed.");
		

		driver.quit();
		System.out.println("browser closed successfully..");
	}
}
