package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authentication_pop7 {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webDriver.chrome.driver", "D:\\\\velocity automation\\\\chromedriver_win32.exe");
        
        WebDriver driver= new ChromeDriver();
        
        
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
        
        driver.manage().window().maximize();
        
        String Text=driver.findElement(By.xpath("//p")).getText();
        System.out.println(Text);
        
        Thread.sleep(2000);
        
        driver.close();
        
        
	}

}
