package controlstatement;

public class Nestedifstatement2 {

	public static void main(String[] args) {
		
		int age=15;
        int weight=44;
        
        if(age>=18) {
        	if(weight>=50) {
        		System.out.println("You are eligible for blood donation");
        		
        	}
        	else if(weight<=50) {
        		System.out.println("You are not eligible for blood donation");
        	}	
        		
        		
        	}
        	else {
        		System.out.println("Age must be greater than 18");
        		
        	}
        }
	}


