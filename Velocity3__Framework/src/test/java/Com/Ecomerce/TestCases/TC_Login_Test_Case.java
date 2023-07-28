package Com.Ecomerce.TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Com.Ecomerce.BaseClass.Ecoomerce_baseclass;
import Com.Ecomerce.PageClasses.TC_Login;
import Com.Ecomerce.Utilities.XLS_utils;

public class TC_Login_Test_Case extends Ecoomerce_baseclass {
	@Test(dataProvider = "Logindata")
	public void Login(String user,String Pass,String Expected) throws InterruptedException {
		TC_Login TL=new TC_Login();
		
		TL.Email(user);
 	    logger.info("4)Enter the user Email id");

		
		TL.Pass(Pass);
 	    logger.info("5)Enter the user Password");

		TL.button();
 	    logger.info("6)Enter the Login button");

		
		String exp_title="nopCommerce demo store";
		String Act_title=driver.getTitle();
		
		if(Expected.equals("Valid")) {
			if(Act_title.equals(exp_title)) {
				TL.Logout();
				logger.info("*****LOG OUT SUCCESFULL*****");
				Assert.assertTrue(true);

				
		 	    logger.info("7)Login Taste case succesfull");
			}
			else {
				Assert.assertTrue(false);
		 	    logger.info("8)Login Taste case Unsuccesfull");

				

				
			
			
			}

			
		
		}
		else if (Expected.equals("Invalid")) {
			if (Act_title.equals(exp_title)) {
				TL.Logout();
				Assert.assertTrue(false);
				logger.info("Login Tatse Case succesfull");
			}
			else {
				Assert.assertTrue(true);
				logger.info("Login Taste case Unsuccesfull");
				
			}
			
		}
	    
	}
	
	
		
	
	    	  
		
		
		
		
		
		
			
	 	    
		
	

	@DataProvider(name="Logindata")
	public String[][] getdata() throws IOException{
		String path=System.getProperty("user.dir")+"\\src\\main\\java\\Data_sheets\\Data_Velocity.xlsx";
		
		int rownum=XLS_utils.GetRowcount(path, "Sheet1");
		 int Colcount=XLS_utils.getcellcount(path, "Sheet1", 1);
		 
		 String logindata[][]=new String [rownum][Colcount];
		 
		 for(int i=1;i<=rownum;i++) {
			 for(int j=0;j<Colcount;j++) {
				 logindata[i-1][j]=XLS_utils.getcelldata(path, "Sheet1", i, j);
			 }
		 }
		 return logindata;
	}

}
