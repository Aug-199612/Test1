package SuperKeyword;
//we want to call superclass variables
public class p2 extends p1{
	int a=20;
	public void show() {
		
		System.out.println("clild class A ="+a);; //20
		System.out.println(" parent class B="+b);//30
		System.out.println(" parent clas  A="+super.a);//10);
		
	}

}
