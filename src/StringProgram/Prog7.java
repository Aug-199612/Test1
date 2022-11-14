package StringProgram;

public class Prog7 {

	public static void main(String[] args) {

		String sentence="i am working as a automation engineer in velocity";
		String splitsentence[]=sentence.split(" ");
		
//		for(int i=splitsentence.length-1;i>=0;i--)
//		{
//			System.out.println(splitsentence[i]+"  ");
//			
//		}
//		System.out.println("\n****************");
		for(String value:splitsentence)
		{
			System.out.println(value);
			
		}
		System.out.println("\n****************");
		System.out.println("Reverse sentence");
		for(int i=splitsentence.length-1;i>=0;i--)
		{
			System.out.println(splitsentence[i]+"  ");
			
		}
		
		System.out.println("*******");
		String date="20-08-2022";
		//String splitdate[]=date.split("");
		String splitdate[]=date.split("-");
		for(String value1:splitdate)
		{
			System.out.println(value1);
			
		}
	}
	

}
