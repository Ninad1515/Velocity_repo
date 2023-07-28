package JavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_down_Up_till_bottom {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webDriver.chrome.driver", "D:\\\\velocity automation\\\\chromedriver_win32.exe");
        
        WebDriver driver= new ChromeDriver();
        
        
        driver.get("https://www.w3schools.com/");
        
        driver.manage().window().maximize();
        
        JavascriptExecutor JS=(JavascriptExecutor) driver;
                
        JS.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
        
        Thread.sleep(3000);
        
        JS.executeScript("document.documentElement.scrollTop=0", "");
	}

}
