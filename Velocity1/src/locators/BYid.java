package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BYid {

	public static void main(String[] args) {
System.setProperty("webDriver.chrome.driver", "D:\\\\velocity automation\\\\chromedriver_win32.exe");
        
        WebDriver driver= new ChromeDriver();
        
        
        driver.get("https://www.facebook.com/");
        
        driver.manage().window().maximize();
        
        
        driver.findElement(By.id("email")).sendKeys("NINad@1234");
        
        driver.findElement(By.id("pass")).sendKeys("122334343");
        
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();

	}

}
