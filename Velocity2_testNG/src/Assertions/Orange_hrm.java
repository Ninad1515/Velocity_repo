package Assertions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Orange_hrm {
	
	WebDriver driver;
	@BeforeMethod
	public void Setup() {
	System.setProperty("webDriver.chrome.driver", "D:\\\\velocity automation\\\\chromedriver_win32.exe");
    
    driver= new ChromeDriver();

    driver.get("https://www.facebook.com/");
    
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	}
	@Test
	public void OrangeHRM() {
//		WebElement Username=driver.findElement(By.name("username"));
//		WebElement Pass=driver.findElement(By.name("password"));
//		
//		Assert.assertFalse(Username.isDisplayed());
//		Username.sendKeys("Admin");
//		
//		Assert.assertFalse(Pass.isDisplayed());
//		Pass.sendKeys("admin123");
//		
//		
		boolean logo=driver.findElement(By.xpath("//img")).isDisplayed();
		Assert.assertEquals(logo, true);
		
		System.out.println("Execution Complete");
		
		
		

	}
    @AfterMethod
	public void Teardown() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
}
