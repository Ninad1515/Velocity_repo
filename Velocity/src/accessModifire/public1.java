package accessModifire;

public class public1 {
         
	
	public int Number=300;
	
	public static void main (String[] args) {
		
		public1 P1 = new public1();
		P1.Demo();
		P1.Demo1();
		
		
			System.out.println(P1.Number);
		
	}
	
	public void Demo() {
		System.out.println("Demo = Non static method ");
		
	}
	public void Demo1() {
		System.out.println("Demo1 = Non static method 1 ");
	
}
}
