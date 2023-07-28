package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadData_FB {

	public static void main(String[] args) throws IOException, InterruptedException {
           
		
		FileInputStream File=new FileInputStream("C:\\\\Users\\\\Ninad\\\\Desktop\\\\Firstname.xlsx");
  
		 String Data = WorkbookFactory.create(File).getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		 
		 System.out.println(Data);
		 
		 
		 FileInputStream File1=new FileInputStream("C:\\\\Users\\\\Ninad\\\\Desktop\\\\Firstname.xlsx");
		 
		 XSSFWorkbook workbook=new XSSFWorkbook(File1);
		 
		 String Data1=workbook.getSheetAt(0).getRow(1).getCell(1).getStringCellValue();
		 
		 System.out.println(Data1);
		 
		 System.setProperty("webDriver.chrome.driver", "D:\\\\velocity automation\\\\chromedriver_win32.exe");
	        
	        WebDriver driver= new ChromeDriver();
	        
	        
	        driver.get("https://www.facebook.com/");
	        
	        driver.manage().window().maximize();
	        
	        driver.findElement(By.id("email")).sendKeys(Data);
	        
	        driver.findElement(By.id("pass")).sendKeys(Data1);
	        
	        Thread.sleep(2000);
	        
	        driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
	        
	        Thread.sleep(5000);
	        driver.quit();
	 
		 
		 
		 
		 
		
	        
	        
	        
	        
	}

}
