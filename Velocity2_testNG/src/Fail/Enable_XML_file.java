package Fail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Enable_XML_file {
	
	WebDriver driver;
	@BeforeClass
	public void setup() {
		System.setProperty("webDriver.chrome.driver", "D:\\\\velocity automation\\\\chromedriver_win32.exe");
	    
	    driver= new ChromeDriver();

	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	    
	}
	@Test
	public void Login() {
		driver.findElement(By.xpath("//input[@name=\"username1\"]")).sendKeys("Ninad");
	}
	@Test
	public void B() {
		boolean Logo=driver.findElement(By.xpath("//img[@alt=\"company-branding\"]")).isDisplayed();
		System.out.println(Logo);
		System.out.println("B");
	}
	@Test
	public void A() {
		boolean Logo1=driver.findElement(By.xpath("//img[@alt=\"company-branding\"]")).isDisplayed();
		System.out.println(Logo1);
		System.out.println("A");
	}
	@Test
	public void Test1() {
		System.out.println("Test1");
	}
	@Test
	public void Test2() {
		System.out.println("Test2");
	}
	@Test
	public void Test3() {
		System.out.println("Test3");
		Assert.assertEquals(false, true);
	}
	@AfterClass
	public void Teardown() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
	}
	
		
		
	}


