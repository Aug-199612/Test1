package CollectionPrograms;

import java.util.Iterator;
import java.util.Vector;

public class hh {

	public static void main(String[] args) {

		Vector a = new Vector();
		for(int i=0;i<10;i++)
		{
		a.add(i);
		}
		Iterator i=a.iterator();
		while(i.hasNext())
		{
			
		
		int number = (int) i.next();
		if(number%2==0)
		{
			System.out.println(number);
			
		}
		else
		{
			System.out.println("odd");
		}
		
		
		}
	}

}
