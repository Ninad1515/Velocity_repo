package TestNG_Features;

import org.testng.annotations.Test;

public class DependsOn_methods {
	@Test
	public void Login() {
		System.out.println("Login");
		int no=10/0;
		
	}
	@Test(dependsOnMethods = "Login")
	public void Homepage() {
		System.out.println("Homepage");
	}
	@Test
	public void searchpage() {
		System.out.println("SearchPage");
	}
	@Test
	public void Refreshpage() {
		System.out.println("Refreshpage");
	}
	
	

}
