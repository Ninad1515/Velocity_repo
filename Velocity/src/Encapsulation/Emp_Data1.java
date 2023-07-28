package Encapsulation;

public class Emp_Data1 {

	public static void main(String[] args) {
         
		  Employe_data ed=new Employe_data();
		  ed.setEmpage(12);
		  ed.setEmpName("shree");
		  ed.setIDnumber(3333);
		  
			System.out.println("Employee name is:"+ed.getEmpName());
			System.out.println("Employee age is:"+ed.getEmpAge());
			System.out.println("Employee ID is:"+ed.getIdnumber());


	}

}
