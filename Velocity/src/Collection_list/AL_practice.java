package Collection_list;

import java.util.ArrayList;
import java.util.Arrays;

public class AL_practice {

	public static void main(String[] args) {
                       String arr[]= {"Test,Demo,Java,Python"};
                       
                       for(String N:arr) {
                    	   System.out.println(N);
                       }
                       
                       ArrayList A=new ArrayList(Arrays.asList(arr));
                       System.out.println(A);
                       
	}

}
