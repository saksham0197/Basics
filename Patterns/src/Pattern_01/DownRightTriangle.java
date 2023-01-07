package Pattern_01;

public class DownRightTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = 5;
		pattern(k);		
	}
	static void pattern(int n) {
		for(int row=1;row<=n;row++){
			for(int col=1;col<=n-row+1;col++)
			{
				System.out.print("* " );
			}
			System.out.println();
		}

	}

}
