package StringProgram;

public class Prog4 {

	public static void main(String[] args) {

		String str1="potter";
		String str2="potter";
		String str3="POTTER";
		
		int a=10,b=20;
		String str4=new String("Potter");
		String str5=new String("Potter");
		
		System.out.println(a==b);//false
		System.out.println(str1==str2);//true
		System.out.println(str4==str5);//false,compare operator cnot work out
		System.out.println(str4.equals(str5));//true//with help of new keyword so goes into
		//non constant pool area so it requires method cannot do direct compare

		String name="bhul bhulaiya";
		System.out.println(name.charAt(8));
		System.out.println(name.charAt(2));
		System.out.println(name.charAt(0));
		System.out.println(name.charAt(4));
		System.out.println(name.charAt(14));
		System.out.println(name.charAt(12));


		


	}

}
