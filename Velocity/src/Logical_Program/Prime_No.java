package Logical_Program;

import java.util.Scanner;

public class Prime_No {

	public static void main(String[] args) {

         System.out.println("Enter a number");
         
         Scanner S=new Scanner(System.in);
         
         int num=S.nextInt();
         int i;
         for(i=2;i<num;i++)
        	 if(num%i==0)
        		 break;
         if(i==num)
        	 System.out.println("Prime Number");
         else
        	 System.out.println("Not a Prime Number");
         
		
	}

}
