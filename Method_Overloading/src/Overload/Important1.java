package Overload;

// Can we Overload main method in java.

public class Important1 

{
	public static void main (String[] args) {
		System.out.println("1");
		
		Important1 i = new Important1();
		i.main(2);
	}
	
	public static void main (int a) {
		System.out.println(3);
	}

}



//   yes we overload java main method.