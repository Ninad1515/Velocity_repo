package assignments;

public class automaticpromotion {

	public static void main(String[] args) {
		
		automaticpromotion ao = new automaticpromotion();
		ao.demo(67.00f);
		ao.demo();
		ao.demo(90f);;
		ao.demo(455d);
	}
	
	
	public void demo() {
		System.out.println("zero parameter");
		
	}
	public void demo(int i) {
		System.out.println("one parameter");

}
	public void demo(float j) {
		System.out.println("float parameter");
}
	public void demo(double k) {
		System.out.println("double parameter");
}
}