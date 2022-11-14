package CollectionPrograms;

import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {

		//LinkedList a =new LinkedList();
		LinkedList a = new LinkedList();
		LinkedList b  = new LinkedList(a);
		a.add("mukta");
		a.add("ash");
		a.add("loli");
		a.add("dolly");
		a.add("111");
		a.add(23);
		a.add('a');
		a.add('Z');
		a.add("@");
		System.out.println("elements of a="+ a);//order preserved
		a.addFirst("jon");
		a.addLast("khalesi");
		System.out.println("elements of a="+ a);//order preserved
		a.pollFirst();
		a.pollLast();
		System.out.println("elements of a="+ a);//order preserved
		a.addFirst("jon");//new added in first
		a.set(5, "jonhy");//rreplace with early value
		System.out.println("elements of a="+ a);//order preserved
		a.removeFirstOccurrence("jon");
		a.removeLastOccurrence("jon");
		System.out.println("elements of a="+ a);//order preserved
		
		
		
		//1111119 % 10 = 9  45236123%10=3,,,101213102030%10=0
		//Double 19 / 2 = 9.5
		//int 19 / 2 = 9 remainder=1
		//9/10 = 0....divide sangto
		//9%10 = 9..modulus ie remainder sangto
		// System.out.println(19/10); //1 9 is remained/undivide
		// System.out.println(1111119%10); //9

		
		
	}

}
