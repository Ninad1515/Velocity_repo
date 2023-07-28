package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class className {

	public static void main(String[] args) {
System.setProperty("webDriver.chrome.driver", "D:\\\\velocity automation\\\\chromedriver_win32.exe");
        
        WebDriver driver= new ChromeDriver();
        
        
        driver.get("https://www.amazon.in/");
        
        driver.manage().window().maximize();
        
        driver.findElement(By.className("nav-input")).sendKeys("mobile");
        
        driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]")).click();
        
     //   driver.findElement(By.xpath("//span[@class=\"a-size-base a-color-base\"]")).click();
        

	}

}
