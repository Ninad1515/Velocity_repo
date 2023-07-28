package PopUp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindow_popup9 {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webDriver.chrome.driver", "D:\\\\velocity automation\\\\chromedriver_win32.exe");
        
        WebDriver driver= new ChromeDriver();
        
        
        driver.get("https://demo.automationtesting.in/Windows.html");
        
        driver.manage().window().maximize();
        
        driver.findElement(By.xpath("//a[contains(text(),'Open New Seperate Windows')]")).click();
        
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("(//button[contains(text(),'click')])[2]")).click();
        
        
        
        String ParentWindow=driver.getWindowHandle();
        System.out.println(ParentWindow);
        
        
        Thread.sleep(3000);
        
       
        
        Set<String>ChildWindows=driver.getWindowHandles();
        
        for(String ChildWindow:ChildWindows) {
          if(!ParentWindow.equalsIgnoreCase(ChildWindow)) {
        	  driver.switchTo().window(ChildWindow);
        	  
        	  String Ctext=driver.findElement(By.xpath("//h1[contains(text(),'Selenium a')]")).getText();
        	  
        	 // Thread.sleep(2000);
        	  
        	  System.out.println(Ctext);
        	  
        	  Thread.sleep(3000);
        	  
        	 driver.close();
        	 
        	 
        	 
        	 
        	 
           

          }
        }
        driver.switchTo().window(ParentWindow);
        
        Thread.sleep(2000);
          
          String Ptext=driver.findElement(By.xpath("//a[contains(text(),'Automation Testing')]")).getText();
        	System.out.println(Ptext);
        	
        	driver.quit();
     	
        
        
	}

}
