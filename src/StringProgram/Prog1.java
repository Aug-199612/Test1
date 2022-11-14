package StringProgram;

public class Prog1 {

	public static void main(String args[] ) {

		String string1="harry abab nko jau";
		//int length=string1.length();
		//System.out.println("lenth="+length);
		//System.out.println(string1);
		//System.out.println(string1.indexOf("abab"));
		//System.out.println(string1.indexOf("mau"));
		//System.out.println(string1.contains("nko"));
		
		System.out.println(string1.startsWith("harry "));
		System.out.println(string1.endsWith("au"));
		string1.concat("lily");
		System.out.println(string1);;
		string1=string1.concat(" James Lily Potter");
		System.out.println(string1);
		System.out.println("-------------");
		//here we can not directly do modify in the object
		//need to assign valvue into similar dataype then we can modify
		
		StringBuffer sb1 =new StringBuffer("Albus ");
		System.out.println(sb1);
		sb1.append("Percival Wulfric Brian Dumbledoor");
		System.out.println(sb1);
		System.out.println("abc  "+"xyz  "+"mno");
		
		//without assining valuve we pwrform modification

         // apend and concate do ssame thing like comine two entity
		//in stringbuffer we directly modify nd do changes into the object
		
		
	}

}
