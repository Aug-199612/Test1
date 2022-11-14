package Constructor;

public class Constructor_call {

	static int num1,num2;
	public Constructor_call()
	{
		num1=10;
		num2=20;
		
	}
	public static void main(String[] args) {

		System.out.println("num1 = "+num1);
		System.out.println("num2 = "+num2);
		System.out.println("after creacting object constructor get called nd data member get initialize");
		Constructor_call ab=new Constructor_call();
		System.out.println("num1 = "+num1);
		System.out.println("num2 = "+num2);



	}

}
