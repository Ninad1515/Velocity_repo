package TestNG_Features;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class priority2 {
	
	WebDriver driver;
	@BeforeMethod
	public void Setup() {
	System.setProperty("webDriver.chrome.driver", "D:\\\\velocity automation\\\\chromedriver_win32.exe");
    
    driver= new ChromeDriver();

    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
    
	}
	@Test(priority = 2)
	public void C() {
		String Title=driver.getTitle();
		System.out.println(Title);
		System.out.println("C");
	}
	@Test(priority = 1)
	public void B() {
		boolean Logo1=driver.findElement(By.xpath("//img[@alt=\"company-branding\"]")).isDisplayed();
		System.out.println(Logo1);
		System.out.println("Compony logo B");
		}
	@Test(priority = 3)
	public void A() {
		boolean Logo2=driver.findElement(By.xpath("//img[@alt=\"company-branding\"]")).isDisplayed();
		System.out.println(Logo2);
		System.out.println("Compony logo A");
	    }
	
	@Test(priority = -1)
	public void D() {
		boolean Logo3=driver.findElement(By.xpath("//img[@alt=\"company-branding\"]")).isDisplayed();
		System.out.println(Logo3);
		System.out.println("Compony logo D");
	    }
	
	@AfterMethod
	public void Teardown() throws InterruptedException {
		Thread.sleep(4000);
		driver.quit();
	}

	
	

}
