package Com.Ecomerce.BaseClass;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import Com.Ecomerce.Utilities.Read_configuration;

public class Ecoomerce_baseclass {
	
	public static WebDriver driver;
	public static Logger logger;
	
	
	Read_configuration readconfig= new Read_configuration();
	public String BaseURL=readconfig.GetappURL();
	public String Username=readconfig.Username();
	public String Password=readconfig.Pass();
	
	
	@BeforeMethod
	@Parameters("Browser")
	public void Setup(String BrowserName) {
 	    
		 logger=logger.getLogger("Velocity3__Framework");
		PropertyConfigurator.configure("log4j.properties");
		
		if(BrowserName.equals("Chrome")) {
	    System.setProperty("webDriver.chrome.driver", readconfig.GetChromepath());
 	    driver= new ChromeDriver();
		}
		if(BrowserName.equals("FireFox")) {
		    System.setProperty("webDriver.gecko.driver",readconfig.GetFirefoxpath());
	 	    driver= new FirefoxDriver();
		}    
			
		
 	    
 	    
 	    
 	    logger.info("1)Open the browser");

 	    driver.manage().window().maximize();
 	    logger.info("2)Maximize the browser");

 	    driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
 	    driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
 	    
 	    driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
 	    logger.info("3)Open the Application");

 	    
 	    
	}
	@AfterMethod
	public void Teardown() throws InterruptedException {
		Thread.sleep(10000);
		driver.quit();
 	    logger.info("close the browser");

	}

}
