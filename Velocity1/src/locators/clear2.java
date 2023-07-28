package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class clear2 {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webDriver.chrome.driver", "D:\\\\velocity automation\\\\chromedriver_win32.exe");
        
        WebDriver driver= new ChromeDriver();
        
        
        driver.get("https://www.facebook.com/");
        
        driver.manage().window().maximize();
        
        WebElement W1=driver.findElement(By.id("email"));
        
        W1.sendKeys("bharati");
        Thread.sleep(2000);
        W1.clear();
        
        W1.sendKeys("ninad");
        Thread.sleep(2000);
        
        WebElement P2=driver.findElement(By.id("pass"));
        
        P2.sendKeys("234343");
        Thread.sleep(2000);
        P2.clear();
        
        P2.sendKeys("e3434");
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//button[@name=\"login\"]")).click();

       
        
        
       
        

	}

}
