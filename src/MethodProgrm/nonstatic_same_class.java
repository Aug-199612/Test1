package MethodProgrm;
                        //*object creating
public class nonstatic_same_class {
	public void m1()
	{
		System.out.println("This is method m1");
	}
	public void m2()
	{
		System.out.println("This is method m2");
	}
	public void m3()
	{
		System.out.println("This is method m3");
	}


	public static void main(String[] args) {
		//creating the object
		nonstatic_same_class abc = new nonstatic_same_class();
		//practice is class name/datatype
		//abc is object/variable/referance variable
		//new-it is used to create new memory which has some name(abc)
		//it sore the data of the class
		// Practise();object or constructor//
		
		abc.m3();
		abc.m1();
		abc.m2();
		
	}

}
