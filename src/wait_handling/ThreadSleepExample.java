package wait_handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThreadSleepExample
{
    public static void main(String[] args) throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/login");


        driver.findElement(By.id("userName")).sendKeys("testnaveen");
        
        //pause execution for 2 seconds
        Thread.sleep(2000);

        driver.findElement(By.id("password")).sendKeys("naveen@123");
        Thread.sleep(2000);

        driver.findElement(By.id("login")).click();

        //pause execution for 2 seconds to see result
        Thread.sleep(2000);
        
        driver.quit();
        System.out.println("browser closed successfully");
    }
}
