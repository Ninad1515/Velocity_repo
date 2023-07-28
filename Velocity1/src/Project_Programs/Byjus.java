package Project_Programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Byjus {

	public static void main(String[] args) {
System.setProperty("webDriver.chrome.driver", "D:\\\\velocity automation\\\\chromedriver_win32.exe");
        
        WebDriver driver= new ChromeDriver();
   
        driver.get("https://byjus.com/learn/byjus-classes?referrer=source%3Diframe%26mx_Campaign_Type%3Dlogin-button%26SourceMedium%3Dwebsite%26mx_Page_Category%3Dhomepage&source=iframe");
        
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        
       // driver.findElement(By.xpath("//input[@placeholder=\"Enter your mobile number\"]")).sendKeys("7057057028");
      //  driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
        
        
	}

}
