package poly;

public class Son extends father{
	  
	
	public void Home() {
		System.out.println("Home=2bhk");
	}
	public void Bike() {
		System.out.println("Bike=Fz");
	}
	public void Car() {
		System.out.println("Car = MG");
	}
	
	

	public static void main(String[] args) {
		
		Son S=new Son();
		S.Home();
		S.Bike();
		S.Car();
		
		father f = new Son();
           f.Car();
           f.Gold();
           f.Property();
           
	}

}
