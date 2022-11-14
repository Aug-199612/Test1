package Inheritance;
//calling parent method into the child so inheretance occurs
// for inheretance just put static word extends..........
public class Prog1_c extends Prog1_P {

	public void childmethod()
	{
		System.out.println("this is child method");
	}

	public void bike()
	{
		System.out.println("child have bike");
	}
	
	
	public static void main(String[] args) {
		Prog1_c x=new Prog1_c();
		x.parentmethod(); //parent
		x.car(); //parent
		x.childmethod();//child
		x.bike();//child
		x.money();//perent
		
		
	}

}
