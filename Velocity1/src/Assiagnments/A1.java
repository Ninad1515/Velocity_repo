package Assiagnments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A1 {
	
	static WebDriver driver;

	public static void main(String[] args) {
System.setProperty("webDriver.chrome.driver", "D:\\\\velocity automation\\\\chromedriver_win32.exe");
        
        driver= new ChromeDriver();
        
        
        driver.get("https://demo.automationtesting.in/Register.html");
        
        driver.manage().window().maximize();
        
        List<WebElement> Skills=driver.findElements(By.xpath("//select[@id=\"Skills\"]//option"));
        
        System.out.println(Skills.size());
        
        for(int i =0; i<Skills.size();i++) {
        	
        	String Skills1=Skills.get(i).getText();
        	
        	System.out.println("Skills="+Skills1);
        	
        	if(Skills.get(i).getText().equals("APIs")) {
        		System.out.println(Skills.get(i).getText());
        		Skills.get(i).click();
        	}
        }
        		
        		String Year="//select[@placeholder=\"Year\"]//option";
        		
        		String Month="//select[@placeholder=\"Month\"]//option";
        		
        		String Day="//select[@placeholder=\"Day\"]//option";
        		
        		
        		String DOB="1923-June-8";
        		String Date[]=DOB.split("-");
        		
        		    Selectdropdown(Year, Date[0]);
        	        Selectdropdown(Month, Date[1]);
        	        Selectdropdown(Day, Date[2]);
        	        
        		
        		    
        				
        	}
        
        	
        	public static void Selectdropdown(String Element, String Value) {
        		
        		List<WebElement> D=driver.findElements(By.xpath(Element));
        		System.out.println(D);
        		
        		for(int i = 0; i<D.size();i++) {
        			System.out.println(D.get(i).getText());
        			
        			
        			if(D.get(i).getText().equals(Value)) {
        				D.get(i).click();
        			}
        		}
        	}
        	
        }
	
        		
        	 
         	

        	
                   	
        		
            
            
        
        
	


