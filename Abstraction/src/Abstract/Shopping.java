package Abstract;


abstract class Grocery{
	abstract void purchase();
	final void shoppingMall() {    // Normal Method also abstract class also have final methods
		System.out.println("(-*-) I am in Shopping Mall (-*-) ");
	}
}

class Milk extends Grocery{
	void purchase() {
		System.out.println("  Milk Purchased !!");
	}
}

class Snacks extends Grocery{
	void purchase() {
		System.out.println("  Snacks Purchasing done !!");
	}
}

class Fruits extends Grocery{
	void purchase() {
		System.out.println("  All Fruits Purchased !!");
	}
}

class Vegetables extends Grocery{
	void purchase() {
		System.out.println("  Vegetables Purchased !!");
	}
}

public class Shopping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("::  Shopping check list    :: ");
		System.out.println();
		
		Grocery M = new Milk();
		M.shoppingMall();
		M.purchase();	
		Grocery S = new Snacks();
		S.purchase();
		Grocery F = new Fruits();
		F.purchase();
		Grocery V = new Vegetables();
		V.purchase();
		

	}

}
