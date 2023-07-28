package Synchronization;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWeight1 {

	public static void main(String[] args) {
System.setProperty("webDriver.chrome.driver", "D:\\\\velocity automation\\\\chromedriver_win32.exe");
        
        WebDriver driver= new ChromeDriver();
        
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        
        
       driver.manage().window().maximize();
       
       String url="https://www.facebook.com/";
       
       driver.get(url);
       
       Wait<WebDriver> W=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(20)).pollingEvery(Duration.ofSeconds(4))
    	.ignoring(NoSuchElementException.class);
       
       WebElement e=W.until(new Function<WebDriver, WebElement>() {
    	   public WebElement apply(WebDriver driver) {
    		   return driver.findElement(By.id("email1"));
    		   
    	   
	}
      
        
	});
       e.sendKeys("Ninad");
       
       
	}
	

}
