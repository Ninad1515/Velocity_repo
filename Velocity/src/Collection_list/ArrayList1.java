package Collection_list;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {

	public static void main(String[] args) {
        
		int arr[]= new int[5];
		
		ArrayList A=new ArrayList();
		
		ArrayList<String> A1=new ArrayList<String>();
		
		A.add("Welcome");
		A.add(200);
		A.add(true);
		A.add('A');
		A.add(null);
		A.add(30.4);
		A.add("ninad");
		
		System.out.println(A);
		
		System.out.println();
		
		//2,size
		
		System.out.println(A.size());
		
		//3.remove
		System.out.println(A);
		A.remove(30.4);
		System.out.println(A);
		
		//4.insert new element
		A.add(20);
		System.out.println(A);
		A.add("Python");
		System.out.println(A);
		
		//5.retrieve spc element
       System.out.println(A.get(5));
       
       //6.replace/change
       A.set(1, "Hello");
       A.set(3, "BYE");
      System.out.println(A); 
      
      //7.isempty
     System.out.println(A.isEmpty());
     System.out.println(A1.isEmpty());
     
     System.out.println("*****");
     //8.read/print the data from arrylist
     System.out.println("Read the arrylist using for loop");
     
     for(int i=0; i<A.size();i++) {
    	 System.out.println(A.get(i));
     }
     System.out.println("*****");
     System.out.println("Read the arrylist using for each loop");
     
     for(Object O:A) {
    	 System.out.println(O);
     }
     System.out.println("*****");
     System.out.println("Read the arrylist using iterator");
     
     Iterator I=A.iterator();
     
     while(I.hasNext()) {
    	 System.out.println(I.next());
     }
     


      
      
		
		
		
	}

}
