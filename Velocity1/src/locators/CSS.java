package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webDriver.chrome.driver", "D:\\\\velocity automation\\\\chromedriver_win32.exe");
        
        WebDriver driver= new ChromeDriver();
        
        
        driver.get("https://practicetestautomation.com/practice-test-login/");
        
        
        
        driver.manage().window().maximize();
        
        driver.findElement(By.cssSelector("#username")).sendKeys("ninad@12334");
        
        driver.findElement(By.cssSelector("#password")).sendKeys("55656");
        
        Thread.sleep(5000);
        
        driver.findElement(By.cssSelector("#submit")).click();
        
        
        

	}

}
