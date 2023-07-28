package poly;

public class methodoverloding {

	public static void main(String[] args) {
        
		methodoverloding.demo1();
		methodoverloding.demo1(10);
		methodoverloding.demo1(20, 'A');
		
		methodoverloding MO = new methodoverloding();
		MO.demo(40);
		MO.demo(70, 8999);
		

	}
	
	public static void demo1() {
		System.out.println("zero parameters");
		
	}
	public static void demo1(int i) {
		System.out.println("one parameters");

}
	public static void demo1(int i,char J) {
		System.out.println("two parameters");
}
	public void demo(int i) {
		System.out.println("one parameters");
	
}
	public void demo(int i, double K) {
		System.out.println("two parameters");
}
}