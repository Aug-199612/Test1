package Exception_handling;
//multiple cases what if exception occur in try catch and finally block
public class Prog4 {

	public static void main(String[] args) {

		try
		{
			System.out.println("statement 1..");
			System.out.println("statement 2.."+(10/0));
			System.out.println("statement 3..");


			
		}
		catch(ArithmeticException e)
		{

			//System.out.println("statement 2.."+(10/0));

			System.out.println("statement 4..");

		}
		finally
		{
			//System.out.println("statement 2.."+(10/0));

			System.out.println("statement 5..");
	
		}
		System.out.println("statement 6..");

	}

}
