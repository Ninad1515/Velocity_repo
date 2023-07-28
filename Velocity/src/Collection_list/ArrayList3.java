package Collection_list;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList3 {

	public static void main(String[] args) {
           String arr[]= {"Dog","elephant","Cat"};
           
           for(String name:arr) {
        	   System.out.println(name);
           }
           //convert array into arraylist
           System.out.println("*********");
           
           ArrayList A=new ArrayList(Arrays.asList(arr));
           System.out.println(A);
	}

}
