package methods;

public class method2 {

	public static void main(String[] args) {
	       System.out.println("main method started");
	       //1.Direct calling by method name
	       staticmethod1();
	       staticmethod2();
	  
           System.out.println("main method ended");
	}
    public static void staticmethod1() {
    	int i=40;
    	int j=50;
    	int k=i+j;   //40+50=90
    	
    	System.out.println("Additional of two no is="+k);
    }
    
    public static void staticmethod2() {
    	System.out.println("Static method calling from same class");
    	
    }
}

