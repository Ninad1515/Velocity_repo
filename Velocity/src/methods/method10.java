package methods;

public class method10 {
	//static regular method with parameters

	public static void main(String[] args) {
	    method10.Addition(10, 15);
	    method10.Addition(50, 45);
	    Addition(50, 10);
		
	    method10.Substraction(60, 80);
                 Substraction(89,54);
                 Substraction(45,34);
                 
        method10.Addition1(10, 20, 15);        
                  Addition1(20 ,30 ,16);
                  Addition1(30,40,20);
	} 
	
    public static void Addition(int a ,int b) {
    	int c = a+b;
    	System.out.println("Addition of two no ="+c);
    
    }
    public static void Substraction(int a, int b) {
    	int c= a-b;
    	System.out.println("Substraction of two no="+c);
    }
    public static void Addition1(int a, int b,int c ) {
    	int Sum=a+b-c;
    	System.out.println("Addition/substraction of three no="+Sum);
    }
}
