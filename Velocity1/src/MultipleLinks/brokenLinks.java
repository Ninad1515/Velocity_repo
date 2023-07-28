package MultipleLinks;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class brokenLinks {

	public static void main(String[] args) throws IOException {
System.setProperty("webDriver.chrome.driver", "D:\\\\velocity automation\\\\chromedriver_win32.exe");
        
        WebDriver driver= new ChromeDriver();
        
        driver.manage().window().maximize();
        
        driver.get("https://www.facebook.com/");
        
        List<WebElement> Links=driver.findElements(By.tagName("a"));
        System.out.println(Links.size());
        
        int BrokenLinks=0;
        
        for(WebElement element:Links) {
                String url=element.getAttribute("href");
                
                if(url==null || url.isEmpty()) {
                	System.out.println("URL is empty or null");
                	
                }
                
                URL link=new URL(url);
                
                HttpsURLConnection http=(HttpsURLConnection)link.openConnection();
                http.connect();
                
                if(http.getResponseCode()>=400) {
                	System.out.println(http.getResponseCode()+"--->"+url+"is--->broken link");
                	BrokenLinks++;
                	
                	
                }
                else {
                	System.out.println(http.getResponseCode()+"--->"+url+"is--->valid link");
                }
                
                
        		
        
	}
        System.out.println("number of broken links: "+BrokenLinks);
        
        driver.quit();

}
}
