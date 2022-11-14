package PatternPrograms;

public class prog11 {

	public static void main(String[] args) {

		int star=7,space=0,row;
		for(row=1;row<=7;row++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}

			for(int i=1;i<=star;i++)
			{
				System.out.print("@");
			}
			
			System.out.println();
			if(row<=3)
			{
				star=star-2;
				space++;
			}
			else
			{
				star=star+2;
				space--;
			}
	}
	}

}
