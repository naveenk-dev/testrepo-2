package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeMethodExample 
{
	public static void main(String args[]) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demoqa.com/login");
		
		WebElement userName = driver.findElement(By.id("userName"));
		userName.sendKeys("Mukesh Ambani");
		
		String usernameValue = userName.getAttribute("value");
		System.out.println("Entered value in the username text box: "+ usernameValue);
		
		driver.quit();
		System.out.println("Browser Closed Successfully");
	}
}
