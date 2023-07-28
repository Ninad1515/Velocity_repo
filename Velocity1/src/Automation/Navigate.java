package Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webDriver.chrome.driver", "D:\\\\velocity automation\\\\chromedriver_win32.exe");
        
        WebDriver driver= new ChromeDriver();
        
        
        driver.get("https://www.orangehrm.com/");
        
        driver.manage().window().maximize();
        
        Thread.sleep(2000);
        
        driver.get("https://www.apple.com/in/");
        
        Thread.sleep(2000);
        
        
        driver.navigate().back();
        Thread.sleep(2000);
        
        driver.navigate().forward();
        Thread.sleep(2000);
        
        driver.navigate().refresh();
        Thread.sleep(2000);
        
        driver.close();
        
        
		

	}

}
