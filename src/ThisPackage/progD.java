package ThisPackage;
//It is also used to call parameterized constructor of its own class
public class progD {

	public progD()
	{
		this(20);
		System.out.println(" this is the non parameterized constructor");
	}

	public progD(int a)
	{
		System.out.println(" this is the parameterized constructor");
		System.out.println("A= "+ a);
	}

	public static void main(String[] args) {
		progD b =new progD();
		
		

	}

}
