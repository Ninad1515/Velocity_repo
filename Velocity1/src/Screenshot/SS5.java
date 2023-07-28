package Screenshot;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.utility.RandomString;

public class SS5 {
	
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
System.setProperty("webDriver.chrome.driver", "D:\\\\velocity automation\\\\chromedriver_win32.exe");
        
         driver= new ChromeDriver();
        
        
        driver.get("https://www.facebook.com/");
        
        driver.manage().window().maximize();
        
        String File="FB";
        
        SS5.Takess(File);
        SS5.Takess("Test"+File);
        SS5.Takess("Test1"+File);
        
        driver.close();
        
	}
	public static void Takess(String Filename) throws IOException {
        File Source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        
        String Random=RandomString.make(5);
        
        File Dest=new File("C:\\Users\\Ninad\\eclipse-workspace\\Velocity1\\SS_automation\\"+Filename+" "+Random+".jpg");
        
        org.openqa.selenium.io.FileHandler.copy(Source, Dest);
        
       
        

	}

}
