package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webDriver.chrome.driver", "D:\\\\velocity automation\\\\chromedriver_win32.exe");
        
        WebDriver driver= new ChromeDriver();
        
        
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        
        driver.manage().window().maximize();
        
        WebElement B1=driver.findElement(By.id("box2"));
        
        WebElement B2=driver.findElement(By.id("box102"));
        
        Actions A=new Actions(driver);
        
        A.dragAndDrop(B1, B2).build().perform();
        
        Thread.sleep(3000);
        
        driver.close();
	}

}
