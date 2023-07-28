package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mock {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.Driver", "D:\\\\velocity automation\\\\chromedriver_win32.exe");
		
		    WebDriver Driver=new ChromeDriver();
		    
		   Driver.get("https://www.redbus.in/");
            
		   
		   Driver.findElement(By.xpath("//input[@class=\"sc-bxivhb hrsLPT\"]")).sendKeys("pune");
		   
		   Driver.findElement(By.xpath(""));
	}

}
