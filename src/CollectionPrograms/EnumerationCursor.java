package CollectionPrograms;
import java.util.Enumeration;
import java.util.Vector;

public class EnumerationCursor {
	/*Applicable only for legacy class hence it is not universal cursor
- We can only perform read operation
- We can only move in forward direction
- It contain two method*/

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

		
	 System.out.println("\nRead the objects of collection using Enumeration Cursor");
	 
	 Enumeration ee=a.elements();
	 System.out.println("-------------BY USING WHILE LOOP---------------");
	 while(ee.hasMoreElements())
	 {
		 System.out.print(ee.nextElement()+"\t");
		 
	 }
	// System.out.println("\n"+"------------------BY USING for LOOP-------------------------");

//	 for(;ee.hasMoreElements();) {
//		 //whwn while is there,should not use for loop
//		 //bcz hasmoreelements show boolen...already used that methods so nothing can be show afterthat
//		 
//		 System.out.print(ee.nextElement()+"\t");
//	 
//	 }
	 System.out.println("\n-----------------BY USING FOR EACH LOOP-------------------------");

	 for(Object value:a)
	 {
		 System.out.print(value+"\t");
	 }
	 
	 
	}

}
