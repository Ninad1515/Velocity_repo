package Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {

	public static void main(String[] args) {
System.setProperty("webDriver.chrome.driver", "D:\\\\velocity automation\\\\chromedriver_win32.exe");
        
        WebDriver driver= new ChromeDriver();
        
        
        driver.get("https://www.apple.com/in/");
        
        String Title= driver.getTitle();
        
        System.out.println(Title);
        
        driver.close();
        
       String ExpectedTitle="Apple (India)";
        
        if(Title.equals(ExpectedTitle)) {
        	System.out.println("||correct title||");
        }  	
        	else {
        	System.out.println("incorrect title");
        	}
        }
}     
	



