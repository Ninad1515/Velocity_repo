package Collection_set;

import java.util.HashSet;

public class HashSet2 {

	public static void main(String[] args) {
              HashSet HS=new HashSet();
              
              HS.add(2);
              HS.add(3);
              HS.add(9);
              HS.add(55);
              HS.add(777);
              HS.add(6);
              
              HashSet HSS=new HashSet();
              HSS.add(2);
              HSS.add(39);
              HSS.add(97);
              HSS.add(557);
              HSS.add(77);
              HSS.add(6);

              
              HS.addAll(HSS);
              System.out.println(HS);
              
              HS.retainAll(HSS);
              System.out.println(HS);
              
              HS.removeAll(HSS);
              System.out.println(HS);
              
              

              
	}

}
