package Overload;

// Number of Arguments are Different

class Load{
	
	
	void show(int capacity) {
	
		System.out.println("capacity of my daily learning in hour is  = "+capacity);
	}
	
	void show(int capacity, String workload) {
		System.out.println("Capacity of my daily learning in hour is  = "+capacity);
		System.out.println("Total Workload is  "+workload);
	}
}

public class Over {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Load a = new Load();
		a.show(99,"Very High");		

	}

}
