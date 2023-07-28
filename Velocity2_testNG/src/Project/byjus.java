package Project;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class byjus {

	WebDriver driver;
	@BeforeMethod
     public void Get() {
	System.setProperty("webDriver.chrome.driver", "D:\\\\velocity automation\\\\chromedriver_win32.exe");
    
     driver= new ChromeDriver();

    driver.get("https://byjus.com/");
    
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
}
	@Test
	public void Login() throws InterruptedException {
		driver.findElement(By.xpath("//input[@type=\"radio\"]")).click();
		driver.findElement(By.xpath("//input[@name=\"name\"]")).sendKeys("Ninad");
		driver.findElement(By.xpath("//input[@name=\"mobile\"]")).sendKeys("7057057028");
		driver.findElement(By.xpath("//button[contains(text(),\"Send OTP\")]")).click();
		
		Thread.sleep(15000);
		
		
		WebElement State=driver.findElement(By.xpath("//select[@name=\"state\"]"));
		
		Select S=new Select(State);
		
		driver.findElement(By.xpath("//option[@value=\"Maharashtra\"]")).click();
		
		WebElement Grade=driver.findElement(By.xpath("//select[@name=\"grade\"]"));
		
		Select S1=new Select(Grade);
		
		S1.selectByValue("16");
		
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		Thread.sleep(4000);
		
		//String Text=driver.findElement(By.xpath("//p[contains(text(),\"Booking Successful!\")]")).getText();
         //System.out.println("BYJUS BOOKING SUMMARY--->"+Text);
         
        driver.findElement(By.xpath("//img[@alt=\"user menu\"][2]")).click();
        
        driver.findElement(By.xpath("//span[@class=\"font-14 profile-view-item\"]")).click();
        
        driver.findElement(By.xpath("//img[@alt=\"edit\"]")).click();
        driver.findElement(By.xpath("(//img[@alt=\"profile icon\"])[2]")).click();
        
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//input[@name=\"fullName\"]")).clear();
        
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//input[@name=\"fullName\"]")).sendKeys("Ninad Patil");
        
        Thread.sleep(4000);
        
        driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
        
        Thread.sleep(3000);
        
        
       
        
        byjus.POPUP(driver, "Byjus Profile Saved Succesfully");
        
        
       
            
        
    
	
	}
	@Test
	public static void POPUP(WebDriver driver,String Message) {
		JavascriptExecutor JS= (JavascriptExecutor) driver;
		JS.executeScript("window.scrollBy(0,5000)", "");
		JS.executeScript("alert('"+Message+"')");
        
        
        
        
		
	}
	@AfterMethod
	public void Teardown() throws InterruptedException {
		Thread.sleep(5000);
		
		driver.quit();
	}
	
	
	
}