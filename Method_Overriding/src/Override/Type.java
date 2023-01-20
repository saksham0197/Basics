package Override;

//  TYPE OF ARGUMENTS ARE SAME 

class Kolo{
	
	void show(int a, String b) {                                            // TYPE of Arguments are same
		System.out.println("Parent class method is Called ");
	}
}

class Nalo extends Kolo {
	
	void show(String b, int a) {                                       // Type of Arguments are same
		System.out.println("Child class methos is called");
	}
}
public class Type {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Kolo k = new Kolo();
		k.show(20, "Lets play");
		
		Nalo a = new Nalo();
		a.show("Good", 22);

	}

}
