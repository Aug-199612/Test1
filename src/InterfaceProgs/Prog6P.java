package InterfaceProgs;

public interface Prog6P {
	public abstract void show1();
	abstract public void show2();
	void show3();
	public default void show4() {
		//need to override in one of class method
	System.out.println("Show4 in Interface");
	}
	public static void show5()//as static method include so need to not write override
	{
	System.out.println("Show5 in Interface");
	}
	public static void tta() {
		System.out.println("555");
	}
	
	//Java 7 :-with 100% abstrction
	//Java 8 :- Changes oocurs

}
