package InterfaceProgs;

import java.util.Scanner;//first create scanner object then import this

public class Prog1C implements Prog1P {//using implements keyword
	String name;
	int empId;
	double salary;

	@Override
	public void method1() {
		System.out.println("interface with class");
		
	}

	@Override
	public void getEmpDetails() {
	//name = "Ron";
	 //empId = 101;
	// salary = 90000.23;
	
	Scanner z = new Scanner(System.in);
	System.out.println("plese enter employee name");
	name = z.next();
	System.out.println("plese enter employee id number");
	empId = z.nextInt();
	System.out.println("plese enter employee salary");
	salary = z.nextDouble();
	}
	
	@Override
	public void showEmpDetails() {
	System.out.println("Name of Employee = " + name);
	System.out.println("Employee id = " + empId);
	System.out.println("Salary of Employee = " + salary);
		
	//class -> class :- extends
	//Interface -> Interface :- extends
	//Interface -> class :- implements

		
	}

}
