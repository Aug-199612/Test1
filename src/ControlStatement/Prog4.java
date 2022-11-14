package ControlStatement;
//NESTED IF

public class Prog4 {

	public static void main(String[] args) {
		
		String pin ="1234";
		double amountAvailable =10000;
		double amountWithdraw = 5000;
		if (pin=="1234")
		{
			System.out.println("your pin is correct");
			if(amountWithdraw<=amountAvailable)
			{
				System.out.println("please collect the cash");
			}
			else
			{
				System.out.println("insufficient amount");
			}
			
		}
		else {
			System.out.println("incorrect pin");
		}
	}
}
	
		
		
		

	