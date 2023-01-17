package package_constructor;
class Teach{
	int age;
	long id;
	String name;
	
	Teach(String name, int age, long id)
	{
		this.name = name;
		this.age = age;
		this.id = id;
	}
}
public class Parameterized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teach p = new Teach("Saksham", 26, 16122278);
		System.out.println("Name is : "+p.name);
		System.out.println("Age is : "+p.age);
		System.out.println("ID is : "+p.id);
	

	}

}
