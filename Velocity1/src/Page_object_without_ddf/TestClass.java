package Page_object_without_ddf;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) {
System.setProperty("webDriver.chrome.driver", "D:\\\\velocity automation\\\\chromedriver_win32.exe");
        
        WebDriver driver= new ChromeDriver();
   
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        
        Login_page LP=new Login_page(driver);
        
        LP.GoTo();
        LP.Usermail("Admin");
        LP.Password1("admin123");
        LP.Login();
        
        Dashboard D=new Dashboard(driver);
        D.NameValidation();
        D.TimeAt();

        
	}

}
