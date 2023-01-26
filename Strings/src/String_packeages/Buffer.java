  package String_packeages;

public class Buffer {

	public static void main(String[] args) {
		
		StringBuffer s0 = new StringBuffer("Life is full of hard work");
		StringBuffer s1 = new StringBuffer("Office");
		StringBuffer s2 = new StringBuffer("Saksham");
		StringBuffer s3 = new StringBuffer("school");
		StringBuffer s4 = new StringBuffer("development");
		StringBuffer s5 = new StringBuffer("business");
		StringBuffer s6 = new StringBuffer("learn java learn Algorithm and learn development");
	
		
		
		// length()Method -
		System.out.println("1. length() Method");
		System.out.println(s1.length());
		System.out.println(s6.length());
		
		// append()Method -
		System.out.println("2. append() Method");
		System.out.println(s1.append(" means lot of work"));
		System.out.println(s6.append(" and work in a good MNC"));
		
		// insert()Method -
		System.out.println("3. insert() Method");
		System.out.println(s1.insert(4,"Great"));
		System.out.println(s6.insert(26, "and work in a good MNC"));
		
		// replace()Method -
		System.out.println("4. replace() Method");
		System.out.println(s0.replace(1,4,"Great"));
		System.out.println(s6.replace(8,26, "and work in a good MNC"));
		
		// delete()Method -
		System.out.println("5. delete() Method");
		System.out.println(s0.delete(1,4));
		System.out.println(s6.delete(8,26));
		
		// reverse()Method -
		System.out.println("5. reverse() Method");
		System.out.println(s4.reverse());
		System.out.println(s2.reverse());
		
		// capacity()Method -
		System.out.println("5. capacity() Method");
		System.out.println(s3.capacity());
		s3.append("Good Morning Everyone");
		System.out.println(s3.capacity());
		
			

	}

}
