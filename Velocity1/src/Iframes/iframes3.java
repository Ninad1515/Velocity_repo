package Iframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframes3 {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webDriver.chrome.driver", "D:\\\\velocity automation\\\\chromedriver_win32.exe");
        
        WebDriver driver= new ChromeDriver();
        
        
        driver.get("https://demo.automationtesting.in/Frames.html");
        
        driver.manage().window().maximize();
        
        driver.findElement(By.xpath("//a[contains(text(),'Iframe with in an Iframe')]")).click();
        
       
        WebElement outer=driver.findElement(By.xpath("//div[@id=\"Multiple\"]//iframe"));
        
        driver.switchTo().frame(outer);
        
        String Text=driver.findElement(By.xpath("//h5[contains(text(),'Nested iFrames')]")).getText();
        System.out.println(Text);
        
        
       
       WebElement inner=driver.findElement(By.xpath("//html/body/section/div/div/iframe"));
       
       driver.switchTo().frame(inner);
       
       driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Welcome");
       
       Thread.sleep(2000);
       
      
       driver.switchTo().defaultContent();
       
       driver.findElement(By.xpath("//a[@href=\"Index.html\"]")).click();
       
       Thread.sleep(2000);
       
      
       System.out.println("Program Executed");
       
       driver.quit();
       
       
       
        
	}

}
