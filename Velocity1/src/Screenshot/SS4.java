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

public class SS4 {

	public static void main(String[] args) throws IOException {
System.setProperty("webDriver.chrome.driver", "D:\\\\velocity automation\\\\chromedriver_win32.exe");
        
        WebDriver driver= new ChromeDriver();
        
        
        driver.get("https://www.facebook.com/");
        
        driver.manage().window().maximize();
        
        WebElement FbLogo =driver.findElement(By.xpath("//img[@class=\"fb_logo _8ilh img\"]"));
        
        File Source=((TakesScreenshot)FbLogo).getScreenshotAs(OutputType.FILE);
        
        String Random=RandomString.make(4);
        String Img="FBLOGO";
        
        File Dest=new File("C:\\Users\\Ninad\\Desktop\\Screenshots\\"+Img+" "+Random+".jpg");
        
        org.openqa.selenium.io.FileHandler.copy(Source, Dest);
        
        driver.close();
	}

}
