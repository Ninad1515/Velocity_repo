package Automation;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosition {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webDriver.chrome.driver", "D:\\\\velocity automation\\\\chromedriver_win32.exe");
        
        WebDriver driver= new ChromeDriver();
        
        
        driver.get("https://www.apple.com/in/");
        
        driver.manage().window().maximize();
        Thread.sleep(2000);
        
        Point P1= new Point(200,300);
        Thread.sleep(3000);
        
        driver.manage().window().setPosition(P1);
        
        Thread.sleep(4000);
        
        System.out.println(driver.manage().window().getPosition());
        
        driver.close();
        

	}

}
