package TestNG_Features;

import org.testng.annotations.Test;

public class Day3 {
       
	@Test
	public void Test1() {
		System.out.println("hello");
	}
	@Test(groups = {"smoke"})
	public void Test4() {
		System.out.println("Day 3--->Test4");
	}

}
