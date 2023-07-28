package controlstatement;

public class nestedifStatement {

	public static void main(String[] args) {
		int a=100;
		int b=200;
		int c=300;
		
		if(a>b) {
			if(b>c) {
				System.out.println("A is the gretest number");
				
				
			}
			else if(b>c)
				System.out.println("B is greter number");
		
			
		}
		else {
			System.out.println("c is greter number");
			
		}
	}

}
