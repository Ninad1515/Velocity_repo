package MultipleLinks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleLink {

	public static void main(String[] args) {
		System.setProperty("webDriver.chrome.driver", "D:\\\\velocity automation\\\\chromedriver_win32.exe");
        
        WebDriver driver= new ChromeDriver();
        
        driver.manage().window().maximize();
        
        driver.get("https://www.amazon.in/");
        
        List<WebElement> Link=driver.findElements(By.tagName("a"));
        System.out.println("Number of links--->"+Link.size());
        
        for(WebElement link:Link) {
        	System.out.println(link.getText());
        	System.out.println(link.getAttribute("href"));
        }
        
        
        
        
	}

}
