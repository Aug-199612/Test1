package InterfaceProgs;

public class Prog6C1 implements Prog6P {
	@Override
	public void show1() {
	System.out.println("override show1 in C1");
	}
	@Override
	public void show2() {
	System.out.println("override show2 in C1");
	}
	@Override
	public void show3() {
	System.out.println("override show3 in C1");
	}
	@Override// for default override is neccesory
	public void show4() {
	System.out.println("override show4 in C1");
	}
	// @Override//if we uncomment override that time error will come
	public  void show5()//this will execute
	{
	System.out.println("override show5 in C1");
	}
	public void tta() {
		// TODO Auto-generated method stub
		System.out.println("chalo bye");
	}
	 
	

}
