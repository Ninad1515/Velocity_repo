package methods;

public class method6 {
	 //Non static method calling from same class

	public static void main(String[] args) {
		System.out.println("main method started");
		//we need to create object of class
		//after creating the object copy all tje non staic methods will be 
		//the objection
		//Syntax-classname varaible name= new classname
		method6 Test= new method6();
		Test.N1();	
		Test.N2();
		Test.N3();
		
		System.out.println("main method ended");
		

	}
    public void N1() {
            System.out.println("Non static regular method calling from same class=N1");
            
    }
    public void N2() {
    	    System.out.println("Non static regular method calling from same class=N2");
    	    
    }
    public static void N3() {
    	    System.out.println("Static method");
    }
        
    
}
