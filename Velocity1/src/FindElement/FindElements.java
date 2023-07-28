package FindElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	private static final List<WebElement> WebElement = null;

	public static void main(String[] args) {
System.setProperty("webDriver.chrome.driver", "D:\\\\velocity automation\\\\chromedriver_win32.exe");
        
        WebDriver driver= new ChromeDriver();
        
        
        driver.get("https://www.amazon.in/");
        
        driver.manage().window().maximize();
        
        List<WebElement> Search=driver.findElements(By.id("twotabsearchtextbox"));
        
      //  driver.findElements(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
        
        List<WebElement> Link=driver.findElements(By.xpath("//a[@class=\"nav-a  \"]"));
        
        System.out.println(Link.size());
        
        
        for(WebElement E:Link) {
          System.out.println(E.getText());
          
          
        }
        
        List<WebElement> Link1=driver.findElements(By.xpath("//a[@class=\"nav-a  \"]"));
        System.out.println(Link1.size());
        
       
        
        driver.quit();
	}
	
}
  
