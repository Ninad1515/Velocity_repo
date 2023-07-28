package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class clear {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webDriver.chrome.driver", "D:\\\\velocity automation\\\\chromedriver_win32.exe");
        
        WebDriver driver= new ChromeDriver();
        
        
        driver.get("https://www.facebook.com/");
        
        driver.manage().window().maximize();
        
        driver.findElement(By.id("email")).sendKeys("ninad");
        
        Thread.sleep(5000);
        
        driver.findElement(By.id("email")).clear();
        
        Thread.sleep(5000);
        
        driver.findElement(By.id("email")).sendKeys("ADSdA");
        
        
        driver.findElement(By.id("pass")).sendKeys("2234343");
        
        Thread.sleep(5454);
        
        driver.findElement(By.id("pass")).clear();
        
        driver.findElement(By.id("pass")).sendKeys("hiiii");
        
        
        
        
        
        
        driver.findElement(By.xpath("//button[@name=\"login\"]")).click();

	}

}
