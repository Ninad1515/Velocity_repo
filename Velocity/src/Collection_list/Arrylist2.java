package Collection_list;

import java.util.ArrayList;
import java.util.Collections;

public class Arrylist2 {

	public static void main(String[] args) {
       
		ArrayList A=new ArrayList();
         
		A.add("A");
		A.add("D");
		A.add("C");
		A.add("B");
		A.add("E");
	System.out.println(A);
	
	//1.add all
	
	ArrayList D=new ArrayList();
	D.addAll(A);
	System.out.println(D);

	//2.remove all
	D.removeAll(A);
	System.out.println(D);
	
	//3.collection
	System.out.println(A);
	Collections.sort(A);
	System.out.println(A);
	
	Collections.sort(A, Collections.reverseOrder());
	System.out.println(A);
	
	Collections.shuffle(A);
	System.out.println(A);
	
	
	
	}

}
