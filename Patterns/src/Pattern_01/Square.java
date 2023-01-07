package Pattern_01;

public class Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = 5;
		pattern(k);		
	}
	static void pattern(int n) {
		for(int row=1;row<=n;row++){
			for(int col=1;col<=n;col++)
			{
				System.out.print("* " );
			}
			System.out.println();
		}

	}

}
