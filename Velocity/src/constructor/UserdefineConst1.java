package constructor;

public class UserdefineConst1 {
	
	String City;
	String Village;
	int Noofhouse;
	
	
	public UserdefineConst1 (String C1, String V1,int N1) {
		
		City=C1;
		Village=V1;
		Noofhouse=N1;
		
		
		System.out.println(City+" "+Village+" "+Noofhouse);
		
	}
	

	public static void main(String[] args) {
		
		UserdefineConst1 abc= new UserdefineConst1 ("Pune","Pimpari",500);
		UserdefineConst1 abc2= new UserdefineConst1 ("Kolhapur","Kagal",300);
	
		
		
	//	System.out.println(abc.City+" "+abc.Village+" "+abc.Noofhouse);
	//	System.out.println(abc2.City+" "+abc2.Village+" "+abc2.Noofhouse);
		
		

	}

}
