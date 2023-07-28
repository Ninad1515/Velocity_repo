package Automation;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webDriver.chrome.driver", "D:\\\\velocity automation\\\\chromedriver_win32.exe");
        
        WebDriver driver= new ChromeDriver();
        
        
        driver.get("https://www.apple.com/in/");
        
        driver.manage().window().maximize();
        Thread.sleep(2000);
        
        Dimension d1= new Dimension(516,302);
        Thread.sleep(3000);
        
        driver.manage().window().setSize(d1);
        
        Thread.sleep(4000);
        
        System.out.println(driver.manage().window().getSize());
        
        driver.close();
        

	}

}
