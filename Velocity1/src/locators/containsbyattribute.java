package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class containsbyattribute {

	public static void main(String[] args) {
System.setProperty("webDriver.chrome.driver", "D:\\\\velocity automation\\\\chromedriver_win32.exe");
        
        WebDriver driver= new ChromeDriver();
        
        
        driver.get("https://www.facebook.com/");
        
        driver.manage().window().maximize();
        
        driver.findElement(By.xpath("//input[contains(@class,'inputtext _55r1 _6luy')]")).sendKeys("NINAD");
        
        driver.findElement(By.xpath("//input[contains(@class,'inputtext _55r1 _6luy _9npi')]")).sendKeys("1234");
        
        driver.findElement(By.xpath("//button[contains(@class,'_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy')]")).click()
;
	}

}
