package Iframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframes1 {

	public static void main(String[] args) throws InterruptedException {
          
System.setProperty("webDriver.chrome.driver", "D:\\\\velocity automation\\\\chromedriver_win32.exe");
        
        WebDriver driver= new ChromeDriver();
        
        
        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
        
        driver.manage().window().maximize();
        
        driver.switchTo().frame("iframeResult");
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//button[@type=\"button\"]")).click();
        
        driver.switchTo().defaultContent();
        
        driver.findElement(By.xpath("//a[@id]")).click();
        
        Thread.sleep(5000);
        
        driver.quit();
        
		    
	}

}
