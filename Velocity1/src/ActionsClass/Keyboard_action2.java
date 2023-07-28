package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_action2 {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webDriver.chrome.driver", "D:\\\\velocity automation\\\\chromedriver_win32.exe");
        
        WebDriver driver= new ChromeDriver();
        
        
        driver.get("https://the-internet.herokuapp.com/key_presses");
        
        driver.manage().window().maximize();
        
        Actions A=new Actions(driver);
        
        A.sendKeys(Keys.SPACE).build().perform();
        System.out.println(driver.findElement(By.id("result")).getText());
        
        Thread.sleep(3000);
        
        A.sendKeys(Keys.PAUSE).build().perform();
        System.out.println(driver.findElement(By.id("result")).getText());
        
        Thread.sleep(3000);
        
        A.sendKeys(Keys.SHIFT).build().perform();
        System.out.println(driver.findElement(By.id("result")).getText());
        
        driver.close();
	}

}
