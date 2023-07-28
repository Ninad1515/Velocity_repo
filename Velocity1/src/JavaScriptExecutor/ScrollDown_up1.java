package JavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown_up1 {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webDriver.chrome.driver", "D:\\\\velocity automation\\\\chromedriver_win32.exe");
        
        WebDriver driver= new ChromeDriver();
        
        
        driver.get("https://www.w3schools.com/");
        
        driver.manage().window().maximize();
        
        JavascriptExecutor JS=(JavascriptExecutor) driver;
                
        JS.executeScript("window.scrollBy(0,9000)","");//scrolldown
        
        Thread.sleep(3000);

        JS.executeScript("window.scrollBy(0,-3000)", "");//scrollup
        
       // Thread.sleep(3000);
        
       
	}

}
