package LogicalPrograms;

import java.util.Scanner;

public class FibbonacciSeries {

	public static void main(String[] args) {

		int term;
		int a=0,b=1,c;
		
		System.out.println("please enter the term");//8
		Scanner r=new Scanner(System.in);
		term=r.nextInt();
		for(int i=1;i<=term;i++)
		{
			System.out.println(a+"  ");
			c=a+b;
			a=b;
			b=c;
		}
	}

}
