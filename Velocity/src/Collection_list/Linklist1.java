package Collection_list;

import java.util.Iterator;
import java.util.LinkedList;

public class Linklist1 {

	public static void main(String[] args) {
                 LinkedList LL=new LinkedList();
                 
                 LL.add("a");
                 LL.add("Ninad");
                 LL.add('A');
                 LL.add(2.30);
                 LL.add(true);
                 LL.add(null);
                 LL.add(false);
                 
                 
                 System.out.println(LL);
                 System.out.println();
                 System.out.println(LL.size()); 
                 
                 System.out.println(LL.remove("Ninad"));
                 System.out.println(LL); 
 
                 LL.add("Papu");
                 System.out.println(LL); 
                 
                 LL.add(2, "Ninad");
                 System.out.println(LL);
                 
                 System.out.println(LL.get(7));
                 
                 System.out.println(LL.getFirst()); 
                 
                 System.out.println(LL.getLast()); 
                 
                 System.out.println(LL.isEmpty());
                 
                 System.out.println(LL.contains("Ninad")); 
                 
                 System.out.println(LL.contains(true));
                 
                 System.out.println("*********");
                 
                 for(int i=0;i<LL.size();i++) {
                 System.out.println(LL.get(i));
                 
                 
                 }
                 System.out.println("*********");

                 for(Object obj:LL) {
                 
				System.out.println(obj);
                		 
                 }
                 System.out.println("*********");

                 Iterator it=LL.iterator();
                 while(it.hasNext()) {
                	 System.out.println(it.next());
                 }



                 
                
	}

}
