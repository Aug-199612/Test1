package InterfaceProgs;

//To create object of Interface programmer need to make use of Implementation class using
//implements keyword
public class Prog1Implement {
	public static void main(String[] args) {
		
		Prog1C a = new Prog1C();
		
		a.method1();
		// a.showEmpDetails();
		a.getEmpDetails();
		System.out.println("***********************");
		a.showEmpDetails();
	}
	
	
	

}
