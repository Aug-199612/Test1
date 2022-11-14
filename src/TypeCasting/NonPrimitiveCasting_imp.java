package TypeCasting;

public class NonPrimitiveCasting_imp {

	public static void main(String[] args) {

		//inheritance
		NonPrimitiveCasting_chlid a =new NonPrimitiveCasting_chlid();
		a.child();
		a.parent();
		System.out.println("------------------");
		
		//UPCASTING
		NonPrimitiveCasting_parent ab =new NonPrimitiveCasting_chlid();
		//ab.child();//it is not applicable........
		ab.parent();
		System.out.println("-----------------");
		
		//DOWNCASTING
		NonPrimitiveCasting_chlid b =(NonPrimitiveCasting_chlid) new NonPrimitiveCasting_parent();
		b.child();
	    b.parent();
		System.out.println("-----------------");
		//compiletime error not occur but runtime error will occure

	}

}
