package CollectionPrograms;

import java.util.Iterator;
import java.util.Vector;

public class IteratoCursor {
	/*We can apply iterator cursor for any collection object hence it is universal
	cursor
	- We can perform read and remove operation
	- We can move in forward direction hence it is single directional cursor*/

	public static void main(String[] args) {

		Vector a = new Vector();
		for(int i=0;i<10;i++)
		{
		a.add(i);
		}
		 System.out.println("Elements of collection A = " + a);
		 for(int i=0;i<10;i++)
		 {
		 System.out.print(a.get(i) +"\t"); // "\t" print 8 blank spaces
		 }
		 System.out.println("\niterator used");
		 Iterator i=a.iterator();
//		 while(i.hasNext()) {
//			 System.out.print(i.next()+"\t");
//		 }
		 System.out.println("\ntaking logic to get even number from this");
		 //remeber to offff first while loop,then only we get even number

		 while(i.hasNext())
		 {
		 int element = (int)i.next();
		 if(element%2==0)//==1
		 {
		 System.out.print(element + "\t");
		 }
		 else
		 {
		 i.remove();
		 }
		 }
		 
		 System.out.println("\nElements of collection A = " + a); 
		 
		 
	}

}
