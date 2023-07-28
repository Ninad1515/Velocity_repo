package methods;

public class method1 { //class body
	    //static regular method from same class
	    public static void main(String[] args) {  //main method body
		//starting poiint of the program
		System.out.println("main method started");
		//1.direct calling
        //synatx=Methodname();
		Demo1();
		Demo2();
		
		
		System.out.println("main method ended");
		
	}
      
	    public static void Demo1(){
	       System.out.println("static regular method from same class=Demo1");
	    }
	    
	    public static void Demo2(){
	        System.out.println("static regular method from same clss=Demo2");
	    }
}
