package Data_provider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FirstProgram {
	WebDriver driver;
	@Test(dataProvider = "LoginData")
	public void Login(String Uname,String Password) {
		
		System.setProperty("webDriver.chrome.driver", "D:\\\\velocity automation\\\\chromedriver_win32.exe");
	    
	     driver= new ChromeDriver();

	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    		
        driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    
	    WebElement Username=driver.findElement(By.xpath("//input[@name=\"username\"]"));
	    Username.sendKeys(Uname);
	    WebElement Pass=driver.findElement(By.xpath("//input[@name=\"password\"]"));
	    Pass.sendKeys(Password);
	    driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	    
	    String Act_result="kailaahAlbert jadhavSR";
	    
	    boolean Exp_result=driver.findElement(By.xpath("//p[@class=\"oxd-userdropdown-name\"]")).isDisplayed();
	    
        Assert.assertTrue(Exp_result);	
        
        driver.quit();
	}
	
	@DataProvider(name="LoginData")
	public Object[][] LoginData(){
		 
		Object data[][]=new Object[5][2];
		
		data [0][0]="Admin";
		data [0][1]="admin123";
		
		data [1][0]="Admin";
		data [1][1]="admin1234";
		
		data [2][0]="Admin1";
		data [2][1]="admin123";
		
		data [3][0]="Admin1";
		data [3][1]="admin1231";
		
		data [4][0]=" ";
		data [0][1]="admin123";
		
		return data;
				
	}

}
