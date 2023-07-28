package WindowHandle;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle3 {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webDriver.chrome.driver", "D:\\\\velocity automation\\\\chromedriver_win32.exe");
        
        WebDriver driver= new ChromeDriver();
        
        
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        
        driver.manage().window().maximize();
        
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM')]")).click();
        
        Thread.sleep(20000);
        
        Set<String> Window=driver.getWindowHandles();
        
        Thread.sleep(2000);
        
        Iterator<String>IT=Window.iterator();
        
        String ParentWindow=IT.next();
        String ChildWindow=IT.next();
        
        System.out.println(ParentWindow);
        System.out.println(ChildWindow);
        
        driver.switchTo().window(ParentWindow);
        System.out.println(driver.getTitle());
        
        driver.switchTo().window(ChildWindow);
        System.out.println(driver.getTitle());
        
        
        
        driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("Ninad@patil.com");
        driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
        
        Thread.sleep(2000);
        
        driver.switchTo().window(ParentWindow);
        
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Ninad");
        driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("1234");
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
        
        Thread.sleep(2000);
        driver.quit();
        
	}

}
