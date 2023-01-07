package Pattern_01;

public class RightTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = 5;
		pattern(k);		
	}
	static void pattern(int n) {
		for(int row=1;row<=n;row++){
			for(int col=1;col<=row;col++)
			{
				System.out.print("* " );
			}
			System.out.println();
		}
   }
}
