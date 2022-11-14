package MethodProgrm;

public class Smsc {
	
	
	public static void show()
	{
		System.out.println("This is show method");
	}
	
	public static void display()
	{
		System.out.println("This is display method");
	}
	
	public static void print()
	{
		System.out.println("This is print method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		show();
		display();
		print();
		
			System.out.println("This is main method");
		}
		
	}

    //static method call from the same class
	//first we create static method other than main
	//then after taking main methoad we can call the static method
	//we get output as per we call the method,its sequential
