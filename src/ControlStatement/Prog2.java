package ControlStatement;
  ///ELSE IF
public class Prog2 {

	public static void main(String[] args) {
		//WAP to show student passed in which class
		int marks;
		marks=75;
		if(marks>=35&& marks<=59)
		{
			System.out.println("student is passed in the SECOND CLASS");	
		}
		else if(marks>=60&& marks<=74)
		{
			System.out.println("student is passed in the FIRST CLASS");
		}
		else if (marks>=75&& marks<=89)
		{
			System.out.println("student is passed in the DISTINCTION");
		}
		else if (marks>=90&& marks<=100)
		{
		System.out.println("student is passed in the MERIT");
		}
		else if (marks>100)
		{
		System.out.println("WRONG INPUT");
		}
		else
		{System.out.println("student is FAILED");
		
		}
		
	}
	}





