package PatternPrograms;

public class Prog1 {

	//*
	//**
	//***..this is our target
	public static void main(String[] args) {

		int star=1,space=2;
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
			star++;
			space--;
			System.out.println();
		}
		
	}

}
