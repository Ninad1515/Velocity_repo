package Final_finally_finalize;

public class Finally {

	public static void main(String[] args) {
		//Finally.Test();
		
		Finally.Div();

	}
	public static void Test() {
	  try {
		  System.out.println("try block");
	  }catch (Exception e) {
		System.out.println("Catch block");
	}finally {
		System.out.println("Finally block");
	}
	  
	}
	public static void Div() {
		int i=0;
	    try {
	    	int k=200/0;
	    	System.out.println("try block");
			
		} catch (ArithmeticException e) {
			System.out.println("inside the catch");
			System.out.println("div by O");
		}finally {
			System.out.println("Executed finally block");
		}
	}

}
