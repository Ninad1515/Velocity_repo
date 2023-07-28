package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowFileUpload_Popup8 {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webDriver.chrome.driver", "D:\\\\velocity automation\\\\chromedriver_win32.exe");
        
        WebDriver driver= new ChromeDriver();
        
        
        driver.get("https://the-internet.herokuapp.com/upload");
        
        driver.manage().window().maximize();
        
        
        
        driver.findElement(By.xpath("//input[@id=\"file-upload\"]")).sendKeys("C:\\Users\\Ninad\\Desktop\\E2.xlsx");
        
        driver.findElement(By.xpath("//input[@id=\"file-submit\"]")).click();
        
        Thread.sleep(2000);
        
        String T=driver.findElement(By.xpath("//h3")).getText();
        System.out.println(T);
        
        driver.close();
        
        
	}

}
