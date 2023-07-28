package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettext2 {

	public static void main(String[] args) {
System.setProperty("webDriver.chrome.driver", "D:\\\\velocity automation\\\\chromedriver_win32.exe");
        
        WebDriver driver= new ChromeDriver();
        
        
        driver.get("https://www.facebook.com/");
        
        driver.manage().window().maximize();
        
        String Np="Create a Page 1";
        
        String MP=driver.findElement(By.xpath("//a[@class=\"_8esh\"]")).getText();
        
      if(Np.equals(MP)) {
    	  System.out.println("Correct");
      }
      else
    	  System.out.println("incoorect");
      
      driver.close();
	}
       
	

}
