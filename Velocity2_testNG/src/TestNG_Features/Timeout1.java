package TestNG_Features;

import org.testng.annotations.Test;

public class Timeout1 {
	
	
	@Test(timeOut = 1)
	public void login() {
		for(;;) {
			System.out.println("Hello");
		}
	}

}
