package Synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicitWeight2 {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webDriver.chrome.driver", "D:\\\\velocity automation\\\\chromedriver_win32.exe");
        
        WebDriver driver= new ChromeDriver();
        
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        
        
       driver.manage().window().maximize();
		
       String url="https://www.w3schools.com/";
       
       driver.get(url);
       
       driver.findElement(By.id("search2")).sendKeys("java");
       
       driver.findElement(By.id("learntocode_searchbtn")).click();
	}

}
