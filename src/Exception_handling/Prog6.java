package Exception_handling;

public class Prog6 {//multiple catch block 
	// we can do multiple catch block as they serach for the match exception happened 
	//then execute that match exception ,if doesnt then throwable catch block get executed

	public static void main(String[] args) {

		try
		{
			System.out.println(10/0);
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e1)
		{
			System.out.println(e1);
		}
		catch(ArithmeticException e2)
		{
			System.out.println(e2);
		}
		catch(Throwable e3)//throwable means we dont know the exact exception occured
		{
			System.out.println(e3);
		}
		System.out.println("Program end");
	}

}
