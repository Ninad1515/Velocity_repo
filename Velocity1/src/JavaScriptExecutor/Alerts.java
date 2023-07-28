package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webDriver.chrome.driver", "D:\\\\velocity automation\\\\chromedriver_win32.exe");
        
        WebDriver driver= new ChromeDriver();
        
        
        driver.get("https://www.amazon.in/");
        
        driver.manage().window().maximize();
        
       WebElement AC=driver.findElement(By.xpath("//span[contains(text(),'Account ')]"));
       
       Actions A=new Actions(driver);
       
       A.moveToElement(AC).build().perform();
       
       driver.findElement(By.xpath("//span[contains(text(),'Sign in')]")).click();
       driver.findElement(By.id("ap_email")).sendKeys("ninad@gmail.com");
       driver.findElement(By.id("continue")).click();
       driver.findElement(By.id("ap_password")).sendKeys("234455");
       driver.findElement(By.id("signInSubmit")).click();
       
       Thread.sleep(3000);
       
       boolean Text=driver.findElement(By.xpath("//span[contains(text(),'Your password is incorrect')]")).isDisplayed();
       System.out.println(Text);
       
       
       Alerts.POPUP(driver, "Plz add correct Password");
       
       }
	public static void POPUP(WebDriver driver,String Message) {
		JavascriptExecutor JS= (JavascriptExecutor) driver;
		JS.executeScript("window.scrollBy(0,5000)", "");
		JS.executeScript("alert('"+Message+"')");
	}

}
