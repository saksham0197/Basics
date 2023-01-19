package Keyword;

class Temp{
	int total_jobs = 89;
	String job_Name = "Data Analyst";
	static String Company_name = "Dotsquash"; // Static Variable
	static String Ceo = "Saksham Dubey";
	
	public static void display() {  // Static Method
		System.out.println(" Company Name : "+Company_name);
		System.out.println(" Ceo of the Company : "+Ceo);
		Temp j =  new Temp();
		System.out.println(" Job Name : " +j.job_Name);
		System.out.println(" Total jobs : "+j.total_jobs);
	}
}
public class Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Temp.display();
	}

}
