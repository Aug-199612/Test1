package LogicalPrograms;

import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
		char ch;
		System.out.println("enter charachter");
		Scanner r=new Scanner(System.in);
		ch=r.next().charAt(0);
		
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
		System.out.println("enter charachter is vowel");
		}
		else
		{
		System.out.println("enter charachter is cansonant");
		}
	}

}
