package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class byIndex {

	public static void main(String[] args) {
System.setProperty("webDriver.chrome.driver", "D:\\\\velocity automation\\\\chromedriver_win32.exe");
        
        WebDriver driver= new ChromeDriver();
        
        
        driver.get("https://www.amazon.in");
        
        driver.manage().window().maximize();
         
       driver.findElement(By.xpath("//a[@class=\"nav-a  \"][4]")).click();
         

	}

}
