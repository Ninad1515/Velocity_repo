package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox1 {

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
        
        WebElement day= driver.findElement(By.id("day"));
        WebElement month= driver.findElement(By.id("month"));
        WebElement year= driver.findElement(By.id("year"));
        
        Select day1 = new Select(day);
        Select month1=new Select(month);
        Select year1=new Select(year);
        
        
        day1.selectByVisibleText("15");
        month1.selectByVisibleText("Mar");
        year1.selectByVisibleText("1999");
      
        Thread.sleep(1000);
        
        day1.selectByVisibleText("10");
       month1.selectByVisibleText("Dec");
       year1.selectByVisibleText("2000");
       
       Thread.sleep(1000);
       
       day1.selectByValue("26");
       month1.selectByValue("2");
       year1.selectByValue("2006");
       
       Thread.sleep(1000);
       
       day1.selectByIndex(2);
       month1.selectByIndex(10);
       year1.selectByIndex(25);
       

	}

}
