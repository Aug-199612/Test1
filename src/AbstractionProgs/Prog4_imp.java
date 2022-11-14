package AbstractionProgs;

public class Prog4_imp {

	public static void main(String[] args) {
		System.out.println("/*here we are doing heirachical inheritance with abstraction*/");
		System.out.println("............");
		Prog4C1 A =new Prog4C1();
		A.print();
		A.show();
	
		Prog4C2 b =new Prog4C2();
		A.print();
		A.show();
		
	}

}
