package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_by_element {

	public static void main(String[] args) {
System.setProperty("webDriver.chrome.driver", "D:\\\\velocity automation\\\\chromedriver_win32.exe");
        
        WebDriver driver= new ChromeDriver();
        
        
        driver.get("https://www.w3schools.com/");
        
        driver.manage().window().maximize();
        
        JavascriptExecutor JS=(JavascriptExecutor) driver;
        
        WebElement Name=driver.findElement(By.xpath("//h1[contains(text(),'Color Picker')]"));
        
        JS.executeScript("arguments[0].scrollIntoView();", Name);
                
	}

}
