package wait_handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitExample2 
{
	public static void main(String[] args) throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        WebDriverWait wait = new WebDriverWait(driver, 10);

        driver.get("https://demoqa.com/login");
        driver.findElement(By.id("userName")).sendKeys("testnaveen");       
        driver.findElement(By.id("password")).sendKeys("naveen@123");
        driver.findElement(By.id("login")).click();
        
        String message = wait.until(ExpectedConditions
        		.visibilityOfElementLocated(By.id("name"))).getText();
        
        System.out.println("Error message: "+message);
        driver.quit();
        System.out.println("browser closed successfully");
    }
}
