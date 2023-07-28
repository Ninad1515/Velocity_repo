package ExceptionHandling;

public class ThrowKeyword {

	public static void main(String[] args) {
          //throw keyword is used to declared the exception
		
		ThrowKeyword TK=new ThrowKeyword();
		TK.sum();
		System.out.println("hello");
		
	}
	
	public void sum() {
		try {
			div();
		}
		catch (Exception e) {
		}
		}

	private void div() throws ArithmeticException,NullPointerException,IndexOutOfBoundsException{
		
          int i=100/0;
          
          int j=100/0;
	}
	
	}


