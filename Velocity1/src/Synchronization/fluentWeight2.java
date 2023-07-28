package Synchronization;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class fluentWeight2 {

	public static void main(String[] args) {
System.setProperty("webDriver.chrome.driver", "D:\\\\velocity automation\\\\chromedriver_win32.exe");
        
        WebDriver driver= new ChromeDriver();
        
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        
        
       driver.manage().window().maximize();
       
       String url="https://www.facebook.com/";
       
       driver.get(url);
       
       By input1=By.id("email");
       By input2=By.id("pass");
       
       WaitforFluent(driver, input1).sendKeys("ninad");
       WaitforFluent(driver, input2).sendKeys("2345");
	}
	public static WebElement WaitforFluent(WebDriver driver, final By source) {
		Wait<WebDriver> Wait=new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofSeconds(4))
				.ignoring(NoSuchElementException.class);
		
		WebElement E=Wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return driver.findElement(source);
			
				
				
			}
		});
		return E;
	}
   
}
