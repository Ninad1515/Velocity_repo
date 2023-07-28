package Com.Ecomerce.TestCases;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Com.Ecomerce.BaseClass.Ecoomerce_baseclass;

public class TC_BrokenLinks_Test_case extends Ecoomerce_baseclass {
	
	  
	@Test
	  public void Broken_links() throws IOException, InterruptedException {
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
              
              if(http.getResponseCode()>=300) {
              	System.out.println(http.getResponseCode()+"--->"+url+"is--->broken link");
              	BrokenLinks++;
              	
              	
              }
              else {
              	System.out.println(http.getResponseCode()+"--->"+url+"is--->valid link");
              	
              	
              }
              
              
              
              
              
              
      		
      
	}
      System.out.println("number of broken links: "+BrokenLinks);
      
      
}

}
