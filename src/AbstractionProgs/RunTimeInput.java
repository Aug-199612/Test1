package AbstractionProgs;

import java.util.Scanner;

public class RunTimeInput {

	public static void main(String[] args) {
		int num1=0;
		int num2=0;
		int sum=0;
		
		Scanner a =new Scanner(System.in);
		System.out.println("please enter the value of num1");
		num1=a.nextInt();
		System.out.println("please enter the value of num2");
		num2=a.nextInt();
		sum=num1+num2;
		System.out.println("THE ADDITION OF TWO NUMBER IS= "+sum);
				
	}

}
