package inheritence;

public class Test2 {

	public static void main(String[] args) {
		

		Facebook f1= new Facebook();
		f1.Chatbox();
		System.out.println("**********************");
		Facebookv2 f2 = new Facebookv2();
		f2.Story();
		f2.Chatbox();
		System.out.println("**********************");
		Facebookv3 f3= new Facebookv3();
		f3.Video();
		f3.Chatbox();
		f3.Story();
		System.out.println("**********************");
		Facebookv4 f4 = new Facebookv4();
		f4.Chatbox();
		f4.Story();
		f4.Video();
		f4.Selling();
				
				
		
	}

}
