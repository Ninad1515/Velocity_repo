package Com.Ecomerce.Utilities;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Com.Ecomerce.BaseClass.Ecoomerce_baseclass;

public class Generic_Utils_SS extends Ecoomerce_baseclass{
	
	public static String GetScreenshot(String TestCasename,WebDriver driver) throws IOException {
	
		TakesScreenshot ts= (TakesScreenshot) driver;
	File source=ts.getScreenshotAs(OutputType.FILE);
	
	String Timestamp=new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
	String Name="- Screenshot -"+Timestamp;
	
	Path resourceDirectory=Paths.get("src", "test","resources");
	
	String absolutePath=resourceDirectory.toFile().getAbsolutePath();
	String destination=absolutePath+"/Screenshot/"+TestCasename+" "+Name +".png";
	
	FileUtils.copyFile(source, new File(destination));
	
	return destination;
	
	
	}
	public static void ClickElement(WebElement element,WebDriver driver) {
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click", element);
		
		
	}
	public static WebElement Waitforelement(WebDriver driver, By locator,int timeout) {
		WebDriverWait Mywait=new WebDriverWait(driver, Duration.ofSeconds(timeout));
		Mywait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
		return driver.findElement(locator);
	}

}
