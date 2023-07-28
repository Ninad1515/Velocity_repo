package Assiagnments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webDriver.chrome.driver", "D:\\\\velocity automation\\\\chromedriver_win32.exe");
        
        WebDriver driver= new ChromeDriver();
        
        
        driver.get("file:///C:/Users/Ninad/Desktop/!DOCTYPE%20html.html");
        
        driver.manage().window().maximize();
        
        WebElement Username=driver.findElement(By.xpath("//input[@name=\"username\"]"));
        WebElement Pass=driver.findElement(By.xpath("//input[@name=\"password\"]"));
        WebElement button=driver.findElement(By.xpath("//button[@type=\"submit\"]"));

         
        Username.sendKeys("Ninad");
        Pass.sendKeys("12334");
        
        Thread.sleep(4000);
        button.click();
        
        String T=driver.findElement(By.xpath("//h1")).getText();
        System.out.println(T);
        
	}

}
