package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class double_click {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webDriver.chrome.driver", "D:\\\\velocity automation\\\\chromedriver_win32.exe");
        
        WebDriver driver= new ChromeDriver();
        
        
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
        
        driver.manage().window().maximize();
        
        WebElement Click=driver.findElement(By.xpath("//button"));
        
        Actions A=new Actions(driver);
        
        A.doubleClick(Click).build().perform();
        
        Thread.sleep(3000);
        
        driver.switchTo().alert().accept();
        
        driver.close();
        
	}

}
