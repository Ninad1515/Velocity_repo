package Page_object_without_ddf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard {
	
	WebDriver driver;
	
	@FindBy(xpath = "//p[@class=\"oxd-userdropdown-name\"]")
	WebElement Name;
	
	@FindBy(xpath ="//p[@class=\"oxd-text oxd-text--p\"]")
	WebElement time;
	
	public Dashboard(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void NameValidation() {
		String Text=Name.getText();
		if(Text.equals("3424 Collings")) {
			System.out.println("Correct username");
			
		}else {
			System.out.println("incoorect username");
		}
	}
	public void TimeAt() {
		boolean T=time.isDisplayed();
		System.out.println(T);
	}


}
