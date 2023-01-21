package Inherit;

// Multiple Inheritance

class Car{     // Parent Class
	String car;
	String Direction; 
	 void carTaker(){      
		 System.out.println(" Hi sir, Can I park your car ? "+ car);
	 }
	
}

class Resort_New extends Car{     // Parent Class
	 int rooms;
	 String resturant;
	 String Swimming_Pool;
	 String Address;
	 
	 void guest(){    
		 System.out.println(" Where is the reception ? "+Direction);
		 System.out.println(" Welcome to ITC Resort !!!!  How may I help you !!");
	 }
	
}

public class Multiple extends Resort_New {   // Child Class
	
	void reception() {
		System.out.println(" Our resort have total " + rooms + "  beautiful rooms.");
		System.out.println(" we have a very good resturant that provides multiple countries food like " +resturant);
		System.out.println(" Do we have swimming pool ?  "+ Swimming_Pool );
		System.out.println(" Can I have your Id please to verify your Address ?  "+Address);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Multiple s = new Multiple();
		s.car = "yes please.";
		s.Direction = "Go down stairs and take left.";
		s.rooms = 188;
		s.resturant = "Spanish, Italic, Indian, Chinese,  Mexican.";
		s.Swimming_Pool = "Yes we have 500 m long and 5 feet deep Swimming pool.";
		s.Address = "Yeah Sure, I am from Delhi.";
		s.carTaker();
		s.guest();             // we call a parent class method from child class object because of inheritance
		s.reception();

	}

}
