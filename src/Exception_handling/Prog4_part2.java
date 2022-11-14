package Exception_handling;

public class Prog4_part2 {
	public static void main(String[] args) {
		
		
		try
		{
			System.out.println("statement 1......");
			System.out.println("statement 2.."+(10/0));//exception occure
			System.out.println("statement 3..");//not execute because exception occure above


			
		}
		catch(NullPointerException e)//but does not handle by catch,,
		//NullPointerException and arithmeticexception are different so doesnt match
		//so statement in catch block does not execute
		{

			//System.out.println("statement 2.."+(10/0));

			System.out.println("statement 4..");

		}
		finally   //going to execute whenever exception occur or not
		{
			System.out.println("statement 2.."+(10/0));
			//if execption occur here too,,then finally block also get skipped

			System.out.println("statement 5..");
	
		}
		System.out.println("statement 6..");//not execute because exception can not handled

	}

}
