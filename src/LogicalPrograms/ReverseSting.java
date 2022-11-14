package LogicalPrograms;

public class ReverseSting {

	public static void main(String[] args) {

		String str1="muktathakre";
		String str2="";
		char ch;
		
		for(int i=str1.length()-1;i>=0;i--)
		{
			ch=str1.charAt(i);
			str2=str2+ch;
			//OR//str2=ch+str2;
			//-1 should be there otherwise will get stringoutofboundindex
			System.out.println("reverse string = "+str2);
		}
		System.out.println("final reverse string = "+str2);
	}

}
