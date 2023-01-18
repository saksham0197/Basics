package Encapsule;

class Emp_Details{
	private String Name;
	private int Id;
	private String Cont_no;
	private String Designation;
	private String Address;
	
	public void setEmp_Name(String Name) {
		this.Name = Name;
	}
	public String getEmp_Name(){
		return Name;
	}
	
	
	public void setEmp_Id(int Id) {
		this.Id = Id;
	}
	public int getEmp_Id(){
		return Id;
	}
	
	
	public void setEmp_Cont_no(String Cont_no) {
		this.Cont_no = Cont_no;
	}
	public String getEmp_Cont_no(){
		return Cont_no;
	}
	
	
	public void setEmp_Designation(String Designation) {
		this.Designation = Designation;
	}
	public String getEmp_Designation(){
		return Designation;
	}
	
	
	public void setEmp_Address(String Address) {
		this.Address = Address;
	}
	public String getEmp_Address(){
		return Address;
	}
	
	
	
}

public class Capsule {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Emp_Details e = new Emp_Details();
		
		e.setEmp_Name("Saksham");
		e.setEmp_Id(162801);
		e.setEmp_Cont_no("+91.8966456321");
		e.setEmp_Designation("System Engineer");
		e.setEmp_Address("A-188, MIG Flats, Indrapuram, Ghaziabad(201014)");
		
		System.out.println("!!! EMPLOYE DETAILS !!!");
		System.out.println();
		System.out.println("Name             "+e.getEmp_Name());
		System.out.println("Id               "+e.getEmp_Id());
		System.out.println("Contact Number   "+e.getEmp_Cont_no());
		System.out.println("Designation      "+e.getEmp_Designation());
		System.out.println("Address          "+e.getEmp_Address());
				

	}

}
