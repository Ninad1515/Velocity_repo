package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class lisrbox4 {

	public static void main(String[] args) {
        System.setProperty("webDriver.chrome.driver", "D:\\\\\\\\velocity automation\\\\\\\\chromedriver_win32.exe");
               WebDriver driver=new ChromeDriver(); 
               
               driver.get("https://login.yahoo.com/?.intl=in");
               driver.manage().window().maximize();
               driver.findElement(By.xpath("//a[@id=\"createacc\"]")).click();
               
               driver.findElement(By.xpath("//input[@id=\"usernamereg-firstName\"]")).sendKeys("ninad");
               driver.findElement(By.xpath("//input[@id=\"usernamereg-lastName\"]")).sendKeys("Patil");
               driver.findElement(By.xpath("//input[@name=\"userId\"]")).sendKeys("nndp");
               driver.findElement(By.xpath("//select[@name=\"yidDomain\"]")).click();
               driver.findElement(By.xpath("//option[@value=\"myyahoo.com\"]")).click();
               driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("fnjfn");
               
               WebElement Month =driver.findElement(By.xpath("//select[@id=\"usernamereg-month\"]"));
               
               String DOB = "March";
               

        
		
		
		
	}

}
