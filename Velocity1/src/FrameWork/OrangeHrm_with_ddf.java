package FrameWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrm_with_ddf {

	public static void main(String[] args) throws IOException {
System.setProperty("webDriver.chrome.driver", "D:\\\\velocity automation\\\\chromedriver_win32.exe");
        
        WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        
        driver.manage().window().maximize();
        String path="C:\\Users\\Ninad\\eclipse-workspace\\Velocity1\\Test\\Orange.xlsx";
        
        FileInputStream File=new FileInputStream(path);
        
        String Username=WorkbookFactory.create(File).getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
        driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys(Username);
        
        
        FileInputStream File1=new FileInputStream(path);
        
        String pass=WorkbookFactory.create(File1).getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
        driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys(pass);
        
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
        
        FileInputStream File2=new FileInputStream(path);
        
        String Text=WorkbookFactory.create(File2).getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
        String UserName1=driver.findElement(By.xpath("//p")).getText();
        
        
        System.out.println(UserName1);
        
        if(UserName1.equals(Text)) {
        	System.out.println("Correct username");
        }else {
        	System.out.println("incorrect username");
        }
        
        
        
       
       }
        
        
        
	}


