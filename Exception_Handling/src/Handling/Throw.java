package Handling;

import java.util.Scanner;

class YoungerAgeException extends RuntimeException{
	
	    YoungerAgeException(String msg){
		System.out.println("your age matters for Voting !! ");
	}
}

public class Throw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your age : ");
		
		int age = s. nextInt();
		
		try {
			if(age<18) {
				throw new YoungerAgeException("you are not eligible for voting");
			}
			else{
				System.out.println("You can Vote :: Thankyou  :");			
			}		
		}
		catch(YoungerAgeException e){
			e.printStackTrace();
		}
		
		System.out.println("its run the code");

	}

}
