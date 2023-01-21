package Inherit;

// Hierarchical Inheritance

class Shipra_Mall{   // Parent Class
	int totalShops;
	String Address;
	
	void mall() {
		System.out.println("~ Welcome to Shipra mall ~");
		System.out.println(" Total shops in our mall is = "+totalShops);
		System.out.println(" Our Address is  "+Address);
	}
}

class Reebok extends Shipra_Mall{   // Child Class Inherit parent class.
	void reebokStore() {
		System.out.println("~ Shop no - 128, REEBOK ~");
		System.out.println(" We have a new collection of shoes at 40% discount in our Reebok Store.");
	}
	
}

class Levis extends Shipra_Mall{    // Child Class Inherit parent class.
	void levisStore() {
		System.out.println("~ Shop no - 129, Levi's ~");
		System.out.println(" Great Sale on jeans 20% on single and 50% on three pieces in our Levi's Store.");
	}
}

public class Hierarchical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Reebok r = new Reebok();
		r.totalShops = 557;
		r.Address = "Indrapuram Ghaziabad(201014)";
		r.mall();
		r.reebokStore();
		
		Levis s = new Levis();
		s.levisStore();
		

	}

}
