package MapInterface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap1 {

	public static void main(String[] args) {
          
		HashMap<Integer, String> HM=new HashMap<Integer, String>();
		
		HashMap HM1=new HashMap();
		
		HM.put(101, "Ninad");
		HM.put(104, "Rohit");
		HM.put(102, "Shree");
		HM.put(103, "Sid");
		HM.put(107, "Sachin");
		HM.put(200, "Rohit");
		
		System.out.println("1)"+HM);
		System.out.println("2)"+HM.get(102));
		
		System.out.println("3)"+HM.containsKey(120));
        System.out.println("4)"+HM.containsValue("Ninad"));
        
        System.out.println("5)"+HM.isEmpty());//false
        System.out.println("6)"+HM1.isEmpty());//true
        
        System.out.println("7)"+HM.keySet());
        System.out.println("8)"+HM.values());
        
        System.out.println();
       
        System.out.println("For LOOP****************");
        
        for(Object obj:HM.keySet()) {
        	System.out.println(obj);
        }
        System.out.println();
        System.out.println("For LOOP****************");
        for(Object obj:HM.values()) {
        	System.out.println(obj);
        }
        System.out.println();
        System.out.println("For LOOP ****************");
       
        
        for(Object obj1:HM.keySet()) {
        	System.out.println(obj1+"="+HM.get(obj1));
        }
        	
        
        //entry method
        System.out.println();
        System.out.println("EnTRY MEHTOD****************");
        for(Map.Entry entry:HM.entrySet()) {
        	System.out.println(entry.getKey()+"="+entry.getValue());
        }
        System.out.println();
        System.out.println("ITERATOR ****************");

        Set S=HM.entrySet();
        
        Iterator it=S.iterator();
        
        while(it.hasNext()) {
        	Map.Entry E=(Entry) it.next();
        	System.out.println(E.getKey()+"="+E.getValue());
        }
        
        
        
        
	}
}
