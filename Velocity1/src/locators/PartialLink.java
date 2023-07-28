package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLink {

	public static void main(String[] args) {
System.setProperty("webDriver.chrome.driver", "D:\\\\velocity automation\\\\chromedriver_win32.exe");
        
        WebDriver driver= new ChromeDriver();
        
        
        driver.get("https://www.facebook.com/");
        
        driver.manage().window().maximize();
        
        driver.findElement(By.partialLinkText("pass")).click();
        
      //  driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _517i _517h _51sy\"]")).click();
        
      //  driver.findElement(By.xpath("//a[@class=\"suggestedLocaleInGrid\"]")).click();

	}

}
