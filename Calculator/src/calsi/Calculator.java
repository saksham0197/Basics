package calsi;
import java.io.*;
import java.lang.Math;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		double num1, num2;
		double ans;
		char op;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Numbers:-");
		
		num1 = sc.nextDouble();
		num2 = sc.nextDouble();
		
		System.out.print("Enter the operator (+ , - , *, / ) :-  ");
		
		op = sc.next().charAt(0);
		ans = 0;
		
		switch(op){
		case '+' : ans = num1 + num2;
		break;
		case '-' : ans = num1 - num2;
		break;
		case '*' : ans = num1 * num2;
		break;
		case '/' : ans = num1 / num2;
		break;
		
		default : System.out.println("ERROR !!! You Enter a Wrong OPERATOR !!");
		break;
		}
		System.out.println();
		System.out.println("YOUR RESULT IS :-->");
		
		System.out.println(num1+"  "+op+"  "+num2+"  =  " +ans);
		}
		
		
}

	
