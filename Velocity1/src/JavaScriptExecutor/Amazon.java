package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
System.setProperty("webDriver.chrome.driver", "D:\\\\velocity automation\\\\chromedriver_win32.exe");
        
        WebDriver driver= new ChromeDriver();
        
        
        driver.get("https://www.amazon.in/");
        
        driver.manage().window().maximize();
        
        JavascriptExecutor JS=(JavascriptExecutor) driver;
        WebElement Name=driver.findElement(By.xpath("//span[contains(text(),'Explore new collections from stores near you')]"));
        
        JS.executeScript("arguments[0].scrollIntoView();", Name);
	}

}
