package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWeight_2 {
	
public static void main(String[] args) {
		System.setProperty("webDriver.chrome.driver", "D:\\\\velocity automation\\\\chromedriver_win32.exe");
		        
		        WebDriver driver= new ChromeDriver();
		        
		        driver.manage().window().maximize();
		        
		        driver.get("https://www.redbus.in/");
		        
		        WebDriverWait W=new WebDriverWait(driver, Duration.ofSeconds(20));
		        
		        WebElement From=W.until(ExpectedConditions.visibilityOfElementLocated(By.id("src")));
		        
		        By input1=By.id("src");
		        
		        WaitforElement(driver, input1, 30).sendKeys("Kolhapur");
		        
		        By input2=By.id("dest");
		        
		        WaitforElement(driver, input2, 10).sendKeys("pune");
		        
		        
		        
		        

}
  public static WebElement WaitforElement(WebDriver driver,By locator,int timeout) {
      WebDriverWait W=new WebDriverWait(driver, Duration.ofSeconds(20));
      
      W.until(ExpectedConditions.visibilityOfElementLocated(locator));
      return driver.findElement(locator);
  }
  

}
