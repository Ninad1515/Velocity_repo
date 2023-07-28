package Listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListboxWithoutSelectClass {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webDriver.chrome.driver", "D:\\\\velocity automation\\\\chromedriver_win32.exe");
        
         driver= new ChromeDriver();
        
        
        driver.get("https://www.facebook.com/");
        
        driver.manage().window().maximize();
        
        driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
        
        Thread.sleep(5000);
        
        driver.findElement(By.xpath("//input[@class=\"inputtext _58mg _5dba _2ph-\"]")).sendKeys("Ninad");
        driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("Patil");
        driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("7057057028");
        driver.findElement(By.xpath("//input[@name=\"reg_passwd__\"]")).sendKeys("bbbbbb");  
        
        
        
        String Day="//select[@id=\"day\"]/option";
        String Month="//select[@id=\"month\"]/option";
        String Year="//select[@id=\"year\"]/option";
        
        String DOB="15-Mar-1999";
        String Date[]=DOB.split("-");
        
        Selectdropdown(Day, Date[0]);
        Selectdropdown(Month, Date[1]);
        Selectdropdown(Year, Date[2]);
        
        
        
        
	}
        public static void Selectdropdown(String element,String Value) {
        	List<WebElement> N=driver.findElements(By.xpath(element));
        //	System.out.println(N);
        	
        	for (int i=0;i<N.size();i++) {
        		System.out.println(N.get(i).getText());
        	
        		
        		if(N.get(i).getText().equals(Value)) {
        			N.get(i).click();
        		}
        	}
        	
        }
}
