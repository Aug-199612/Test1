package Exception_handling;

public class Prog5 {//multiple try block:..multiple try block can not be use

	public static void main(String[] args) {

		System.out.println("Program started");
//		try
//		{
//			System.out.println();
//			
//		}
		try
		{
			System.out.println(10/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println("can not devide any number by 0  "+e);
		}
		System.out.println("-------------");
		String str =null;
		try
		{
			System.out.println(str.toLowerCase());
			
		}
		catch(NullPointerException e1)
		{
			System.out.println("can not perform lower case operation on null  "+e1);
			
		}
		System.out.println("Program end here");
	}

}
