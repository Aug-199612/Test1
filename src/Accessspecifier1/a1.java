package Accessspecifier1;

public class a1 {
	public static int a=10;
	protected static int b=20;
	private static int c=30;
	static int d=40;
	 public void display1()
	 {
		 System.out.println("A="+a);
		 System.out.println("B="+b);
		 System.out.println("C="+c);
		 System.out.println("D="+d);
	 }
			

}
////1) Private :- If we define any member of class as private then scope of that member
//remain only within the class. It cannot access from other classes
//2) Default :- In this scope of member remain only within the package. There is no
//keyword to declare method. It can't be access from other packages.
//3) Protected :- in this scope of that member remain within package only. The class
//which is present outside package can also access it by on condition i.e. inheritance
//operation
//4) Public :- Scope of these member remain throughout the project