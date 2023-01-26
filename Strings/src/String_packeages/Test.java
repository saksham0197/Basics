package String_packeages;

public class Test {

	public static void main(String[] args) {
		
		String s0 = "";
		String s1 ="Office";
		String s2 ="School";
		String s3 ="Saksham";
		String s4 = "Office";
		String s5 = "Hello all I am a developer";
		String s6 = "a";
		String s7 = "A";
		String s8 = "w";
		String s9 = "10";
		String s10 = "20";
		String s11 = "SAKSHAM";
		String s12 = "learn java learn Algorithm and learn development";
		
		
		// equals()Method -
		System.out.println("1. equals() Method");
		System.out.println(s1.equals(s4));
		System.out.println(s1.equals(s3));
		
		// length()Method  -
		System.out.println("2. length() Method");
		System.out.println(s1.length());
		System.out.println(s5.length());
		
		// isEmpty()Method  -
		System.out.println("3. isEmpty() Method");
		System.out.println(s0.isEmpty());
		System.out.println(s6.isEmpty());
		
		// trim()Method  -
		System.out.println("4. trim() Method");
		System.out.println(s0.trim() + "Looks Good");
		System.out.println(s5.trim() + "Alright");
		
		// equalsIgnoreCase()Method  -
		System.out.println("5. equalsIgnoreCase() Method");
		System.out.println(s0.equalsIgnoreCase(s3));
		System.out.println(s3.equalsIgnoreCase(s11));
		
		// compareTo()Method and compareToIgnoreCase() Method -
		System.out.println("6. compareTo() and compareToIgnoreCase() Method");
		System.out.println(s6.compareTo(s7));
		System.out.println(s6.compareToIgnoreCase(s7));
		System.out.println(s6.compareToIgnoreCase(s8));
		
		// concat()Method  -
		System.out.println("7. concat() Method");
		System.out.println(s4.concat(s3));
		System.out.println(s9.concat(s10));
		
		// join()Method  -
		System.out.println("8. join() Method");
		System.out.println(s4.join("+",s2,s3));
		System.out.println(s9.join("?",s11,s5));
		
		// subSequance()Method  -
		System.out.println("9. subSequence() Method");
		System.out.println(s5.subSequence(2,7));
		System.out.println(s3.subSequence(2,7));
		
		// subString()Method  -
		System.out.println("10. subString() Method");
		System.out.println(s5.substring(4,10));
		System.out.println(s3.substring(4));
		
		// replace()Method  -
		System.out.println("11. replace() Method");
		System.out.println(s5.replace("am", "was"));
		System.out.println(s12.replace("learn", "Study"));
		
		// replaceFirst()Method  -
		System.out.println("12. replaceFirst() Method");
		System.out.println(s5.replaceFirst("am", "was"));
		System.out.println(s12.replaceFirst("learn", "Study"));
		
		// replaceAll()Method  -
		System.out.println("13. replaceAll() Method");
		System.out.println(s5.replaceAll("am", "was"));
		System.out.println(s12.replaceAll("learn", "Study"));
		
		// indexOf()Method  -
		System.out.println("14. indexOf() Method");
		System.out.println(s5.indexOf("am"));
		System.out.println(s12.indexOf("learn"));
		
		// lastIndexOf()Method  -
		System.out.println("15. lastIndexOf() Method");
		System.out.println(s5.lastIndexOf("am"));
		System.out.println(s12.lastIndexOf("learn"));
		
		// charAt()Method  -
		System.out.println("16. charAT() Method");
		System.out.println(s5.charAt(12));
		System.out.println(s12.charAt(31));
		
		// contains()Method  -
		System.out.println("17. contains() Method");
		System.out.println(s5.contains("am"));
		System.out.println(s12.contains("Learn"));
		
		// startsWith()Method and endsWith()Method  -
		System.out.println("18. startsWith()Method and endsWith()Method ");
		System.out.println(s5.startsWith("H"));
		System.out.println(s12.startsWith("Learn"));
		System.out.println(s5.endsWith("r"));
		System.out.println(s12.endsWith("devolpment"));
		
		// toUpperCase()Method and toLowerCase()Method  -
		System.out.println("19. toUpperCase()Method and toLowerCase()Method");
		System.out.println(s5.toUpperCase());
		System.out.println(s12.toUpperCase());
		System.out.println(s5.toLowerCase());
		System.out.println(s12.toLowerCase());
		
		// valueOf()Method  -
		int a = 200;
		int b = 300;
		String x = String.valueOf(a);
		String y = String.valueOf(b);
		System.out.println("20. valueOf() Method");
		System.out.println(x+y);
		
		// toCharArray()Method  -
		char[] c = s3.toCharArray();
		System.out.println("21. toCharArray() Method");
		System.out.println(c);
		
		
		
			

	}

}
