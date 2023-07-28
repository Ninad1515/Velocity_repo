package typesofvariables;

public class Static_nonstatic1 {

	public static void main(String[] args) {
		// calling from different classs
		
		
		Differentclass3 NP=new Differentclass3();
		System.out.println(NP.N);
		System.out.println(NP.Name);
		
		System.out.println(Differentclass3.A);
		System.out.println(Differentclass3.B);
		
				

	}

}
