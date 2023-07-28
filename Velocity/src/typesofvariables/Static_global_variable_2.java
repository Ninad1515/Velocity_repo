package typesofvariables;

public class Static_global_variable_2 {
	
	  static int number=200;
	  static String name="Rohit";

	public static void main(String[] args) {
		//Static global variables calling from same class
		//creating variables outside the method/function is known as global varaibles
		
		
		System.out.println(number);
		System.out.println(name);
		
		Static_global_variable_2.demo();
		Static_global_variable_2.demo1();
	
		
		Static_global_variable_2 NP=new Static_global_variable_2();
		NP.demo2();
				
	}
     public static void demo() {
    	 System.out.println(number);
 		System.out.println(name);
 		System.out.println();
 		
 		number=400;
 		name="Rohit";		
 		
    	 
     }
     public static void demo1() {
    	 System.out.println(number);
    	 System.out.println(name);
    	 System.out.println();
     }
     public void demo2() {
    	 System.out.println(number);
    	 System.out.println(name);
     }

}
