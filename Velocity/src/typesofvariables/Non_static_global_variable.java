package typesofvariables;

public class Non_static_global_variable {
	       
	       int age=20;
	       String name="Ninad";

	public static void main(String[] args) {
		Non_static_global_variable NP=new Non_static_global_variable();
		
			
		    System.out.println(NP.name);
			System.out.println(NP.age);
		
		     NP.Demo();

	}
	public void Demo() {
		int N=40;
	     name="NRP";
	     System.out.println(N);
	     System.out.println(name);
	}
	       

}
