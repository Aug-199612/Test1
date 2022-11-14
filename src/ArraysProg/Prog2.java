package ArraysProg;

public class Prog2 {

	public static void main(String[] args) {

		int marks[]=new int[15];
		//size=15...print 0-14 elements of arrays
		marks[0]=10;
		marks[1]=20;

		marks[2]=30;
		marks[3]=40;
		marks[4]=50;
		marks[5]=60;//6 to 14 not assigning any values
		
		System.out.println(marks[3]);//40
		System.out.println(marks[0]);//10
		System.out.println(marks[6]);//0...not assign any value
		System.out.println(marks[14]);//0...not assign any value
		System.out.println(marks[15]);//[array index out of bounds exception]

		System.out.println(marks[30]);//beyond also exception occure

		
				
	}

}
