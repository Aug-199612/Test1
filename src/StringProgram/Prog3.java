package StringProgram;

public class Prog3 {

	public static void main(String[] args) {

		String str1= "potter";
		String str2 ="potter";

		String str3 ="poTTer";
		String sentence="i am an automation engineer";
		String str4="";
		
		System.out.println(str1.toLowerCase());//potter
		System.out.println(str1.toUpperCase());//POTTER
		
		System.out.println(str1.equals(str2));//true
		System.out.println(str1.equalsIgnoreCase(str3));//true
		System.out.println(str1.equals("potter1"));//false
		System.out.println(str1.equalsIgnoreCase("POTTER"));//true
		
		System.out.println(sentence.contains("am"));//true
		
		System.out.println(sentence.isEmpty());//false
		System.out.println(str4.isEmpty());//true
		
	
	}

}
