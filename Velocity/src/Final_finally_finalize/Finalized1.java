package Final_finally_finalize;

public class Finalized1 {

	public static void main(String[] args) {
                
		 Finalized1 F1=new Finalized1();
		 
		 F1=null;
		 System.gc();
	}
	
	public void Demo() {
		System.out.println("demo method");
	}
	public void Finalaize() {
		System.out.println("finalaized method");
	}

}
