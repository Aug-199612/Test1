package CollectionPrograms;

import java.util.ListIterator;
import java.util.Vector;

public class ListIteratorcursor {
	/*It is only applicable for List iterator type implementation class
	- We can perform read, remove, addition of new object and replacement operation
	- We can move forward and backward direction hence it is bidirectional cursor
	- Only applicable for list implementation classes so it is not universal cursor*/

	public static void main(String[] args) {

		Vector a = new Vector();
		for(int i=0;i<12;i++)
		{
		a.add(i);
		}
		 System.out.println("Elements of collection A = " + a);
		 for(int i=0;i<12;i++)
		 {
		 System.out.print(a.get(i) +"\t"); // "\t" print 8 blank spaces
		 }
		
		ListIterator li = a.listIterator();
//		while(li.hasNext())
//		{
//			 System.out.println(li.next());
//		}
		
		System.out.println("------------------------------------------");
		while(li.hasNext())
		{
		int value = (int)li.next();
		if(value == 5)
		li.remove();
		else if(value == 4)
		li.add(44);
		else if(value == 7)
		li.set(7777);
		}
		System.out.println(a); 
		
		System.out.println("checking birectional properties");
		
		while(li.hasNext()) 
		{
			System.out.println(li.next());
			
		}
		System.out.println(li.previous());//end loop is 11
		System.out.println(li.previous());//10
		System.out.println(li.previous());//9
	
		System.out.println("-----------");
	}

}
