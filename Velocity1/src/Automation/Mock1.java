package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mock1 {

	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webDriver.chrome.driver", "D:\\velocity automation\\chromedriver_win32.exe");
        
        WebDriver Driver= new ChromeDriver();
        
        Driver.get("https://www.irctc.co.in/nget/train-search");
        
        Driver.manage().window().maximize();
        
        Driver.findElement(By.xpath("//a[@aria-label=\"Click here to Login in application\"]")).click();        
        Thread.sleep(5000);
        
        Driver.close();
	}

}
