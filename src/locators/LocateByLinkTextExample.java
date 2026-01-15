package locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByLinkTextExample
{
    public static void main(String[] args) throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.saucedemo.com/");

        driver.findElement(By.id("user-name")).sendKeys("naveenkd6-3.7");
        driver.findElement(By.id("password")).sendKeys("naveen123");
        driver.findElement(By.id("login-button")).click();

        Thread.sleep(3000);

        driver.findElement(By.linkText("Twitter")).click();
        Thread.sleep(3000);

        driver.quit();
        System.out.println("Browser closed successfully...");
    }
}
