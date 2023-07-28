package Wrapper_class;

public class Test3 {

	public static void main(String[] args) {
         
		String S1="200.3";
		String S2="400.50";
		
		double value1=Double.parseDouble(S1);
		double value2=Double.parseDouble(S2);
		double add=value1+value2;
		
		System.out.println(add);
		
		if(add==600.3) {
			System.out.println("Correct Addition");
		}else {
			System.out.println("Inccoorect Addition");
		}
	}

}
