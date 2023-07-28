package Iframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframes2 {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webDriver.chrome.driver", "D:\\\\velocity automation\\\\chromedriver_win32.exe");
        
        WebDriver driver= new ChromeDriver();
        
        
        driver.get("https://demo.automationtesting.in/Frames.html");
        
        driver.manage().window().maximize();
        
        driver.switchTo().frame("singleframe");
        
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//input")).sendKeys("Helllo");
        
        Thread.sleep(2000);
        
        driver.switchTo().defaultContent();
        
        driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
        
        Thread.sleep(2000);
        driver.quit();
	}

}
