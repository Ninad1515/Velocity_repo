package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath3 {

	public static void main(String[] args) {
System.setProperty("webDriver.chrome.driver", "D:\\\\velocity automation\\\\chromedriver_win32.exe");
        
        WebDriver driver= new ChromeDriver();
        
        
        driver.get("https://www.youtube.com/");
        
        driver.manage().window().maximize();
		
       driver.findElement(By.xpath("//input[@id=\"search\"]")).sendKeys("people");
       driver.findElement(By.xpath("//button[@id=\"search-icon-legacy\"]")).click();
       

	}

}
