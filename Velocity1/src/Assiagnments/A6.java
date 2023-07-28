package Assiagnments;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A6 {

	public static void main(String[] args) {
System.setProperty("webDriver.chrome.driver", "D:\\\\velocity automation\\\\chromedriver_win32.exe");
        
        WebDriver driver= new ChromeDriver();
        
        //1
        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target");
        
        driver.manage().window().maximize();
        //2
        String WindowId=driver.getWindowHandle();
        
        System.out.println("First Window Handle===>"+WindowId);
        
        //3
        driver.findElement(By.xpath("//a[@id=\"tryhome\"]")).click();
        
        Set<String> Window=driver.getWindowHandles();
        //4
        List<String> L=new ArrayList(Window);
        
        String P=L.get(0);
        String C=L.get(1);
        
        System.out.println("First Window Handle===>"+P);
        System.out.println("Second Window Handle===>"+C);
        
        //5
        System.out.println("Total Window Handle=>"+L.size());
        
        
        Iterator<String>IT=L.iterator();
        
        String ParentW=IT.next();
        String ChildW=IT.next();
          
        
        driver.switchTo().window(ChildW);
        
        System.out.println("Second Window Handle===>"+ChildW);
        
        //7
        boolean LOGO=driver.findElement(By.xpath("//i[@class=\"fa fa-logo ws-hover-text-green\"]")).isDisplayed();
        System.out.println("LOGO Displayed===>"+LOGO);
        
        //8
        driver.close();
        driver.switchTo().window(ParentW);
        //9
        System.out.println("First Window Handle===>"+ParentW);
        
        boolean RUN=driver.findElement(By.xpath("//button[@id=\"runbtn\"]")).isDisplayed();
        
        System.out.println("Button Displayed===>"+RUN);
        
        driver.quit();
        
        
        
	}

}
