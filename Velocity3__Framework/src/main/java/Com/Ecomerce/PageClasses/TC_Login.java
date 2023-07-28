package Com.Ecomerce.PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Ecomerce.BaseClass.Ecoomerce_baseclass;

public class TC_Login extends Ecoomerce_baseclass{
	
	public TC_Login() {
	PageFactory.initElements(driver, this);	
	
	}
	
	@FindBy(id = "Email")
	public WebElement Email;
	
	@FindBy(id = "Password")
	public WebElement Pass;
	
	@FindBy(xpath = "(//button[@type=\"submit\"])[2]")
	public WebElement Button;
	
	@FindBy(xpath = "//a[@class=\"ico-logout\"]")
	public WebElement Logout;
	
	public void Email(String email) {
		Email.sendKeys(email);
	}
	public void Pass(String pass) {
		Pass.sendKeys(pass);
	}
	public void button() {
		Button.click();
	}
	public void Logout() {
		Logout.click();
	}
	

}
