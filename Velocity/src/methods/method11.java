package methods;

public class method11 {

	public static void main(String[] args) {
		method11.Studentname("ninad");
		method11.Studentname("Papu");
		
		method11.Studentinfo("Ninad", 15);
		method11.Studentinfo("Papu", 40);
		
		

	}
	
	public static void Studentname(String Name) {
		
		System.out.println("Studentname="+Name);
	}
	public static void Studentinfo(String Name,int No) {
		System.out.println("Student info="+Name+" "+No);
	}

}
