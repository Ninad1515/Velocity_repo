package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Horizontal_left_right {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webDriver.chrome.driver", "D:\\\\velocity automation\\\\chromedriver_win32.exe");
        
        WebDriver driver= new ChromeDriver();
        
        
        driver.get("https://blog.hubspot.com/website/horizontal-scrolling");
        
        driver.manage().window().maximize();
        
      // driver.findElement(By.id("hs-eu-confirmation-button")).click();
        
        JavascriptExecutor JS=(JavascriptExecutor) driver;
        
        JS.executeScript("window.scrollBy(10000,0)","");
        
        Thread.sleep(4000);
        
        JS.executeScript("window.scrollBy(2000,0)","");
        
        Thread.sleep(3000);
        
        driver.close();
                
	}

}
