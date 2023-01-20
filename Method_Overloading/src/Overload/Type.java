package Overload;

//Type of Arguments is different

class Moon{
	
	
	void show(int workload, int capacity) {
	
		System.out.println("Total Workload is = "+workload);
		System.out.println("capacity of my daily learning in hour is  = "+capacity);
	}
	
	void show(String capacity, String workload) {
		
		System.out.println("capacity of my daily learning in hour is  = "+capacity);
		System.out.println("Total Workload is  "+workload);
	}
}

public class Type {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Moon m = new Moon();
		m.show(44,55);
		m.show("abd", "bhj");

	}

}
