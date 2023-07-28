package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUp2 {

	public static void main(String[] args) throws InterruptedException {
          
System.setProperty("webDriver.chrome.driver", "D:\\\\velocity automation\\\\chromedriver_win32.exe");
        
        WebDriver driver= new ChromeDriver();
        
        
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        
        driver.manage().window().maximize();
        
        driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]")).click();
         
        Thread.sleep(2000);
        
        driver.switchTo().alert().accept();
        
        
        
        boolean Text=driver.findElement(By.xpath("//p[@id=\"result\"]")).isDisplayed();
        
        System.out.println(Text);
        
        driver.close();
	}

}
