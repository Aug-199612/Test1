package AbstractionProgs;
//by group
public class Prog1C extends Prog1P {
 
	int a=25;
	int b=25;
	int c=a+b;
	@Override
	public void addition(int a, int b) {
		c=a+b;
		
		System.out.println("the addition of the two no is ="+c);
	}
	public void addition()
	{
		c=a+b;
		System.out.println("value of C is ="+c);
	}
	
	public Prog1C()
	{
		int d=c;
		System.out.println("the value of D is same as C="+d);
		}
	@Override
	public void addition(int x, char name) {
		
		System.out.println("this is overload method ");
		System.out.println("age is = "+x+ " and name is "+name);
	}
	}

