package PatternPrograms;

public class Prog6 {

	public static void main(String[] args) {
/*
		int star=3,space=0;
		for(int row=1;row<=5;row++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int i=1;i<=star;i++)
			{
				System.out.print("*");
			}		
			star--;
			space++;
			System.out.println();
		}		
		*/
		int star=3,space=0;
		for(int row=1;row<=5;row++)
		{
			for(int i=1;i<=star;i++)
			{
				System.out.print("*");
			}	
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
				
			star--;
			space++;
			System.out.println();
		}
	}

}
