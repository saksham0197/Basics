package Pattern_01;

public class Diamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = 5;
		pattern(k);		
	}
	static void pattern(int n) {
		for(int row=0;row<=n*2;row++){
			int totalColsInRow = row > n ? 2 * n - row : row;
			
			int noOfSpaces = n - totalColsInRow;
			for(int s=0; s<noOfSpaces;s++) {
		        System.out.print(" ");
			}
			
			for(int col=0;col<=totalColsInRow;col++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}	

	}

}
