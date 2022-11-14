package Variables;

public class StaticVariables_2 {

	static int num2=200;
	public static void main(String[] args) {
		System.out.println("value of num1="+StaticVariables_1.num1);
		//we can call global variable from different class to other class in main method
		System.out.println("value of num2="+num2);
		

	}

}
