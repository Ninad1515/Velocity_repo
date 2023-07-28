package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class SS6 {
	
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
System.setProperty("webDriver.chrome.driver", "D:\\\\velocity automation\\\\chromedriver_win32.exe");
        
         driver= new ChromeDriver();
        
        
        driver.get("https://www.orangehrm.com/");
        
        driver.manage().window().maximize();
        
        String File="OH";
        
        SS6.Takesc(File);
        SS6.Takesc("T"+File);
        
        
	}
	public static void Takesc(String Filename) throws IOException {
		
		File Source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String Random=RandomString.make(5);
		
        File Dest=new File("C:\\Users\\Ninad\\eclipse-workspace\\Velocity1\\SS_automation\\"+Filename+" "+Random+".jpg");
        
        FileHandler.copy(Source, Dest);
	}

}
