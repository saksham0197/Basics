package Override;

//   Number of Arguments is same.

class Zolo{
	
	void show(int a) {                                            // Number of Arguments are same
		System.out.println("Parent class method is Called "); 
	}
}

public class Number extends Zolo {
	
	void show(String b) {                                       // Number of Arguments are same
		System.out.println("Child class methos is called");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Number n  = new Number();
		n.show("10");
		
		Zolo z = new Zolo();
		z.show(20);
		

	}

}
