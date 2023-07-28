package Parameterization;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Sum3 {

	
            
		@Parameters({"a","b"})
		@Test
		public void add(int a,int b) {
			int div=a/b;
			System.out.println("Sum of two number-->"+div);
			
		
			
		
		
	}

}
