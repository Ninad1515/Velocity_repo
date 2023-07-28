package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath2 {

	public static void main(String[] args) {
System.setProperty("webDriver.chrome.driver", "D:\\\\velocity automation\\\\chromedriver_win32.exe");
        
        WebDriver driver= new ChromeDriver();
        
        
        driver.get("file:///C:/Users/Ninad/Desktop/HTML/reg.html");
        
        driver.manage().window().maximize();
		
	    driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("NINAD");
	    driver.findElement(By.xpath("//input[@name=\"Last Name\"]")).sendKeys("PATIL");
	    driver.findElement(By.xpath("//input[@name=\"Mobile no\"]")).sendKeys("7057057028");
	    driver.findElement(By.xpath("//input[@name=\"Email id\"]")).sendKeys("nndpatil9@gmail.com");
	    driver.findElement(By.xpath("//input[@type=\"radio\"]")).click();
	    driver.findElement(By.xpath("//option[@value=\"BSC\"]")).click();
	    driver.findElement(By.xpath("//input[@value=\"submit\"]")).click();
	}

}
