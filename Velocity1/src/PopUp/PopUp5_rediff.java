package PopUp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUp5_rediff {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webDriver.chrome.driver", "D:\\\\velocity automation\\\\chromedriver_win32.exe");
        
        WebDriver driver= new ChromeDriver();
        
        
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        
        driver.manage().window().maximize();
        
        driver.findElement(By.xpath("//input[@id=\"login1\"]")).sendKeys("Ninad");
        
        driver.findElement(By.xpath("//input[@name=\"proceed\"]")).click();
        
        
        String ExpectedResult="Please enter your password";
        
        Alert Text=driver.switchTo().alert();
        
        String ActualResult=Text.getText();
         
         if(ExpectedResult.equals(ActualResult))
        	 System.out.println("Correct Alert msg");
         else
        	 System.out.println("Incorrect Alert Msg");
         
         Thread.sleep(2000);
         
         Text.accept();
         
         Thread.sleep(2000);
         
         driver.close();
        
        
        
        
	}

}
