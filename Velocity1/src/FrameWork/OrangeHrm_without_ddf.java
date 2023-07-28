package FrameWork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrm_without_ddf {

	public static void main(String[] args) {
System.setProperty("webDriver.chrome.driver", "D:\\\\velocity automation\\\\chromedriver_win32.exe");
        
        WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);

        
        
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        
        driver.manage().window().maximize();
        
        driver.findElement(By.xpath("//input[@name=\\\"username\\\"]")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
        
        String Username="shrinath j";
        String Name= driver.findElement(By.xpath("//p[@class=\"oxd-userdropdown-name\"]")).getText();
       
        System.out.println(Name);
       
       if(Username.equals(Name)) {
    	   System.out.println("correct username");
       }else {
    	   System.out.println("incorrect username");
       }
        
        
        
	}

}
