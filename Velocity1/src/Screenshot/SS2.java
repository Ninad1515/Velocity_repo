package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class SS2 {

	public static void main(String[] args) throws IOException {
System.setProperty("webDriver.chrome.driver", "D:\\\\velocity automation\\\\chromedriver_win32.exe");
        
        WebDriver driver= new ChromeDriver();
        
        
        driver.get("https://www.redbus.in/");
        
        driver.manage().window().maximize();
        
        File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        
        String Random= RandomString.make(5);
        
        String ImgName="Redbus";
        
        File DEST=new File("C:\\Users\\Ninad\\Desktop\\Screenshots\\"+ImgName+" "+Random+".jpg");
        
        FileHandler.copy(source, DEST);
        
        driver.close();
	}

}
