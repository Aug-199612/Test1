package StringProgram;

public class Prog6 {

	public static void main(String[] args) {
		String str1="hallow";
		String str2="man";
		System.out.println(str1.concat(str2));
		System.out.println(str1);;
		System.out.println(str2);
		System.out.println(str1.concat(" ").concat(str2).concat("  ").concat("is the movie..!!!"));
		System.out.println("-----------");

		String sent="India is the ehuge country nd growth economy";
		System.out.println(sent.replace("ehuge", "huge"));
		System.out.println(sent.replace(" ", "  "));
		
		String str3="i am a it engineer         ";
		String str4="               and i am a tester";
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str3.trim());
		System.out.println(str4.trim());
		System.out.println(str3.trim()+" " +str4.trim());
		


		

		

	}

}
