package accessModifire;

public class Public {
	
	
	public int Age=20;

	public static void main(String[] args) {
		Public ABC=new Public();
		//ABC.Test1();
		//ABC.Test2();
		
		System.out.println(ABC.Age);
				
		

	}
	
	public void Test1() {
		System.out.println("Public Method1");
	}
	public void Test2() {
		//System.out.println("Test2 public method");
	}
}


