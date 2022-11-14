package LogicalPrograms;

public class ReverseSentence {

	public static void main(String[] args) {

		String sentence="i am software test enginner in velocity from 2021";
		String split[]=sentence.split(" ");
		System.out.print("original string =");
		for(String value: split)
		{
			System.out.print(value+" ");
		}
		System.out.print("\nreverse dtring =");
		for(int i=split.length-1;i>=0;i--)//arrayoutofboundindex
		{
			System.out.print(split[i]+"   ");
		}
		System.out.println();
		System.out.println(split[0]);
		System.out.println(split[1]);
		System.out.println(split[2]);
		System.out.println(split[3]);
		System.out.println(split[4]);
		System.out.println(split[5]);
		System.out.println(split[6]);
		//System.out.println(split[7]); ArrayIndexOutOfBoundsException
	}

}
