package FindElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findelement1 {

	public static void main(String[] args) {
System.setProperty("webDriver.chrome.driver", "D:\\\\velocity automation\\\\chromedriver_win32.exe");
        
        WebDriver driver= new ChromeDriver();
        
        
        driver.get("https://www.amazon.in/");
        
        driver.manage().window().maximize();
        
        WebElement SearchBox =driver.findElement(By.id("twotabsearchtextbox"));
        
        SearchBox.sendKeys("Apple");
        
        System.out.println(SearchBox.getText());
        
        WebElement Links =driver.findElement(By.xpath("//a[@class=\"nav-a  \"]"));
        System.out.println(Links.getText());
        
        //no such element found bcz of wrong Xpath
        WebElement Links1 =driver.findElement(By.xpath("//a[@class=\"navv-a  \"]"));
        System.out.println(Links1.getText());
        
        
        
        
        
		
		  
	}

}
