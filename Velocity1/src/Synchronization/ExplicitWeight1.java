package Synchronization;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWeight1 {

	public static void main(String[] args) {
System.setProperty("webDriver.chrome.driver", "D:\\\\velocity automation\\\\chromedriver_win32.exe");
        
        WebDriver driver= new ChromeDriver();
        
        driver.manage().window().maximize();
        
        driver.get("https://www.redbus.in/");
        
        WebDriverWait W=new WebDriverWait(driver, Duration.ofSeconds(20));
        
       WebElement From= W.until(ExpectedConditions.visibilityOfElementLocated(By.id("src")));
       
       From.sendKeys("Kolhapur");
       
       WebDriverWait W1=new WebDriverWait(driver, Duration.ofSeconds(10));
       
       WebElement Dest=W1.until(ExpectedConditions.visibilityOfElementLocated(By.id("dest")));
       
       Dest.sendKeys("pune");
       
       
       
       
	}

}
