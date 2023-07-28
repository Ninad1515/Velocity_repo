package Collection_set;

import java.util.HashSet;

public class HashSet3 {

	public static void main(String[] args) {
             
		    HashSet<String> HS1=new HashSet<String>();
		    
		    HS1.add("Ninad");
		    HS1.add("Vaibhav");
		    HS1.add("java");
		    HS1.add("shree");
		    HS1.add("Test");
		    
		    System.out.println(HS1);
            
		    
		    HashSet<String> HS2=new HashSet<String>();
		    
		    HS2.addAll(HS1);
		    System.out.println(HS2);
		    
		    HS2.removeAll(HS1);
		    System.out.println(HS2);

	}

}
