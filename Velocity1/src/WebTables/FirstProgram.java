package WebTables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstProgram {
	
	public static void main(String[] args) {
		System.setProperty("webDriver.chrome.driver", "D:\\\\velocity automation\\\\chromedriver_win32.exe");
		        
		        WebDriver driver= new ChromeDriver();
		        
		        driver.manage().window().maximize();
		        
		        driver.get("https://www.w3schools.com/html/html_tables.asp");
		        
		        JavascriptExecutor JS=(JavascriptExecutor) driver;
		       
		        WebElement Element=driver.findElement(By.xpath("//h3[contains(text(),'Example')]"));
		        
		        JS.executeScript("arguments[0].scrollIntoView();", Element);
		        
		     //1st way to find rows  
		     int row=driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr")).size();
             System.out.println("Total no of rows--->"+row);
             
             //2nd way
             List<WebElement> row1=driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr"));
             System.out.println("Total no of row-->"+row1.size());
             
             
             //1st way to find columns
             
             int col=driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr/th")).size();
             System.out.println("Total no of column-->"+col);
             
             List<WebElement> col1=driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr/th"));
             System.out.println("Total no of column-->"+col1.size());
             
             //fetching specific element
             String Text=driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr[6]/td[2]")).getText();
             System.out.println(Text);
             
             //fetching all table data
             
             for(int i=2; i<=row; i++) {
            	 for(int J=1;J<=col;J++) {
            		String Data= driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr[" + i + "]/td[" + J + "]")).getText();
            		System.out.print(Data+" | ");
            		
            	 }
            	 
            	 System.out.println();
             }
             
}
	
	
	
	
	
}