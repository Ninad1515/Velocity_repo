package Collection_set;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset1 {

	public static void main(String[] args) {
                HashSet HS=new HashSet();
                HashSet HSS=new HashSet();
                
                HS.add(22);
                HS.add("NINAD");
                HS.add('N');
                HS.add(30.4);
                HS.add(null);
                HS.add(null);
                HS.add(true);
                
	            System.out.println(HS);
	            System.out.println(HS.add(22));
	            System.out.println(HS.add("Papu"));
	            System.out.println(HS.size());
	            
	            HS.remove('N');
	            System.out.println(HS);
	            
	            System.out.println(HS.isEmpty());
	            System.out.println(HSS.isEmpty());
	            
	            System.out.println(HS.contains("NINAD"));
	            
	            
	            System.out.println("*********");
	            
	           // for(int i=0;i<HS.size();i++);
	           // System.out.println(HS.get);

                for(Object obj:HS) {
                	System.out.println(obj);
                }
	            System.out.println("********");
	            
	            Iterator it=HS.iterator();
	            while(it.hasNext()) {
	            	System.out.println(it.next());
	            }




	            



	}

}
