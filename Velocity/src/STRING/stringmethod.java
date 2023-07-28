package STRING;

public class stringmethod {

	public static void main(String[] args) {
	

		
      String S5= "Automation";
      System.out.println(S5.isEmpty());
      
      String S6="";
      System.out.println(S6.isEmpty());
	
      
      String S7="Automation";
      System.out.println(S7.replace('u', 'g'));
      
      String S8= "My Name Is Ninad";
      System.out.println(S8.replaceAll("Name", "FirstName"));
      
      String S9="Velocity";
      System.out.println(S9.substring(2, 6));
      System.out.println(S9.substring(4, 8));
                //0123456789101112
      String S10="velocity coass ok";
      System.out.println(S10.indexOf('o'));
      System.out.println(S10.indexOf('o',S10.indexOf('o')+1));
      System.out.println(S10.indexOf('o',S10.indexOf('o',S10.indexOf('o')+1)+1));
      
      
      String S11="java";
      System.out.println(S11.lastIndexOf('a'));
      
      String S12="NINAD";
      System.out.println(S12.toLowerCase());
      
      String S13="ninad";
      System.out.println(S13.toUpperCase());
      
      
      String S14="         Ninad Rajaram Patil";
      System.out.println(S14);
      System.out.println(S14.trim());
      
      
    //  String S15="Ninad-Rajaram-Patil";
    //  String S16[]= S15.split("-");
      
//      for(int i=0;i < S15.length(); i++) {
    //	  System.out.println(S16[i]);
    	  
    	  
    ////	  String S1="ninad";
    //	  System.out.println(S1.length());
    //  }
	}

}
