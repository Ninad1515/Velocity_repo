package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listbox3 {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webDriver.chrome.driver", "D:\\\\velocity automation\\\\chromedriver_win32.exe");
        
        WebDriver driver= new ChromeDriver();
        
        
        driver.get("https://www.facebook.com/");
        
        driver.manage().window().maximize();
        
        driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click();
        
        Thread.sleep(1000);
        

        driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("ninad");
        
        driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("patil");
        
        driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("7057057028");
        
        driver.findElement(By.xpath("//input[@name=\"reg_passwd__\"]")).sendKeys("sdsdad");
        
        
        WebElement Day=driver.findElement(By.xpath("//select[@id=\"day\"]"));
        WebElement Month=driver.findElement(By.xpath("//select[@id=\"month\"]"));
        WebElement Year=driver.findElement(By.xpath("//select[@id=\"year\"]"));
        
        String DOB="15/Mar/1999";
        
        String[]Date=DOB.split("/");
        
        ListBox(Day,Date[0]);
        ListBox(Month,Date[1]);
        ListBox(Year,Date[2]);
        
        Thread.sleep(3000);
        
        String DOB1="10/Jan/2022";
        
        String[]Date1=DOB1.split("/");
        
        ListBox(Day,Date1[0]);
        ListBox(Month,Date1[1]);
        ListBox(Year,Date1[2]);
        
        
        		

	}
	public static void ListBox(WebElement Element, String Text) {
		Select S1= new Select(Element);
		S1.selectByVisibleText(Text);
		
	}

}
