package ExceptionHandling;

public class StackOverFlow {
	
	static int no=1;
	

	public static void printnumber () {
		
		if (no<=100000) {
			System.out.println("Good");
			no++;
			printnumber();
			
		}
	}
	public static void main(String[] args) {
		
		printnumber();
		
	}
	

	}


