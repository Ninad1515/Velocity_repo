package Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hard_Assertion {
	
	@Test
	public void Demo() {
		System.out.println("Hello good morning");
		Assert.assertTrue(true);
		System.out.println("Hello");
		Assert.assertEquals("Automatio", "Automation");
		System.out.println("Execution completed");
	}
    @Test 
	public void Demo1() {
		Assert.assertTrue(true);
		System.out.println("Hi Good evening");
		Assert.assertEquals("Java", "Automation");
		System.out.println("Execution completed");
	}
	@Test
	public void Demo2() {
		Assert.assertTrue(true);
		System.out.println("Hi Good morning");
		Assert.assertEquals("Java", "Java");
		System.out.println("Execution completed");
	}
}
