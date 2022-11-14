package LogicalPrograms;

public class Factorial {

	public static void main(String[] args) {

		int fact=1;//5
		for(int i=1;i<=10;i++)
		{
			fact=fact*i;
			System.out.println("factorial="+fact);
		}
		System.out.println("final  factorial  ="+fact);

	}

}
