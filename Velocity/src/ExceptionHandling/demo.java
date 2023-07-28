package ExceptionHandling;

public class demo {
	
	public static void m1() {
		m2();
		
	}
	public static void m2() {
		m3();
	}
	public static void m3() {
		int no=100;
		System.out.println(no);
	}



	public static void main(String[] args) {
		m1();

	}

}
