package Listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus {

	public static void main(String[] args) throws InterruptedException {
     System.setProperty("webDriver.chrome.driver", "D:\\\\velocity automation\\\\chromedriver_win32.exe");
        
        WebDriver driver= new ChromeDriver();
        
        
        driver.get("https://www.redbus.in/");
        
        driver.manage().window().maximize();
        
        driver.findElement(By.xpath("//input[@id=\"src\"]")).sendKeys("Kolhapur");
      
        Thread.sleep(2000);
        
        
        List<WebElement> City=driver.findElements(By.xpath("//text[@class=\"placeHolderMainText\"]"));
        Thread.sleep(2000);
        
   
        
        System.out.println(City.size());
    

        
        Thread.sleep(5000);
        
        
        for (int i=0;i<City.size();i++) {
        	
        	String CityNames=City.get(i).getText();
        	System.out.println(CityNames);
        	
        	if(City.get(i).getText().equals("Kagal (Kolhapur)")) {
        		System.out.println(City.get(i).getText());
        		City.get(i).click();
        		break;
        		
        		
           	}
       	 
        	
            }
            
           
            driver.findElement(By.xpath("//input[@id=\"dest\"]")).sendKeys("pune");
            
            Thread.sleep(2000);
            List<WebElement> Destination=driver.findElements(By.xpath("//text[@class=\"placeHolderMainText\"]"));

            Thread.sleep(2000);
            System.out.println(Destination.size());
           
              for(int i=0;i<Destination.size();i++) {
            	
              String Dest=Destination.get(i).getText();
            	
           	  if(Destination.get(i).getText().equals("Wakad")) {
           		System.out.println(Destination.get(i).getText());
            		Destination.get(i).click();
            		
            		break;
            		
            		
           	  }
           	  
              }
              
              driver.findElement(By.xpath("//div[@id=\"onwardCal\"]")).click();
              
              List<WebElement> Calender =driver.findElements(By.xpath("//div[@class=\"sc-kAzzGY dYHzlP\"]"));
          	System.out.println(Calender.size());
          	
          	Thread.sleep(2000);
          	
          	for(int i=0;i<Calender.size();i++) {
          		System.out.println(Calender.get(i).getText());
          		
          		if(Calender.get(i).getText().equals("15 Jun")){
          			System.out.println(Calender.get(i).getText());
          			Calender.get(i).click();
          			
              
           
              
              
              
    	}
    }
	}
}
        		
        		
        		
        		
        		
        		
 


           
        
        	
      
        
      
       
        
               
        
        
        


	



