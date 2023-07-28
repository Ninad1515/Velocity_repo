package Collection_list;

import java.util.Iterator;
import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) {
              
		     Vector VC=new Vector();
		     VC.add("Test");
		     VC.add(2);
		     VC.add('G');
		     VC.add(true);
		     VC.add(null);
		     VC.add(33);
		     
	            System.out.println(VC);
	            
	            System.out.println(VC.size());
	            
	            VC.remove(4);
	            System.out.println(VC);
	            
	            System.out.println(VC.removeElement(33));
	            System.out.println(VC);
	            
	            VC.set(1, "JAVA");
	            System.out.println(VC);
                
	            VC.set(2, 22);
	            System.out.println(VC);
	            
	            VC.add(3, "HELLO");
	            VC.add(4, true);
	            System.out.println(VC);

                VC.remove(1);
	            System.out.println(VC);
	            
	            VC.add('N');
	            System.out.println(VC);

	            VC.remove(5);
	            System.out.println(VC);
	            
	            //using while loop
	            System.out.println("**********");

	            
	            for(int i =0;i<VC.size();i++) {
	            	System.out.println(VC.get(i));
	            	
	            }
	            System.out.println("**********");

                 
	            for(Object obj:VC) {
		            System.out.println(obj);

	            }
	            System.out.println("**********");

	            Iterator it=VC.iterator();
	            while(it.hasNext()) {
		            System.out.println(it.next());

	            }






		     
		    
	}

}
