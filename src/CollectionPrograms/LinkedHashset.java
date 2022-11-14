package CollectionPrograms;

import java.util.LinkedHashSet;

public class LinkedHashset {
	
	/*- It is implementation class of set interface
	- Only one null insertion allowed
	- Don’t allow duplicate values
	- Order of insertion is maintained
	- Storage type => hash table
	- default capacity 16
	- Data structure => Hybrid
	We use linked has set cause duplicate are not allowed and insertion order needs to be
	maintained/*/

	public static void main(String[] args) {

		LinkedHashSet a1 = new LinkedHashSet();
		LinkedHashSet b1 = new LinkedHashSet(100);
		LinkedHashSet c1 = new LinkedHashSet(100,80);
		LinkedHashSet d1= new LinkedHashSet(a1);
		//a1.add(null);
		//default capacity 16
		a1.add('z');
		a1.add('a');
		a1.add(100);
		a1.add(10.2);
		a1.add(100);//duplicate not aalowed
		a1.add("March");
		System.out.println(a1);//order preserved
	}

}
