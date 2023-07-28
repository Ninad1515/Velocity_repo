package Iframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframes4 {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webDriver.chrome.driver", "D:\\\\velocity automation\\\\chromedriver_win32.exe");
        
        WebDriver driver= new ChromeDriver();
        
        
        driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
        
        driver.manage().window().maximize();
        
        driver.switchTo().frame("iframeResult");
        Thread.sleep(2000);
        
        
        driver.switchTo().frame(0);
        
        String Text=driver.findElement(By.xpath("//h1[contains(text(),'')]")).getText();
        System.out.println(Text);
        
        System.out.println();
        
        driver.switchTo().parentFrame();
        
        String Text1=driver.findElement(By.xpath("//p[contains(text(),'You can use the height and width attributes to specify the size of the iframe:')]")).getText();
        System.out.println(Text1);
        
        System.out.println();

        
        driver.switchTo().defaultContent();
        
        driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
        
        Thread.sleep(3000);
        
        System.out.println("Program Completed");
        driver.quit();
        
        
		
		
	}
         
}
