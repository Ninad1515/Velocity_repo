package Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getcurrenturl {

	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webDriver.chrome.driver", "D:\\\\velocity automation\\\\chromedriver_win32.exe");
		          
		           WebDriver driver= new ChromeDriver();
		           
		           
		           driver.get("https://www.orangehrm.com/");
		           
		            String URL= driver.getCurrentUrl();
		            System.out.println(URL);
		            
		          if(URL.equals("https://www.orangehrm.com/"))
		        	   System.out.println("Correct url");
		           else {
		        	   System.out.println("incorrect");
		           
		           }
		           
		           driver.close();
		           
	}	           
		         
}	           
		           
		          
		          
	
	
	
