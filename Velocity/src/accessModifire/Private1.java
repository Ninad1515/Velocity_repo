package accessModifire;

public class Private1 {
	
	private int no = 500;

	public static void main(String[] args) {
		
		Private1 P1 = new Private1();
		
				P1.test();
				P1.test1();
				System.out.println(P1.no);
				
				
		

		
		
		
		
		
	}
	private void test() {
		System.out.println("Test= Private method");
	}
	private void test1() {
		System.out.println("Test1= Private method");

}
}
