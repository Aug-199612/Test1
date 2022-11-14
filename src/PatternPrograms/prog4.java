package PatternPrograms;

public class prog4 {

	public static void main(String[] args) {

		int star=1,space=8;//changes here in space should be large before
		for(int row=1;row<=5;row++)
			//changes here in row should be less than space bcz space decresred by two
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
			space=space-2;
			       /*
	          *
	        ***
	      *****
	    *******
	  *********    */
	
			System.out.println();
		}
	}

}
