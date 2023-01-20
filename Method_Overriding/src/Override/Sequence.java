package Override;

//  SEQUENCE OF ARGUMENTS IS SAME

class Solo{
	
	void show(int a, String b) {                                            // SEQUENCE of Arguments are same
		System.out.println("Parent class method is Called ");
	}
}

class Polo extends Solo {
	
	void show(int a, String b) {                                       // SEQUENCE of Arguments are same
		System.out.println("Child class methos is called");
	}
}

public class Sequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Solo k = new Solo();
		k.show(20, "Lets play");
		
		Solo a = new Polo();       // parent reference refer to child object
		a.show(22, "Do it");


	}

}
