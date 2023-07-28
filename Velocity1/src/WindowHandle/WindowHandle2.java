package WindowHandle;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle2 {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webDriver.chrome.driver", "D:\\\\velocity automation\\\\chromedriver_win32.exe");
        
        WebDriver driver= new ChromeDriver();
        
        
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        
        driver.manage().window().maximize();
        
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM')]")).click();
        
        Thread.sleep(20000);
        
        Set<String> Window=driver.getWindowHandles();
        
        
        Iterator<String>IT=Window.iterator();
        
        String ParentW=IT.next();
        String ChildW=IT.next();
        
        System.out.println(ParentW);
        System.out.println(ChildW);
        
        //2nd method
        
        List<String> L=new ArrayList(Window);
        
        String P=L.get(0);
        String C=L.get(1);
        
        System.out.println(P);
        System.out.println(C);
        
       //Switch focus child from Parent
        
        driver.switchTo().window(ParentW);
        System.out.println(driver.getTitle());
        
        driver.switchTo().window(ChildW);
        System.out.println(driver.getTitle());
       
        
        driver.close();
	}

}
