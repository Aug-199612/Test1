package CollectionPrograms;

import java.util.HashSet;

public class Hashset {

	public static void main(String[] args) {

		
		HashSet a1 =new HashSet();
		a1.add(null);
		a1.add(1);
		a1.add(2);
		a1.add(3);
		a1.add(4);
		a1.add(10);
		a1.add(100);
		a1.add('S');
		a1.add(125);		
		a1.add("haha");
		System.out.println("the elemnts are ="+a1);//random place occured
		System.out.println("-------------------------------------");

		HashSet hs1 = new HashSet();
		hs1.add(10);
		hs1.add(1);
		hs1.add(4);
		System.out.println(hs1);
		hs1.add(10);//do not get duplicate values
		hs1.add(11);
		System.out.println(hs1);
		System.out.println("-------------------------------------");

		
		HashSet a = new HashSet(); //IC = 16 and load factor =
		//.75/75%
		HashSet b = new HashSet(100); //IC = 100 and load factor =
		//.75/75%
		HashSet c = new HashSet(120,90); //IC = 120 and load factor =
		//.90/90%
		HashSet d = new HashSet(a);
		a.add("Velocity");
		a.add('a');
		a.add("AB");
		a.add("E");
		a.add(null);
		a.add(100);
		System.out.println("Element of A = " + a);
		System.out.println(a.isEmpty());
		a.addAll(a);
		System.out.println("Element of A = " + a);
		System.out.println(	a.addAll(a));
		System.out.println("-------------------------------------");

		/*- It is implementation of set interface
		- Only 1 null insertion is allowed
		- Do not allow duplicate values
		- Order of insertion => random
		- Heterogenous
		- Storage type => hash table (key, values)
		- Data structure => hash table
		- Searching easy so hashSet is best choice
		- Default initial capacity 16
		- Fill ration (load factor) 0.75
		- It grows double when condition arrived (from 16 to 32)*/
		
		
		
		
		
		
		
	}

}
