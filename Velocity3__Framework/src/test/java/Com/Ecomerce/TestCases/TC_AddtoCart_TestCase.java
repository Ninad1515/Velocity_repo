package Com.Ecomerce.TestCases;

import org.testng.annotations.Test;

import Com.Ecomerce.BaseClass.Ecoomerce_baseclass;
import Com.Ecomerce.PageClasses.TC_AddtoCart;
import Com.Ecomerce.PageClasses.TC_Login;

public class TC_AddtoCart_TestCase extends Ecoomerce_baseclass {
	@Test
	public void AddtoCart() {
		TC_Login TL=new TC_Login();
        
		TL.Email(Username);
		 logger.info("4)Enter the user Email id");

			
			TL.Pass(Password);
	 	    logger.info("5)Enter the user Password");

			TL.button();
	 	    logger.info("6)Enter the Login button");
          
	 	    TC_AddtoCart TA=new TC_AddtoCart();
	 	    TA.Computer();
	 	    logger.info("7)Click on the Computer");
	 	    
	 	    TA.Notebook();
	 	    logger.info("8)Click on the notebook");
	 	    
	 	     TA.Mack();
	 	    logger.info("9)Click one the mackbook");
	 	    
	 	    TA.button();
	 	    logger.info("10)Item add to cart succesfully");
	 	    
	 	    TA.Msg();
	 	    
	 	    logger.info("11)Verifactation msg-->add to cart");
	 	    
	 	    TA.close();
	 	    logger.info("12)Close the tab");
	 	    
	 	    
	}

}
