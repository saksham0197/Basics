package package_constructor;
 class NoArgu {
		int id,age;
		String name;
		
		NoArgu()
		{
			System.out.println("Constructor called without Arguments :");
		}
}	
 public class Temp {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			NoArgu n = new NoArgu();
			System.out.println(n.name);
			System.out.println(n.age);
			System.out.println(n.id);

		}

	  
	}


