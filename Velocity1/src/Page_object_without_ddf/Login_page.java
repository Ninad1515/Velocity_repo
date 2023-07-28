package Page_object_without_ddf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {
	
	WebDriver driver;
	
	public Login_page(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//pagefactory
	
	@FindBy(xpath = "//input[@name=\"username\"]")
	public WebElement useremail;
	
	@FindBy(xpath = "//input[@name=\"password\"]")
	private WebElement Password;
	
	@FindBy(xpath = "//button[@class=\"oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\"]")
	public WebElement Button;
	
	public void Usermail(String email) {
		useremail.sendKeys(email);
		}
	public void Password1(String Pass) {
		Password.sendKeys(Pass);
	}
	public void Login() {
		Button.click();
	}
    public void GoTo() {
    	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }
}
