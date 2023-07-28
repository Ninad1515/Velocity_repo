package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_action1 {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webDriver.chrome.driver", "D:\\\\velocity automation\\\\chromedriver_win32.exe");
        
        WebDriver driver= new ChromeDriver();
        
        
        driver.get("https://www.facebook.com/");
        
        driver.manage().window().maximize();
        
        WebElement email=driver.findElement(By.id("email"));
        WebElement pass=driver.findElement(By.id("pass"));
        
        email.sendKeys("Ninad@234");
        
        Actions A=new Actions(driver);
        
        A.keyDown(Keys.CONTROL);
        A.sendKeys("a");
        A.keyUp(Keys.CONTROL);
        A.build().perform();
        
        A.keyDown(Keys.CONTROL);
        A.sendKeys("c");
        A.keyUp(Keys.CONTROL);
        A.build().perform();
        
        A.sendKeys(Keys.TAB);
        A.build().perform();
        
        A.keyDown(Keys.CONTROL);
        A.sendKeys("v");
        A.keyUp(Keys.CONTROL);
        A.build().perform();
        
        if(email.getAttribute("value").equals(pass.getAttribute("value"))) {
        	System.out.println("Correct copied");
        	
        	
        }
        else {
        	System.out.println("incorrect copied");
        	
            Thread.sleep(3000);

        }
        
        driver.close();
        
        
        
        
        

        
		
		
	}

}
