package LogicalPrograms;

public class PrimeNumber {

	public static void main(String[] args) {

		int num=11;
		int count = 0;
		for(int i=2;i<num;i++)
		{
			if(num%2==0)
			{
				count++;
				break;
			}
			
		}
		if(count==1)
			System.out.println("not a prime number");
		else
			System.out.println("it is prime number");
	}

}
