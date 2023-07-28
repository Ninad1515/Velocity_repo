package Wrapper_class;

public class Test1 {

	public static void main(String[] args) {
         
		//wrapper class are predefined class by java which can contains primitive data types and
		//the wrapper class in java provides the mechanism to convert primitive into object and object
		// into primitive datatype
		
		//Primitive Data weapper class
		//boolean - Boolean
		//byet - Byte
		//char- Charachter
		//int-Integer
		//float-Float
		//long-Long
		//short-Short
		//double-Double
		
		String S1="200";
		String S2="400";
		
		System.out.println(S1+S2);
		
		int value1=Integer.parseInt(S1);
		int value2=Integer.parseInt(S2);
		int add=value1+value2;
		System.out.println(add);
		
		int a=200;
		System.out.println("Primitive:"+a);
		
		Integer b=400;
		System.out.println("Wrapper:"+b);
		System.out.println(a+b);
		
		
		double d=400.5;
		
		Double DD=300.5;
		System.out.println(d+DD);
		
	}

}
