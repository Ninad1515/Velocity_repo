package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicXpath {

	public static void main(String[] args) {
System.setProperty("webDriver.chrome.driver", "D:\\\\velocity automation\\\\chromedriver_win32.exe");
        
        WebDriver driver= new ChromeDriver();
        
        
        driver.get("https://practicetestautomation.com/practice-test-login/");
        
        driver.manage().window().maximize();
        
        driver.findElement(By.xpath("//button[starts-with(@id,'submit')]")).click();
        
     		

	}

}
