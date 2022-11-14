package Constructor;//constructor overloading

public class Overloading {
	public Overloading()
	{
		System.out.println("This is zero parameter method");
	}

	public Overloading(int a)
	{
		System.out.println("This contain one int parameter = "+ a);
	}

	public Overloading(int b,int c)
	{
		System.out.println("This contain two int parameter = "+ b+" "+c);
	}
	public Overloading(double e)
	{
		System.out.println("This contain one double parameter parameter = "+ e);
	}
	public Overloading(char r)
	{
		System.out.println("This contain one charachter parameter = "+ r);
	}
	public static void main(String[] args) {
		
		Overloading a=new Overloading();
		Overloading b=new Overloading(5);

		Overloading c=new Overloading(20,20);

		Overloading d=new Overloading(2.5);
		Overloading e=new Overloading('C');
	

		
	}

}
