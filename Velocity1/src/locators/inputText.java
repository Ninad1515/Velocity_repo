package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class inputText {

	public static void main(String[] args) {
System.setProperty("webDriver.chrome.driver", "D:\\\\velocity automation\\\\chromedriver_win32.exe");
        
        WebDriver driver= new ChromeDriver();
        
        
        driver.get("https://www.facebook.com/");
        
        driver.manage().window().maximize();
        
        driver.findElement(By.cssSelector("input.inputtext[name=email]")).sendKeys("bhgh");
        
        driver.findElement(By.cssSelector("input.inputtext[class=\"inputtext _55r1 _6luy _9npi\"]")).sendKeys("767676");
        
        driver.findElement(By.cssSelector("button._42ft._4jy0._6lth._4jy6._4jy1.selected._51sy")).click();

	}

}
