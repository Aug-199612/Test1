package PatternPrograms;

public class Prog3 {
	
	public static void main(String[] args) {
		int star=1,space=2;
		for(int row=1;row<=3;row++)
		{
			
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int i=1;i<=star;i++)
			{
				System.out.print("*");
			}
			star=star+2;
			space--;//space=space-2..asa pan deu shakto depend on pettern
	/*	      *
		     ***
		    *****
		   *******
		  *********
		 ***********    */
			System.out.println();
		}
	}

}
