package StringProgram;

public class Prog5 extends Prog4{

	public static void main(String[] args) {

		String sent="INDIA is my country and all are brothers and sisters.";
		
		System.out.println(sent.indexOf("I"));//0
		System.out.println(sent.indexOf("is"));//6
		System.out.println(sent.indexOf("and"));//20

		System.out.println(sent.lastIndexOf("and"));//41
		
		System.out.println(sent.startsWith("I"));//TRUE
		System.out.println(sent.startsWith("Ind"));//FALSE
		System.out.println(sent.startsWith("IND"));//TRUE

		System.out.println(sent.endsWith("I"));//FALSE
		System.out.println(sent.endsWith("sisters"));//FALSE
		System.out.println(sent.endsWith("rs."));//TRUE
		System.out.println(sent.endsWith("SISTERS."));//FALSE

		String sent2="harry potter ans goblet of fire";
		System.out.println(sent2.substring(6));//after this value it will show
		System.out.println(sent2.substring(10));
		System.out.println(sent2.substring(3,10));
		System.out.println(sent2.substring(2,7));//in between this value it will show





		
	}

}
