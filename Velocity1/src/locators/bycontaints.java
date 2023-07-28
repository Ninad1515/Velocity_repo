package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class bycontaints {

	public static void main(String[] args) {
System.setProperty("webDriver.chrome.driver", "D:\\\\velocity automation\\\\chromedriver_win32.exe");
        
        WebDriver driver= new ChromeDriver();
        
        
      //  driver.get("https://in.bookmyshow.com/");
        driver.get("https://www.redbus.in/");
        
        driver.manage().window().maximize();
        
        //driver.findElement(By.xpath("//span[contains(text(), 'Mu')]")).click();
        
        driver.findElement(By.xpath("//span[contains(text(),'Bu')]")).click();

        driver.findElement(By.xpath("//input[@id='smsTXTBOX']")).sendKeys("7057057028");

	}

}
