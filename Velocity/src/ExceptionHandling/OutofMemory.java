package ExceptionHandling;

import java.util.ArrayList;

public class OutofMemory {

	public static void main(String[] args) {

         String Text="Ninad";
         
         ArrayList A=new ArrayList();
         
         while(true) {
        	 Text=Text+ " test";
        	 A.add(Text);
        	 
        	// System.out.println(A);
        	 
         }
	}

}
