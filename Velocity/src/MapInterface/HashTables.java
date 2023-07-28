package MapInterface;

import java.util.Hashtable;

public class HashTables {

	public static void main(String[] args) {
              
		
		   Hashtable<Integer, String> HT=new Hashtable<>();
		   
		   HT.put(2, "Ninad");
		   HT.put(3, "Rohit");
		   HT.put(1, "Shree");
		   HT.put(35, "Sachin");
		   HT.put(13, "Ninad");
		   
		   System.out.println(HT);
		   
		   System.out.println(HT.remove(1));
		   System.out.println(HT);
		   
		   //containsKey
		   System.out.println(HT.containsKey(13));
		   System.out.println(HT.containsKey(1));
		   
		   System.out.println(HT.containsValue("Ninad"));
		   System.out.println(HT.containsValue("Shree"));
		   
		   System.out.println(HT.isEmpty());
		   
		   System.out.println(HT.keySet());
		   System.out.println(HT.values());
		   
		   HT.put(1, "Shree");
		   System.out.println(HT);
		   
		   for(Object obj:HT.keySet()) {
			   System.out.println(obj+"="+HT.get(obj));
		   }
		   
		   
		   
	}

}
