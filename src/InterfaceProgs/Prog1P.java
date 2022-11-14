package InterfaceProgs;
//Interface support multiple inheritance.
//- It is 100% abstract in nature, It is one of the object oriented principal
//- We cannot create object of interface,There is no constructor principal
//- To create object we must have implementation class


public interface Prog1P {
  
	public abstract void method1();
	void showEmpDetails();// without public abstract we can write this
	//but in interface we must have incomplete method
	public void getEmpDetails() ;
	
	//no constructor here
	//public Prog1P() {
	//	System.out.println("tata");
	//}
	
}
//class -> class :- extends
//Interface -> Interface :- extends
//Interface -> class :- implements