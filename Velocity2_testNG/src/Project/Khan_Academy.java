package Project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Khan_Academy {
	WebDriver driver;
	@BeforeMethod
     public void Get() {
	System.setProperty("webDriver.chrome.driver", "D:\\\\velocity automation\\\\chromedriver_win32.exe");
    
     driver= new ChromeDriver();

    driver.get("https://www.khanacademy.org/");
    
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
}
	@Test
	public void Login() throws InterruptedException  {
		
		driver.findElement(By.className("_2yu61fz")).click();
		driver.findElement(By.className("_1yok8f4")).click();
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("nndpatil9@gmail.com");
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("Ninad@123");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		
		boolean LOGO=driver.findElement(By.xpath("//a[@class=\"_1ab8w4s7\"]")).isDisplayed();
		System.out.println("Khan Academy Logo is Visible-->"+LOGO);
		
		driver.findElement(By.xpath("//span[contains(text(),\"Pick a username\")]")).click();
		
		Thread.sleep(3000);
		
		//driver.findElement(By.id("nickname")).clear();
	//	driver.findElement(By.id("nickname")).sendKeys("Ninad10");
		
		driver.findElement(By.xpath("//input[@class=\"username\"]")).sendKeys("Ninad123");
		driver.findElement(By.xpath("//textarea[@class=\" span12\"]")).sendKeys("Im a Student");
		
		driver.findElement(By.xpath("//button[@class=\"_dxjxyv7\"]")).click();
		
		
	}

}
