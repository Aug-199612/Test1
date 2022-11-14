package TypeCasting;

public class PrimitiveCasting {

	public static void main(String[] args) {
		//IMPLICIT CASTING
		int a=10;
		System.out.println("value of A is="+a);
		double b=a;
		System.out.println("double value B is="+b);
		// DATA IS NOT ADD BUT SHOWS DECIMAL AFETRWORDS
		
		System.out.println("----------------");
		
		//EXPLICIT CASTING
		double c=100.923;
		System.out.println("double C= "+c);
		int d= (int) c;
		System.out.println("int D= "+d);
		//DATA LOSS IS HAPENING HERE
		
		/*c) Boolean casting
		It is consider to be incompatible type because boolean is unique data type where
		information is already provided inside it (TRUE/FALSE)
		- For Boolean data type programmer cannot provide additional information so it is
		incompatible.*/
	}
}
