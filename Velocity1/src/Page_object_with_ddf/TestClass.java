package Page_object_with_ddf;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Page_object_without_ddf.Dashboard;
import Page_object_without_ddf.Login_page;

public class TestClass {

	public static void main(String[] args) throws IOException {
System.setProperty("webDriver.chrome.driver", "D:\\\\velocity automation\\\\chromedriver_win32.exe");
        
        WebDriver driver= new ChromeDriver();
   
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        
        Login_page LP=new Login_page(driver);
        
        String path="C:\\\\Users\\\\Ninad\\\\eclipse-workspace\\\\Velocity1\\\\Test\\\\Orange.xlsx";
        
        FileInputStream File=new FileInputStream(path);
        
        Sheet Data=WorkbookFactory.create(File).getSheet("Sheet1");
        
        LP.GoTo();
        
        String UserID=Data.getRow(1).getCell(0).getStringCellValue();
        LP.Usermail(UserID);
        
        String Password1=Data.getRow(1).getCell(1).getStringCellValue();
        LP.Password1(Password1);
        
        LP.Login();
        
        Dashboard D=new Dashboard(driver);
        D.NameValidation();
        D.TimeAt();
        
        
       
        
	}

}
