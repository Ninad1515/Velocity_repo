package controlstatement;

public class ifeleseifladderstatement {

	public static void main(String[] args) {
		// if else-if ladder Syntax
		//if (condition 1){
		//Statement1 - execute when condition 1 is true
		// else if(condition2){
		//statement 2-execute when condition 2 is true
		//else{
		//statement 3-executed when all condtion are false
       
		
		int marks=43;
		
	       if(marks>=65) {
	    	   System.out.println("Distinction");
	   		
	       }
	       else if(marks>=50) {
	    	   System.out.println("First class");
	   		
	       }
	       else if(marks>=40) {
	    	   System.out.println("second class");
	    	   
	   		
	       }
	       else if(marks>=35) {
	    	   System.out.println("Pass");
	   		
	       }
	       else {
	    	   System.out.println("Fail");
	   		
	       }
	}

}
