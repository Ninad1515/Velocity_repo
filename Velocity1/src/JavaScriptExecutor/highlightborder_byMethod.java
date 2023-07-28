package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class highlightborder_byMethod {

	public static void main(String[] args) {
System.setProperty("webDriver.chrome.driver", "D:\\\\velocity automation\\\\chromedriver_win32.exe");
        
        WebDriver driver= new ChromeDriver();
        
        
        driver.get("https://www.facebook.com/");
        
        driver.manage().window().maximize();
        
        WebElement Img=driver.findElement(By.xpath("//img"));
        
        WebElement Img1=driver.findElement(By.id("email"));
        
        WebElement Img2=driver.findElement(By.id("pass"));
        
        
        
        highlightborder_byMethod.border(driver, Img);
        highlightborder_byMethod.border(driver, Img1);
        highlightborder_byMethod.border(driver, Img2);
        
        
        
             

        
        
        
	}
	public static void border(WebDriver driver,WebElement element) {
		JavascriptExecutor JS=(JavascriptExecutor) driver;
		
		JS.executeScript("arguments[0].style.border='5px solid black'", element);
		
		
		
		JS.executeScript("arguments[0].style.background='green'", element);
	}

}
