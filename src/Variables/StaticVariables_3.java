package Variables;

public class StaticVariables_3 {
	static int a=10;
	int b=10;
	public void show()
	{
		a++;
		b++;
		System.out.println("A=" +a +" "+ "B= "+b);
	}
	public static void main(String[] args) {
	 StaticVariables_3 a=new  StaticVariables_3();
	 a.show();
	 StaticVariables_3 b=new  StaticVariables_3();
	 b.show();
	 StaticVariables_3 c=new  StaticVariables_3();
	 c.show();
	}

}
