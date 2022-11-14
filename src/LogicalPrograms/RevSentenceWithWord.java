package LogicalPrograms;

public class RevSentenceWithWord {

	public static void main(String[] args) {

		String str= "I am an automation engirneer in tcs";
		String split[]=str.split(" ");
		char  ch;
		String strRev;
		String revSentence[]=new String[10];
		for(int i=0;i<split.length;i++)
		{
			strRev="";
			for(int j=0;j<split[i].length();j++)
			{
				ch=split[i].charAt(j);
				strRev=ch+strRev;				
			}
			revSentence[i]=strRev;
		}
		for(String value:revSentence)
		{
			System.out.print(value+"  ");
		}
	}

}
