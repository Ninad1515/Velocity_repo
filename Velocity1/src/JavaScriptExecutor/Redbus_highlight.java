package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus_highlight {

	public static void main(String[] args) {
System.setProperty("webDriver.chrome.driver", "D:\\\\velocity automation\\\\chromedriver_win32.exe");
        
        WebDriver driver= new ChromeDriver();
        
        
        driver.get("https://www.redbus.in/");
        
        driver.manage().window().maximize();
        
        WebElement Img=driver.findElement(By.xpath("//img[@alt=\"redBus\"]"));
        WebElement Img2=driver.findElement(By.id("cab_rental_vertical"));
        WebElement Img3=driver.findElement(By.id("onwardCal"));
        
        JavascriptExecutor JS=(JavascriptExecutor) driver;
        
        JS.executeScript("arguments[0].style.border='10px solid black'", Img);
        JS.executeScript("arguments[0].style.border='10px solid black'", Img2);
        JS.executeScript("arguments[0].style.border='10px solid black'", Img3);
        
        JS.executeScript("arguments[0].style.background='green'", Img);
        JS.executeScript("arguments[0].style.background='green'", Img2);
        JS.executeScript("arguments[0].style.background='pink'", Img3);





	}

}
