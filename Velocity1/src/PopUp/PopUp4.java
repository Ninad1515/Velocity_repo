package PopUp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUp4 {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webDriver.chrome.driver", "D:\\\\velocity automation\\\\chromedriver_win32.exe");
        
        WebDriver driver= new ChromeDriver();
        
        
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        
        driver.manage().window().maximize();
        
        driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]")).click();
        Thread.sleep(2000);
        
        Alert Text =driver.switchTo().alert();
        Thread.sleep(2000);
        
        System.out.println(Text.getText());
        Text.sendKeys("Automation");
        
        Thread.sleep(2000);
        
        Text.accept();
        
        Thread.sleep(2000);
        
        driver.close();
        
	}

}
