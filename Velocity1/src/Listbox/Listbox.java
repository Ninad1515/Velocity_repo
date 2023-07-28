package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Listbox {

	public static void main(String[] args) throws InterruptedException {
       System.setProperty("webDriver.chrome.driver", "D:\\\\velocity automation\\\\chromedriver_win32.exe");
        
        WebDriver driver= new ChromeDriver();
        
        
        driver.get("https://www.facebook.com/");
        
        driver.manage().window().maximize();
        
        driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click();
        
        Thread.sleep(1000);
        
        driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("ninad");
        
        driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("patil");
        
        driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("7057057028");
        
        driver.findElement(By.xpath("//input[@name=\"reg_passwd__\"]")).sendKeys("sdsdad");
        
        
        driver.findElement(By.id("day")).click();
        
        driver.findElement(By.xpath("//option[@value=15]")).click();
        
        driver.findElement(By.id("month")).click();
        
        driver.findElement(By.xpath("//option[contains(text(),'Mar')]")).click();
        
        driver.findElement(By.id("year")).click();
        
        driver.findElement(By.xpath("//option[contains(text(),'1999')]")).click();
        
        driver.findElement(By.xpath("//label[@for=\"u_s_5_fo\"]")).click();        
        

        
        
	}

}
