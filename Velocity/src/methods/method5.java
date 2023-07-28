package methods;

public class method5 {
	        //Non static regular method calling from same class
			public static void main(String[] args) {
				
				 System.out.println("main method started");
			
				 //1.Direct calling
				 //demo1();
				 //demo2();
				 
				 //2.Calling class name
				 //method5.demo1();
				 //method5.demo2();
				 
				 
				 //object creation
				 //syntax-classname variable name =new classname();
				 method5 object = new method5();
				 object.demo1();
				 object.demo2();
				 object.N1();
				 
				 System.out.println("main method ended");
				 

			}
		    public void demo1() {
		    	System.out.println("Non static regular method calling from same class=demo1");
		     }
		    public void demo2() {
		    	System.out.println("Non static regular method calling from same class=demo2");
		    	
		    }
		    public void N1() {
		    	System.out.println("Hello Ninad");
		    	
		    }
		}

