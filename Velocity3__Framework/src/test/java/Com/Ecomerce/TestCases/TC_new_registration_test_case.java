package Com.Ecomerce.TestCases;

import static org.testng.Assert.assertTrue;

import java.util.Random;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import Com.Ecomerce.BaseClass.Ecoomerce_baseclass;
import Com.Ecomerce.PageClasses.TC_New_Registration;
import net.bytebuddy.utility.RandomString;

public class TC_new_registration_test_case extends Ecoomerce_baseclass {

	  
	
	@Test
	public void Registration() throws InterruptedException {
		TC_New_Registration TNR=new TC_New_Registration(driver);
		
		TNR.NewRegistration();
		TNR.Gender();
		TNR.Firstname("Ninad");
		TNR.Lastname("Patil");
		
		TNR.Bdy();
		TNR.Day();
		TNR.Month();
		TNR.Mar();
		TNR.year();
		TNR.year1();
		
		
		
		Thread.sleep(5000);
		
		String R=RandomString.make(5);
		TNR.Email(R+"nndp@gmail.com");
		
		TNR.Compony("Apple");
		
		TNR.Pass("Ninad@123");
		TNR.CPass("Ninad@123");
		
		TNR.Registration();
		
		boolean Text=driver.findElement(By.xpath("//div[@class=\"result\"]")).isDisplayed();
		  if(Text==true) {
			  System.out.println("Correct user");
			  Assert.assertTrue(true);
		  }else {
			  System.out.println("Incoorect user");
			  Assert.assertTrue(false);
			  
		  }
	  }
	
	
}
