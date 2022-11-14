package CollectionPrograms;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.collections4.iterators.IteratorChain;

public class HashMapClass {

	public static void main(String[] args) {

		
		HashMap a = new HashMap();//IC=16 LF=.75
		HashMap b = new HashMap(200);//IC=200 LF=.75
		HashMap c = new HashMap(600,20);//IC=600 LF=0.2
		HashMap d = new HashMap(a);//IC=16 LF=.75
		
		a.put(5, "mukta");
		a.put(6, "onkar");
		a.put(3, "puja");
		a.put(2, "adya");
		a.put(1, "ashu");
		a.put(4, "darshna");
		System.out.println("entries are = "+a);
		a.put(2, "manu");//no duplicate keys..replace with new
		System.out.println("entries are = "+a);
		a.put(2, "aditya");//no duplicate keys..replace with new
		System.out.println("entries are = "+a);		
		System.out.println("keys are = "+a.keySet());
		System.out.println("value are = "+a.values());
		System.out.println("entries are = "+a.entrySet());
		System.out.println("-----------------------------------------------------------");		
			Set keys = a.keySet();//datatypes is set
			Iterator cursor =keys.iterator();//coverting hashmap into iterator
			while(cursor.hasNext())
			{
				System.out.print(cursor.next()+"\t");
			}
			System.out.println("\n-----------------------------------------------------------");
		        Collection values = a.values();//datatype is collection
		        Iterator cursor2=values.iterator();//coverting hashmap into iterator
		        while(cursor2.hasNext())
		        {
					System.out.println(cursor2.next()+"\t");
		        }
				System.out.println("\n-----------------------------------------------------------");

		        Collection entrysets = a.entrySet();//datatype is set as well as collection
		        Iterator cursor3 =entrysets.iterator();//coverting hashmap into iterator
		        while(cursor3.hasNext())
		        {
					System.out.println(cursor3.next()+"\t");
		        }
				System.out.println("\n-----------------------------------------------------------");

	}

}
