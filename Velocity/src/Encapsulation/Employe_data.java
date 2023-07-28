package Encapsulation;

public class Employe_data {
	
	
	private int Idnumber;
	private String EmpName;
	private int EmpAge;

	public static void main(String[] args) {
		
		Employe_data ED=new Employe_data();
		ED.setIDnumber(12345);
		ED.setEmpName("Rohit");
		ED.setEmpage(40);
		
		System.out.println("Employee name is:"+ED.getEmpName());
		System.out.println("Employee Age is:"+ED.getEmpAge());
		System.out.println("Employee ID is:"+ED.getIdnumber());


		
		
          
	}
	
	public int getIdnumber() {
		return Idnumber;
	}
	public void setIDnumber(int Idnumber) {
		this.Idnumber=Idnumber;
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String EmpName) {
		 this.EmpName=EmpName;
		
	}
	public int getEmpAge() {
		return EmpAge;
		
	}
	public void setEmpage(int EmpAge) {
		this.EmpAge=EmpAge;
	}

}
