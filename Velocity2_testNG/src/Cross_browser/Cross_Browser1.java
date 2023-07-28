package Cross_browser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Cross_Browser1 {
	
	WebDriver driver;
	@Parameters("Browsername")
	@Test
	public void Orange(String Browsername){
		
		if(Browsername.equalsIgnoreCase("Chrome")) {
			System.out.println("webDriver.chrome.driver\", \"D:\\\\\\\\velocity automation\\\\\\\\chromedriver_win32.exe\"");
			driver=new ChromeDriver();
			
		}
		else if(Browsername.equalsIgnoreCase("FireFox")) {
			System.out.println("webDriver.gecko.driver\",\"D:\\velocity manual\\geckodriver-v0.33.0-win32");
			driver=new FirefoxDriver();
		
	    }
		else if(Browsername.equalsIgnoreCase("Edge")) {
			System.out.println("webDriver.edge.driver\",\"D:\\velocity manual\\edgedriver_win64");
			driver=new EdgeDriver();
	
	
	
		} 
	    
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    
	    driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
	    
	    driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123");
	    
	    driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	    
	    String Act_result="kailaahAlbert jadhavSR";
	    
	    String Exp_result=driver.findElement(By.xpath("//p[@class=\"oxd-userdropdown-name\"]")).getText();
	    
	    Assert.assertEquals(Act_result, Exp_result);
	    
	    System.out.println("Correct username");
	    
	    driver.quit();
	    
	    
	    
	    
	    
	    
	    
	    
		}
	}


