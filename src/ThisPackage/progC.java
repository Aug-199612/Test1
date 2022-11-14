package ThisPackage;
//It is also used when we want to call zero parameter constructor of its own class
public class progC {
	public progC()
	{
		System.out.println(" this is the non parameterized constructor");
	}

	public progC(int a)
	{
		this();
		System.out.println(" this is the parameterized constructor");
		System.out.println("A= "+ a);
	}

	public static void main(String[] args) {
		progC v =new progC(23);
		
			

	}

}
