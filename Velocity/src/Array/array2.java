package Array;

import java.util.Arrays;

public class array2 {

	public static void main(String[] args) {
		
              
		      char C1[]=new char[4];
		      
		      C1[0]= 'a';
		      C1[1]= 'b';
		      C1[2]= 'c';
		      C1[3]= '3';
		      
		      
		   System.out.println(C1.length);
		   for(int i= 0; i<C1.length ;i++) {
		   
		System.out.println(C1[i]);
	}
		   System.out.println();
		   Arrays.sort(C1);
		   
		   for(int i=0;i<C1.length;i++) {
			   System.out.println(C1[i]);
		   }
	}
}
