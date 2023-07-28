package Project;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

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



public class byjus_Offline_login {

	WebDriver driver;
	@BeforeMethod
     public void Get() {
	System.setProperty("webDriver.chrome.driver", "D:\\\\velocity automation\\\\chromedriver_win32.exe");
    
     driver= new ChromeDriver();

    driver.get("https://byjus.com/");
    
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
}
	@Test
	public void Login() throws InterruptedException {
		
		driver.findElement(By.name("name")).sendKeys("Ninad Patil");
		driver.findElement(By.name("mobile")).sendKeys("7057057028");
		driver.findElement(By.xpath("//button[contains(text(),\"Send OTP\")]")).click();
        
		Thread.sleep(15000);
		
		WebElement State=driver.findElement(By.name("state"));
		Select S= new Select(State);
		
		driver.findElement(By.xpath("//option[@value=\"Maharashtra\"]")).click();
		
		WebElement Grade=driver.findElement(By.xpath("//select[@name=\"grade\"]"));
		
		Thread.sleep(3000);
		Select S1=new Select(Grade);
		driver.findElement(By.xpath("//option[@data-grade=\"5\"]")).click();
		
		driver.findElement(By.xpath("(//button[@type=\"button\"])[5]")).click();
		
		Thread.sleep(3000);
		
		WebElement City=driver.findElement(By.name("city-offline"));
		Select S2=new Select(City);
		
		driver.findElement(By.xpath("//option[@value=\"Pune\"]")).click();
		Thread.sleep(2000);
		

		WebElement Center=driver.findElement(By.name("center-offline"));
		Select S3=new Select(Center);
		
		driver.findElement(By.xpath("//option[@value=\"Pune-Katraj\"]")).click();
		Thread.sleep(10000);
		
//		WebElement Date=driver.findElement(By.xpath("//input[@placeholder=\"Select Date\"]"));
//        Date.click();
//        Date.sendKeys("14");
       
        Thread.sleep(3000);
        
        WebElement Time=driver.findElement(By.xpath("(//select[@class=\"form-control\"])[5]"));
        Select S4=new Select(Time);
        driver.findElement(By.xpath("//option[@value=\"12 PM - 2 PM\"]")).click();
        
        Thread.sleep(5000);
        
        driver.findElement(By.id("schedule-offline-session-btn")).click();
        
		String Text=driver.findElement(By.xpath("//span[contains(text(),\"Your Doubt Session \")]")).getText();
		System.out.println("You succesfully Registered"+Text);
		
		
		String Text1=driver.findElement(By.xpath("//span[contains(text(),\"Your ses\")]")).getText();
		System.out.println(Text1);
		
		
		
		
	}
	
        
		
	
	@AfterMethod
	public void Teardown() throws InterruptedException {
		Thread.sleep(5000);
		
		driver.quit();
	}
	
	
	
}