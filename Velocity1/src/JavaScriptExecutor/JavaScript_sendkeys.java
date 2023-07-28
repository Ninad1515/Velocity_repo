package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript_sendkeys {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webDriver.chrome.driver", "D:\\\\velocity automation\\\\chromedriver_win32.exe");
        
        WebDriver driver= new ChromeDriver();
        
        
        driver.get("https://www.facebook.com/");
        
        driver.manage().window().maximize();
        
        WebElement email=driver.findElement(By.id("email"));
        WebElement pass=driver.findElement(By.id("pass"));
        
        WebElement button=driver.findElement(By.xpath("//button[@name=\"login\"]"));

        
        JavascriptExecutor JS=(JavascriptExecutor) driver;
        
        JS.executeScript("arguments[0].value='"+"Ninad"+"';", email);
        JS.executeScript("arguments[0].value='"+"12345"+"';", pass);
        
        Thread.sleep(3000);
        JS.executeScript("arguments[0].click()", button);
        
        
        
        
	}

}
