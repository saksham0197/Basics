package Overload;

// Sequence Of Arguments is different

class Down{
	
	
	void show(String workload, int capacity) {
	
		System.out.println("Total Workload is  "+workload);
		System.out.println("capacity of my daily learning in hour is  = "+capacity);
	}
	
	void show(int capacity, String workload) {
		
		System.out.println("capacity of my daily learning in hour is  = "+capacity);
		System.out.println("Total Workload is  "+workload);
	}
}

public class Sequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Down d = new Down();
		d.show("Very High",80);		


	}

}
