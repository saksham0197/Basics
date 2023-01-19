package Implements;

interface Vehicle{
	
	void gearChange(int a);     // Interface have PUBLIC and ABSTRACT Methods
	void speedUp(int a);    // Interface have PUBLIC and ABSTRACT Methods
	void breaks(String a);   // Interface have PUBLIC and ABSTRACT Methods
}

class Bike implements Vehicle{   // In normal class that Implements Interface we can create any type of variable and methods
	
    int gear;
	int speed;
	String breaks;
	
	public void gearChange(int gear) {
		this.gear = gear;
	}
	public void speedUp(int increment) {
		speed = speed + increment;
	}
	public void breaks(String breaks) {
		this.breaks = breaks;
	}
	
	public void printBikeStatus() {
		System.out.println("Speed = " +speed + " Gear used = "+ gear + " Break used = "+ breaks);
	}
}

class Car implements Vehicle{
	
    int gear;
	int speed;
	String breaks;
	
	public void gearChange(int gear) {
		this.gear = gear;
	}
	public void speedUp(int increment) {
		speed = speed + increment;
	}
	public void breaks(String breaks ) {
		this.breaks = breaks;
	}
	
	public void printCarStatus() {
		System.out.println("Speed = " +speed + " Gear used = "+ gear + " Break used = "+ breaks);
	}
}

public class Results {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike b = new Bike();
		System.out.println("!!  BIKE  !!");
		b.gearChange(4);
		b.speedUp(55);
		b.breaks("Yes");
		b.printBikeStatus();
		
		Car c = new Car();
		System.out.println("!!  CAR  !!");
		c.gearChange(6);
		c.speedUp(100);
		c.breaks("NO");
		c.printCarStatus();

	}

}