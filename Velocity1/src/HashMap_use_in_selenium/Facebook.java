package HashMap_use_in_selenium;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	

	public static HashMap<String, String> Login(){
         HashMap<String, String> HM=new HashMap<String,String>();
         HM.put("A", "Ninad:Ninad123");
         HM.put("B", "Sid@124:Sid@23");
         HM.put("C", "Sachin:sachin@123");
         HM.put("D", "Shree:Shree345");
         
         return HM;
	}
	
	public static void main(String[] args) throws InterruptedException {
System.setProperty("webDriver.chrome.driver", "D:\\\\velocity automation\\\\chromedriver_win32.exe");
        
        WebDriver driver= new ChromeDriver();
        
        
        driver.get("https://www.facebook.com/");
        
        driver.manage().window().maximize();
        
        String Name=Facebook.Login().get("A");
        String arr[]=Name.split(":");
        
        driver.findElement(By.id("email")).sendKeys(arr[0]);
        driver.findElement(By.id("pass")).sendKeys(arr[1]);
        driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
        
        
        String Act=driver.getTitle();
        if(Act.equals("Log in to Facebook")) {
        	System.out.println("Correct Title");
        }else {
        	System.out.println("Incorrect username");
        	
        }
         Thread.sleep(4000);
        driver.close();
        
		
		
	}

         
	

}
