package Listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox5 {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webDriver.chrome.driver", "D:\\\\velocity automation\\\\chromedriver_win32.exe");
        
        WebDriver driver= new ChromeDriver();
        
        
        driver.get("https://www.facebook.com/");
        
        driver.manage().window().maximize();
        
        driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
        
        Thread.sleep(5000);
        
        driver.findElement(By.xpath("//input[@class=\"inputtext _58mg _5dba _2ph-\"]")).sendKeys("Ninad");
        driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("Patil");
        driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("7057057028");
        driver.findElement(By.xpath("//input[@name=\"reg_passwd__\"]")).sendKeys("bbbbbb");
        
                WebElement Day =driver.findElement(By.xpath("//select[@name=\"birthday_day\"]"));
                WebElement Month =driver.findElement(By.xpath("//select[@name=\"birthday_month\"]"));
                WebElement Year =driver.findElement(By.xpath("//select[@name=\"birthday_year\"]"));
                
                //Question 1
                //How will u get the total no size of list
                
                Select S=new Select(Day);
                List<WebElement> LS=S.getOptions();
                System.out.println(LS.size());
                
                
             
                
                
                
                //question 2
                //How will u print the all values
                
                for(int i=0;i<LS.size();i++) {
                	
                	String DayValues=LS.get(i).getText();
                	System.out.println(DayValues);
                	
                	if(DayValues.equals("10")) {
                		LS.get(i).click();
                    
                	
                	
                }
               
                	
                	 Select S1=new Select(Month);
                     List<WebElement> LS1=S1.getOptions();
                     System.out.println(LS1.size());
                     
            
                for(int ii=0;ii<LS1.size();ii++) {
                	
                	String MonthValues=LS1.get(ii).getText();
                	System.out.println(MonthValues);
                    
                	if(MonthValues.equals("Mar")) {
                		LS1.get(ii).click();
                	}
                    
                }
                
                
                Select S2=new Select(Year);
                List<WebElement> LS2=S2.getOptions();
                System.out.println(LS2.size());
                
                 
                for(int iii=0;iii<LS2.size();iii++) {
                	
                	String YearValues=LS2.get(iii).getText();
                	System.out.println(YearValues);
                	
                	
                	if(YearValues.equals("1999")) {
                		LS2.get(iii).click();
                	


	 
                //	driver.quit();
                }
                
                }
                }
	}
}

                	
                    
                	 
                
                		 
                	 
                
               
                	
                	
                
                
                
                
                
	
                  
	


