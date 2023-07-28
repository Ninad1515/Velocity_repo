package methods;

public class method4 {
              public static void main(String[] args) {
            	  
            	  System.out.println("Main method started");
            	  //Static regular method calling from different class
            	  
            	  //1.Direct calling method name
            	  //Test1();
            	  
            	  //Test2();
            	  
            	  //calling by class name
            	  
            	  method3.Test1();
            	  method3.Test2();
            	  method4.Demo4();
            	  
            	 System.out.println("Main method ended");
            	 
            	  
              }
              
              public static void Demo4() {
            	  System.out.println("Demo 4 Method");
              }
}
