package methods;

public class method8 {

	public static void main(String[] args) {
		//method7.N4();
		//method7,N5();
		method7 Test = new method7();
		Test.N4();
		Test.N5();
        
		method8 Test1= new method8();
				Test1.N6();
	}
    public void N6() {
    	System.out.println("Non static regular method calling from same class=N6");
    	
    }
}
