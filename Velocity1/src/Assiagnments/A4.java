package Assiagnments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A4 {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webDriver.chrome.driver", "D:\\\\velocity automation\\\\chromedriver_win32.exe");
        
        WebDriver driver= new ChromeDriver();
        
        
        driver.get("https://demoqa.com/frames");
        
        driver.manage().window().maximize();
        
        driver.switchTo().frame("frame1");
        Thread.sleep(2000);
        
       
        
        String Text=driver.findElement(By.xpath("//h1[contains(text(),'')]")).getText();
        
        System.out.println(Text);
        
        driver.close();
        
        
	}

}
