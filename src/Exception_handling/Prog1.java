package Exception_handling;

public class Prog1 {

	public static void main(String[] args) {

		int a=10,b=0;
		System.out.println("this is start of Programs");
		try
		{
			System.out.println(a/b);//10/0=infinity
			
		}
		//catch(Exception abc){}//aisa bhi likh saktye
		catch(Exception abc)
		{
			System.out.println("Exception is occure and handled..."+" "+abc);
		}
		System.out.println("this is end of Programs");

	}

}
