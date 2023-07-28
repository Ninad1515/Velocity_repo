package Assertions;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assertions {

	
	@Test
	public void Demo() {
		SoftAssert S=new SoftAssert();
		
		System.out.println("Execution Started");
		
		S.assertEquals("Welcome", "Welcome");
		
		S.assertEquals(true, true);
		
		System.out.println("Execution complete");
		
		System.out.println("Hello");
		
		S.assertAll();
		
		
		
	}
	@Test
	public void Demo1() {
		SoftAssert S=new SoftAssert();
		
		System.out.println("Execution Started");
		
		S.assertEquals("Welcome", "Welcome1");
		
		S.assertEquals(true, false);
		
		System.out.println("Execution complete");
		S.assertAll();
	}
}
