package ArraysProg;

public class Prog1 {

	public static void main(String[] args) {
	
		int marks[]= {11,12,13,14,15,18,19};
		System.out.println("size of the array ="+marks.length);
		System.out.println("second element="+marks[3]);
		//for loop
//		for(int i=0;i<7;i++)
//		{
//			System.out.println(marks[i]);
//			
//		}

		System.out.println("---------------------");
		//for each loop
		for(int result:marks)
		{
			System.out.println(result);
		}
		
		
		
	}

}
