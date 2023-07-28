package Collection_Queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueue1 {

	public static void main(String[] args) {
                       
		           PriorityQueue P=new PriorityQueue();
		           PriorityQueue PP=new PriorityQueue();
		           
		           P.add('A');
		           P.add('N');
		           P.add('M');
		           P.add('P');
		           
		           System.out.println(P);
		           
		          P.offer('E');
		           System.out.println(P.offer('r'));
		           System.out.println(P);
		           
		           System.out.println(P.element());
		       //    System.out.println(PP.element());
		           
		           System.out.println(P.peek());
		           System.out.println(PP.peek());
		           System.out.println(P);
		           
		           System.out.println("######");
		           
		           System.out.println(P.remove());
		          // System.out.println(PP.remove());
		           System.out.println(P);
		           
		           System.out.println("######");

		           
		           System.out.println(P.poll());
		           System.out.println(P);
		           System.out.println(PP.poll());
		           
		           for(Object obj:P) {
		        	   System.out.println(obj);
		           }
		           System.out.println("******");
		           
		           Iterator it=P.iterator();
		           while(it.hasNext()) {
		        	   System.out.println(it.next());
		           }
	}              
	
	                 

}
