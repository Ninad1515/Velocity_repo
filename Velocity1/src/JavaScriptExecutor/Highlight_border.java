package JavaScriptExecutor;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Highlight_border {

	public static void main(String[] args) throws IOException {
System.setProperty("webDriver.chrome.driver", "D:\\\\velocity automation\\\\chromedriver_win32.exe");
        
        WebDriver driver= new ChromeDriver();
        
        
        driver.get("https://www.facebook.com/");
        
        driver.manage().window().maximize();
        
        WebElement Img=driver.findElement(By.xpath("//img"));
        WebElement Img1=driver.findElement(By.id("email"));
        
        
        
        JavascriptExecutor JS=(JavascriptExecutor) driver;
        
        JS.executeScript("arguments[0].style.border='15px solid black'", Img);
        JS.executeScript("arguments[0].style.border='15px solid Red'", Img1);
        
        JS.executeScript("arguments[0].style.background='pink'", Img);
        JS.executeScript("arguments[0].style.background='yellow'", Img1);


        
        File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        
        File DEST=new File("C:\\Users\\Ninad\\Desktop\\Screenshots\\FB_Highlight.jpg");
        
        FileHandler.copy(source, DEST);
        

        
	}

}
