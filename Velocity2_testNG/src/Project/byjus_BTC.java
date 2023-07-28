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



public class byjus_BTC {

	WebDriver driver;
	@BeforeMethod
     public void Get() {
	System.setProperty("webDriver.chrome.driver", "D:\\\\velocity automation\\\\chromedriver_win32.exe");
    
     driver= new ChromeDriver();

    driver.get("https://byjus.com/btc/");
    
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
}
	@Test
	public void Login() throws InterruptedException {
		
	driver.findElement(By.xpath("//button[@class=\"counselling-btn\"]")).click();
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//input[@name=\"name\"]")).sendKeys("Ninad");
	driver.findElement(By.xpath("//input[@name=\"mobile\"]")).sendKeys("7057057028");
	driver.findElement(By.xpath("(//button[@type=\"button\"])[4]")).click();
	Thread.sleep(15000);
	
	WebElement City=driver.findElement(By.xpath("//select[@name=\"cityname\"]"));
	Select S=new Select(City);
	driver.findElement(By.xpath("//option[@value=\"Pune\"]")).click();
	
	WebElement Center=driver.findElement(By.xpath("//select[@name=\"centername\"]"));
	Select S1=new Select(Center);
	driver.findElement(By.xpath("//option[@value=\"301\"]")).click();
	
	driver.findElement(By.xpath("//input[@id=\"class-five\"]")).click();
	
	Thread.sleep(4000);
	
	driver.findElement(By.xpath("(//button[@type=\"button\"])[5]")).click();
	
	Thread.sleep(2000);
	
	String Text=driver.findElement(By.xpath("//b[contains(text(),\"Thank you for your Interest\")]")).getText();
	System.out.println("A free counseeling Session is succsesfull--->"+Text);
	
	Thread.sleep(3000);
	
	
	
	
	
		
		
		
		
	}
	
        
		
	
	@AfterMethod
	public void Teardown() throws InterruptedException {
		Thread.sleep(5000);
		
		driver.quit();
	}
	
	
	
}