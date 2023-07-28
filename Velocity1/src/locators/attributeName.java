package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class attributeName {

	public static void main(String[] args) {
System.setProperty("webDriver.chrome.driver", "D:\\\\velocity automation\\\\chromedriver_win32.exe");
        
        WebDriver driver= new ChromeDriver();
        
        
        driver.get("https://www.facebook.com/");
        
        driver.manage().window().maximize();
        
     //   driver.findElement(By.cssSelector("[name=email]")).sendKeys("Ninad@24w");
        
        driver.findElement(By.cssSelector("input[name=email]")).sendKeys("ninad@3232");
        
        driver.findElement(By.cssSelector("button[name=login]")).click();

	}

}
