package Keyword;

class Jobs{
	int total_jobs;
	String job_Name;
	static String Company_name = "Dotsquash"; // Static Variable
	static String Ceo = "Saksham Dubey";
	
	void display() {
		System.out.println("Company Name : "+Company_name);
		System.out.println("Ceo of the Company : "+Ceo);
		System.out.println("Job Name : "+job_Name);
		System.out.println("Total jobs : "+total_jobs);
	}
}
public class Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jobs v = new Jobs();
		v.total_jobs = 108;
		v.job_Name = "Data Analyst";
		v.display();
		

	}

}
