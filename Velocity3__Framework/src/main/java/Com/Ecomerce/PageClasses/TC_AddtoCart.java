package Com.Ecomerce.PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Ecomerce.BaseClass.Ecoomerce_baseclass;

public class TC_AddtoCart extends Ecoomerce_baseclass {

	public TC_AddtoCart() {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//a[contains(text(),'Computers')]")
	WebElement Computer;
	
	@FindBy(xpath = "(//a[contains(text(),'Notebooks')])[3]")
	WebElement Notebooks;
	
	@FindBy(xpath = "(//a[contains(text(),'Apple Ma')])")
	WebElement Mackbook;
	
	@FindBy(id = "add-to-cart-button-4")
	WebElement button;
	
	@FindBy(xpath = "//p")
	WebElement Msg;
	
	@FindBy(xpath = "//span")
	WebElement Close;
	
	public void Computer() {
		Computer.click();
	}
	
	public void Notebook() {
		Notebooks.click();
		
	}
    public void Mack() {
    	Mackbook.click();
    }
    
    public void button() {
    	button.click();
    }
    
    public void Msg() {
    	
    	boolean Message=Msg.isDisplayed();
    	System.out.println("Item add to card Succesfully"+" "+Message);
    	
    }
    public void close() {
    	Close.click();
    	
    	
       	
    	
    }
}
