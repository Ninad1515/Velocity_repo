package Com.Ecomerce.PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Ecomerce.BaseClass.Ecoomerce_baseclass;

public class TC_New_Registration extends Ecoomerce_baseclass {

	
	
	public TC_New_Registration(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//button[@type=\"button\"]")
	public WebElement RegestrationButton;
	
	@FindBy(id = "gender-male")
	public WebElement Gender;
	
	@FindBy(id = "FirstName")
	public WebElement Firstname;
	
	@FindBy(id = "LastName")
	public WebElement Lastname;
	
	
	@FindBy(xpath = "//select[@name=\"DateOfBirthDay\"]")
	public WebElement Birthdate;
	
	@FindBy(xpath = "//option[@value=\"15\"]")
	public WebElement Day;
	
	@FindBy(xpath = "//select[@name=\"DateOfBirthMonth\"]")
	public WebElement Month;
	
	@FindBy(xpath = "(//option[@value=\"3\"])[2]")
	public WebElement March;
	
    @FindBy(xpath = "//select[@name=\"DateOfBirthYear\"]")
    public WebElement Year;
    
    @FindBy(xpath = "//option[@value=\"1999\"]")
    public WebElement year1;
	
	
	
	
	@FindBy(id = "Email")
	public WebElement Email;
	
	@FindBy(id = "Company")
	public WebElement Compony;
	
	@FindBy(id = "Password")
	public WebElement Password;
	
	@FindBy(id = "ConfirmPassword")
	public WebElement ConfPassword;
	
	@FindBy(id = "register-button")
	public WebElement RegisterSubmit;
	
	public void NewRegistration() {
		RegestrationButton.click();
	}
	
	public void Gender() {
		Gender.click();
		
	}
	public void Firstname(String name) {
		Firstname.sendKeys(name);
	}
	public void Lastname(String lastname) {
		Lastname.sendKeys(lastname);
		
	}
	public void Bdy() {
		Birthdate.click();
		
	}
	public void Day() {
		Day.click();
	}
	public void Month() {
		Month.click();
	}
	public void Mar() {
		March.click();
		
	}
	public void year() {
		Year.click();
	}
	public void year1() {
		year1.click();
	}
	public void Email(String email) {
		Email.sendKeys(email);
	}
	public void Compony(String C) {
	Compony.sendKeys(C);
    }
	
	public void Pass(String Pass) {
		Password.sendKeys(Pass);
		
	}
	public void CPass(String cpass) {
		ConfPassword.sendKeys(cpass);
		
	}
	
	public void Registration() {
		RegisterSubmit.click();
	}
	

	
	
	
	
	
	
}
