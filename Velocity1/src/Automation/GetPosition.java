package Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPosition {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webDriver.chrome.driver", "D:\\\\velocity automation\\\\chromedriver_win32.exe");
        
        WebDriver driver= new ChromeDriver();
        
        
        driver.get("https://www.orangehrm.com/");
        
        Thread.sleep(5000);
        
        driver.manage().window().maximize();
        
        Thread.sleep(5000);
        
        System.out.println(driver.manage().window().getPosition());
        
        driver.close();

	}
	    

}
