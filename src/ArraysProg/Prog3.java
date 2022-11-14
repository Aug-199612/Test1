package ArraysProg;

import java.util.Scanner;


public class Prog3 {

	public static void main(String[] args) {

		int sizeOfArray ;
		System.out.println("enter the size of array");
		Scanner r= new Scanner(System.in);
		sizeOfArray=r.nextInt();
		
			
		System.out.println("size of array given by user is="+sizeOfArray);
		 int arr[]= new int[sizeOfArray];
		System.out.println("please enter elements of arrays");
		for(int i=0;i<sizeOfArray;i++)
		{
			arr[i]=r.nextInt();
			
		}
		System.out.println("------------");
		
		System.out.println("elements are;");
		for(int result:arr)
		{
			System.out.println(result);
			
		}
		 
				
		
	}

}
