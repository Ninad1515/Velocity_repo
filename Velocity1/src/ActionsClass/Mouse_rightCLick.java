package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_rightCLick {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webDriver.chrome.driver", "D:\\\\velocity automation\\\\chromedriver_win32.exe");
        
        WebDriver driver= new ChromeDriver();
        
        
        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
        
        driver.manage().window().maximize();
        
        WebElement button=driver.findElement(By.xpath("//span[@class=\"context-menu-one btn btn-neutral\"]"));
        
        Actions A=new Actions(driver);
        
        A.contextClick(button).build().perform();
        
        driver.findElement(By.xpath("(//span[contains(text(),'Cut')])[2]")).click();
        
        System.out.println(driver.switchTo().alert().getText());
        
        driver.switchTo().alert().accept();
        
        Thread.sleep(3000);
        
        A.contextClick(button).build().perform();
        
        driver.findElement(By.xpath("(//span[contains(text(),'Delete')])[2]")).click();
        
        System.out.println(driver.switchTo().alert().getText());
        
        driver.switchTo().alert().accept();
        
        Thread.sleep(3000);
        
        driver.close();
        
        
	}

}
