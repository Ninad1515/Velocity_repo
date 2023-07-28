package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webDriver.chrome.driver", "D:\\\\velocity automation\\\\chromedriver_win32.exe");
        
        WebDriver driver= new ChromeDriver();
        
        
        driver.get("https://www.amazon.in/");
        
        driver.manage().window().maximize();
        
          WebElement Account=driver.findElement(By.xpath("//span[@class=\"nav-line-2 \"]"));
          
          Actions A=new Actions(driver);
          
          A.moveToElement(Account).build().perform();
          
          driver.findElement(By.xpath("//span[@class=\"nav-action-inner\"]")).click();
          
          driver.findElement(By.xpath("//input[@id=\"ap_email\"]")).sendKeys("Ninad@gmail.com");
          
          driver.findElement(By.xpath("//input[@id=\"continue\"]")).click();
          
          driver.findElement(By.xpath("//input[@id=\"ap_password\"]")).sendKeys("12345");
          
          driver.findElement(By.xpath("//input[@id=\"signInSubmit\"]")).click();
          
          Thread.sleep(3000);
          
          boolean text=driver.findElement(By.xpath("//span[contains(text(),'Your password is incorrect')]")).isDisplayed();
          Thread.sleep(3000);

          System.out.println(text);
          
          driver.close();
	}

}
