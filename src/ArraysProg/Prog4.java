package ArraysProg;

import java.util.Arrays;

public class Prog4 {

	public static void main(String[] args) {

		String charchter[] =new String[6];
		charchter[0]="harry";
		charchter[1]="ron";
		charchter[2]="luna";
		charchter[3]="dobby";
		charchter[4]="albus";
		charchter[5]="lily";
	
		for(int i=0;i<6;i++)//i should be less than size
		{
			System.out.println(charchter[i]);
			
		}
		System.out.println("-------------");
		for(String value:charchter)
		{
			System.out.println(value);
			
		}
		System.out.println("------sorted charchter-------");
		//to make it alphabetical order
		
		Arrays.sort(charchter);//imported sort method;
		for(String value:charchter)
		{
			System.out.println(value);
			
		}
		
		System.out.println("------reversed charchter-------");
		//to make it reverse alphabetical order
		for(int i=5;i>=0;i--)//i should be 5 with 0 equals greater then
		{
			System.out.println(charchter[i]);
			
		}
		}

}
