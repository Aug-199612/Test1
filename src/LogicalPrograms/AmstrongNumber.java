package LogicalPrograms;

public class AmstrongNumber {
	//Armstrong number is a number that is equal to the sum of cubes of its digits
//example 0, 1, 153, 370, 371 and 407 are the Armstrong numbers
	public static void main(String[] args) {

		int num=407,sum=0;
		int num1=num;
		while(num>0)
		{
			int temp=num % 10;
			sum=sum+(temp  *temp * temp);
			num=num/10;			
		}
		System.out.println(sum);
		if(num1==sum)
		
			System.out.println("amstrong");
		
		else
		
			System.out.println("not a amstrong number ");
		
	}

}
