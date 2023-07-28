package Logical_Program;

import java.util.Scanner;

public class Armstrong_NO {

	public static void main(String[] args) {
          
		int p,sum,rem;
		
		System.out.println("Enter a number");
		Scanner S=new Scanner(System.in);
		
		int num=S.nextInt();
		p=num;
		
		for(sum=0;num>0;num=num/10) {
			rem=num%10;
			
			sum=sum+rem*rem*rem;
			
		}
		if(sum==p) {
			System.out.println("Armstrong number");
			
		}else {
			System.out.println("Not Armstrong number");
		}
	}

}
