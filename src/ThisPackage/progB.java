package ThisPackage;
//Whenever the name of instance variable and local variable are same then JVM
//confused which one is local variable and which is instance variable so to avoid this
//we should used this keyword.............
public class progB {
	int num1=1000;
	public progB(int num1)//num1=2345
	{
		System.out.println("local version og num1 ="+num1);//2345
		System.out.println("global version of num1= "+this.num1);//1000
	}
	
	public void shoaNameValue()
	{
		int num1=100;
		
		System.out.println("local version og num1 ="+num1);//100
		System.out.println("global version of num1= "+this.num1);//1000
	}
	
	public void showNum1ValueWithParameter(int num1)
	{
		
		System.out.println("local version og num1 ="+num1);//100
		System.out.println("global version of num1= "+this.num1);//1000
	}

	public static void main(String[] args) {

		progB a =new progB(2345);
		a.shoaNameValue();
		a.showNum1ValueWithParameter(9999);
		
	}

}
