package typesofvariables;

public class Static_global_variable_1 {
	   
	
	static int number=300;   //static global variable

	public static void main(String[] args) {
		Static_global_variable_1 NP= new Static_global_variable_1();
		
		NP.N1();
		NP.N2();
		NP.n3();
		//NP.n4();


	}
	
	public void N1() {
		System.out.println(number);
		number=400;
		System.out.println(number);
	}
	public void N2() {
		System.out.println(number);
		number=600;
		System.out.println(number);
	}
	public void n3() {
		System.out.println(number);
	}
	public static void n4() {
		System.out.println(number);
	}

}
