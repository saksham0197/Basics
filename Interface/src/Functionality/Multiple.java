package Functionality;

interface Code{
	void doCode();   // public and abstract method
}

interface Java{
	void learnJava();  // public and abstract method
}


 class Multiple implements Code,Java    // Multiple Inheritance
 {
	 public void doCode() {
		 System.out.println("I am doing coding Daily to get good job.");
	 }
	 
	 public void learnJava() {
		 System.out.println("I am learning Java from Deep.");
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multiple m = new Multiple();
		m.doCode();
		m.learnJava();

	}

}
