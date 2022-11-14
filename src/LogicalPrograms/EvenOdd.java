package LogicalPrograms;

import java.util.Scanner;

public class EvenOdd {
	
	         //123456%10=6
			//123456/10=12345
			//112%113=112
			//113%112=1
	public static void main(String[] args) {

		int num;
		System.out.println("please enter the number");
		Scanner r=new Scanner(System.in);
		num=r.nextInt();
		if(num%2==0)
		{
			System.out.println(num+" is the even number");
		}
		else
		{
			System.out.println(num+" is the odd number");

		}
	}

}
