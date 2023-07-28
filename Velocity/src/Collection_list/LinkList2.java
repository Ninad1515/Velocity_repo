package Collection_list;

import java.util.Collections;
import java.util.LinkedList;

public class LinkList2 {

	public static void main(String[] args) {
            LinkedList<String> LL=new LinkedList<String>();
            
            LL.add("A");
            LL.add("S");
            LL.add("M");
            LL.add("L");
            LL.add("N");
            LL.add("B");
            System.out.println(LL);
            
            LinkedList<String> LLL=new LinkedList<String>();
            LLL.addAll(LL);
            System.out.println(LLL);
            
            LLL.removeAll(LL);
            System.out.println(LLL);
            
            Collections.sort(LL);
            System.out.println(LL);
            
            Collections.sort(LL,Collections.reverseOrder());
            System.out.println(LL);
            
            


            

            
            
	}

}
