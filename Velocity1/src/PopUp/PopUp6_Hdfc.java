package PopUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PopUp6_Hdfc {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions O=new ChromeOptions();
		
		O.addArguments("--disable-notifications");

		
System.setProperty("webDriver.chrome.driver", "D:\\\\velocity automation\\\\chromedriver_win32.exe");
        
        WebDriver driver= new ChromeDriver(O);
        
        
        driver.get("https://www.hdfcbank.com/");
        
        driver.manage().window().maximize();
        
        Thread.sleep(2000);
        
        driver.close();
        
        
	}

}
