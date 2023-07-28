package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {

	public static void main(String[] args) {
System.setProperty("webDriver.chrome.driver", "D:\\\\velocity automation\\\\chromedriver_win32.exe");
        
        WebDriver driver= new ChromeDriver();
        
        
        driver.get("https://www.facebook.com/");
        
        driver.manage().window().maximize();
        
        String ER="Facebook helps you connect and share with the people in your life.";
        
        
        
        String AT=driver.findElement(By.xpath("//h2[@class=\"_8eso\"]")).getText();
        
                
        if(ER.equals(AT)) {
        	System.out.println("Correct");
        	
        	
        }
        else
        	System.out.println("incorrect");

	}
	
	      
	
	 

}
