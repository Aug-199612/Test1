package ArraysProg;
//multidimensional aarays
public class Prog5 {

	public static void main(String[] args) {

		String charachter[][]=new String [2][2];
		 charachter[0][0]="harry";
		 charachter[0][1]="ron";
		 charachter[1][0]="dobby";
		 charachter[1][1]="lily";
		 
		 for( int i=0;i<2;i++)//for rows
		 {
			 for( int j=0;j<2;j++)//for column
			 {
				 System.out.print(charachter[i][j]+".."+"  ");//here dont tale ln
						 
			 }
			 System.out.println();//to the next line
		 }
	}

}
