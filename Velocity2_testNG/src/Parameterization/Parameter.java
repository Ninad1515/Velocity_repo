package Parameterization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter {
     WebDriver driver;
     @Parameters({"URL"})
     @BeforeMethod
     public void Setup(String URL) {
    	 System.setProperty("webDriver.chrome.driver", "D:\\\\velocity automation\\\\chromedriver_win32.exe");
    	    
    	    driver= new ChromeDriver();
    	    driver.manage().window().maximize();
    	    driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
    	    
    	    driver.get(URL);
     }
     @Parameters({"UseraName","PassWord"})
     @Test
     public void Login(String Username,String Password) {
    	 WebElement User=driver.findElement(By.id("email"));
    	 User.sendKeys(Username);
    	 WebElement Pass=driver.findElement(By.id("pass"));
         Pass.sendKeys(Password);
         
         driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
         
         String Act=driver.getTitle();
         String Title="Facebook";
         
         if(Act.equals(Title)) {
        	 System.out.println("Correct Title");
         }else {
        	 System.out.println("Incoorect Title");
         }

    	 
     }
     @AfterMethod
     public void Teardown() {
    	 driver.quit();
     }
    	    
    	   
    		
     }
	
	

