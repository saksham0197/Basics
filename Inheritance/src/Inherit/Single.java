package Inherit;

// Single Inheritance

class Resort{     // Parent Class
	 int rooms;
	 String resturant;
	 String Swimming_Pool;
	 String Address;
	 
	 void guest(){      
		 System.out.println(" Welcome to ITC Resort !!!!");
	 }
	
}

public class Single extends Resort {   // Child Class
	
	void reception() {
		System.out.println(" Our resort have total " + rooms + "  beautiful rooms.");
		System.out.println(" we have a very good resturant that provides multiple countries food like " +resturant);
		System.out.println(" Do we have swimming pool ?  "+ Swimming_Pool );
		System.out.println(" Can I have your Id please to verify your Address ?  "+Address);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Single s = new Single();
		s.rooms = 188;
		s.resturant = "Spanish, Italic, Indian, Chinese,  Mexican.";
		s.Swimming_Pool = "Yes we have 500 m long and 5 feet deep Swimming pool.";
		s.Address = "Yeah Sure, I am from Delhi.";
		s.guest();             // we call a parent class method from child class object because of inheritance
		s.reception();
				

	}

}
