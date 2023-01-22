package Handling;

public class Finally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 try {
				int a = 100, b = 4, c;
				c = a/b;
				System.out.println("This is try block code " +c);  // no exception
				}
		 catch(ArithmeticException e)
		   {
			   System.out.println(e);
		   }
		 finally{
			 System.out.println("Finally always Execute without worry about exception");
		 }
		   System.out.println("print outside code !!");

	}

}
