package inheritence;

public class Hierarchical_test {

	public static void main(String[] args) {
		
		
		
		Hierarchical h1= new Hierarchical();
		h1.Car();
		h1.Gold();
		h1.Property();
		System.out.println("**************************");  
		
		Son1H s1= new Son1H();
		s1.Bike();
		s1.Car();
		s1.GF();
		s1.Gold();
		s1.Mobile();
		s1.Property();
		System.out.println("**************************");  
		
		Son2H s2 =new Son2H();
		s2.Car();
		s2.Gold();
		s2.Laptop();
		s2.Property();
		System.out.println("**************************");  
		
		Son3H s3 = new Son3H();
		s3.Car();
		s3.Computer();
		s3.Gold();
		s3.Property();
				

	}

}
