package ThisPackage;
 //This keyword refer to current object inside the method or constructor
public class progA {
	public void showThisValue()
	{
		System.out.println(this);
	}

	public static void main(String[] args) {

		progA xyz =new progA();
		System.out.println(xyz);
		xyz.showThisValue();
		progA abc =new progA();
		System.out.println(abc);
		abc.showThisValue();
	}

}
