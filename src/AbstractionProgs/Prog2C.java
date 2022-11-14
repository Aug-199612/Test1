package AbstractionProgs;

public class Prog2C extends Prog2P{
	// do not write abstract here bcz we need to comlete that method here
	//only extend this class with parents
	//just put cursor on prog2c and click first option

	@Override
	public void display() {
		System.out.println("This is display method of Parent class");
	
	}

	@Override
	public void show1() {
	System.out.println("Show1 method");
	}
	@Override
	public void show2() {
	System.out.println("Show2 method");
	}
	@Override
	public void show3() {
	System.out.println("Show3 method");
	}
	public void child()
	{
	System.out.println("This is child method");
	}
}
