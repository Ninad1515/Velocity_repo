package Assiagnments;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class A2_2 {

	public static void main(String[] args) throws IOException {
System.setProperty("webDriver.chrome.driver", "D:\\\\velocity automation\\\\chromedriver_win32.exe");
        
        WebDriver driver= new ChromeDriver();
        
        
        driver.get("https://kite.zerodha.com/");
        
        driver.manage().window().maximize();
        
        WebElement Logo =driver.findElement(By.xpath("//div[@id=\"container\"]"));
        
        File Source=((TakesScreenshot)Logo).getScreenshotAs(OutputType.FILE);
        
        String Random=RandomString.make(5);
        String IN="Kite";
        
        
        File Dest=new File("C:\\Users\\Ninad\\eclipse-workspace\\Velocity1\\SS_automation\\"+IN+" "+Random+".jpg");
        
        FileHandler.copy(Source, Dest);
        
        driver.close();
        
	}

}
