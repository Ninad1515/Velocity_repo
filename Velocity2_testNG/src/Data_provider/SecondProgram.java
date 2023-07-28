package Data_provider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SecondProgram {
	
	
	WebDriver driver;
	@Test(dataProvider = "LoginData")
	public void Login(String Uname,String Password,String Expected) throws InterruptedException {
		
		System.setProperty("webDriver.chrome.driver", "D:\\\\velocity automation\\\\chromedriver_win32.exe");
	    
	     driver= new ChromeDriver();
	    		
        driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    
	    driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
	    
	    WebElement Username=driver.findElement(By.xpath("//input[@type=\"email\"]"));
	    Username.clear();
	    Thread.sleep(3000);
	    Username.sendKeys(Uname);
	    
	    WebElement Pass=driver.findElement(By.xpath("//input[@type=\"password\"]"));
	    Pass.clear();
	    Thread.sleep(3000);
	    Pass.sendKeys(Password);
	    
	    driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	
	    String Act=driver.getTitle();
	    
	    String Exp="Dashboard / nopCommerce administration";
	    
	    if(Expected.equals("Valid")) {
	    	if(Exp.equals(Act)) {
	    		driver.findElement(By.xpath("(//a[@class=\"nav-link\"])[2]")).click();
	    		Assert.assertTrue(true);
	    	}else {
	    		Assert.assertTrue(false);
	    		
	    	}
	    	
	    }
	    else if (Expected.equals("Invalid")) {
	    	if(Exp.equals(Act)) {
	    		driver.findElement(By.xpath("(//a[@class=\"nav-link\"])[2]")).click();
	    		Assert.assertTrue(false);
	    	}else {
	    		Assert.assertTrue(true);
	    	}
	    }
	    
	    driver.quit();
	    
	    }
	@DataProvider(name="LoginData")
	public String[][] LoginData(){
		
		String Logindata[][]= {{"admin@yourstore.com","admin","Valid"},
				{"admin@yourstore.com","admin1","Invalid"},
				{"admin1@yourstore.com","admin","Invalid"},
				{"admin1@yourstore.com","admin12","Invalid"},};
		return Logindata;
		}
	@AfterMethod
	public void TearDown() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
				
		
	}
	
	


