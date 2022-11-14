package ControlStatement;

public class Calculation {

	public static void main(String[] args) {
		// to calculate the no

		char operation='+';
		int a=20,b=30,result;
		switch (operation)
		{
		case '+':
			result=a+b;
			System.out.println("sum="+result);
			break;
		case '-':
			result=a-b;
			System.out.println("sum="+result);
			break;
		case '*':
			result=a*b;
			System.out.println("sum="+result);
			break;
		case '/':
			result=a/b;
			System.out.println("sum="+result);
			break;
		default:
			System.out.println("choose wrong operation");
		}
	
	}

}
