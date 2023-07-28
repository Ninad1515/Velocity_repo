package methods;

public class method12 {

	public static void main(String[] args) {
		
		method12.Studentinfo("Ninad", 20, 'A', 22.78f);
		method12.Studentinfo("Papu", 14, 'D', 90.56f);
		method12.Studentinfo("Shree", 45, 'C', 67.87f);
		method12.Studentinfo("Harshu", 23, 'A', 99.87f);

	}
	
	public static void Studentinfo(String Studentname,int Rollno, char Grade, float Percantage ) {
		System.out.println("Student Name="+Studentname+"___"+"Roll no="+Rollno+"___"+"Grade="+Grade+"___"+"Percantage="+Percantage);
	}

}

