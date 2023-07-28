package Logical_Program;

import java.util.Scanner;

public class Palindrome_no {

	public static void main(String[] args) {
        int Originalnumber,sum,rem;
        System.out.println("enter a number");
        
        Scanner S=new Scanner(System.in);
        
        int num=S.nextInt();
        Originalnumber=num;
        
        for(sum=0;num>0;num=num/10) {
        	rem=num%10;
        	sum=sum*10+rem;
        	
        }
        if(sum==Originalnumber) {
        	System.out.println(Originalnumber +"--> is a palindrome number");
        }else {
        	System.out.println(Originalnumber +"-->is not a palindrome number");
        }
	}

}
