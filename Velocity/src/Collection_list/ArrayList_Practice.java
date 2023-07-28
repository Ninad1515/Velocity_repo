package Collection_list;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_Practice {

	public static void main(String[] args) {
              
		    ArrayList A=new ArrayList();
		    ArrayList A1=new ArrayList();
		    
		    A.add("Ninad");
		    A.add(3);
		    A.add('A');
		    A.add(67.5);
		    A.add(null);
		    A.add(true);
		    A.add(false);
		    
		

		    
		    System.out.println(A);
		    
		    System.out.println(A.size());
		    
		    A.remove(4);
		    System.out.println(A);
            
		    A.set(4,"Papu" );
		    System.out.println(A);
            
		    System.out.println(A.contains(3));
            
		    System.out.println(A.get(0));
		    
		    System.out.println(A.isEmpty());
		    System.out.println(A1.isEmpty());

		    A1.addAll(A);
	        System.out.println(A1);    
	        
		    System.out.println("***********");
             
		    for(int i=0;i<A.size();i++) {
			    System.out.println(A.get(i));

		    }
		    System.out.println("***********");
            for(Object obj:A) {
    		    System.out.println(obj);

            }
		    System.out.println("***********");
            Iterator IT=A.iterator();
            while(IT.hasNext()) {
    		    System.out.println(IT.next());
    		    

            }
	        
	        
		    

		   

		    
		    
	}

}
