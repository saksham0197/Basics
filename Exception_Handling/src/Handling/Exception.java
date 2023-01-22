package Handling;

public class Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   try {
				int a = 100, b = 0, c;
				c = a/b;
				System.out.println("This is try block code " +c);   // there is exception
				}
		   catch(ArithmeticException e)
		   {
			   System.out.println(e);
		   }
		   System.out.println("print outside code !!");
		   
	   }
 }  


