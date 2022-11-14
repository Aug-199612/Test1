package CollectionPrograms;
import java.util.Collections;
public class ArrayList {

	public static void main(String[] args) {
		
		java.util.ArrayList al1=new java.util.ArrayList();    //by default it has 10 capacity
		java.util.ArrayList al2=new java.util.ArrayList(1500);   //Customize default capacity=1500
		java.util.ArrayList al3 = new java.util.ArrayList(al1);   //create equivalent collection from existing
//	
		System.out.println(al1.isEmpty());//Check collection is empty / not
		System.out.println(al1.size()); //Return the size of collection not capacity
		al1.add("kiki");
		al1.add("mimi");
		al1.add("raju");
		al1.add("kuku");
		al1.add('X');
		al1.add(20);
		
		System.out.println("afetr adding elements="+al1.size());
		System.out.println("content of al1 elements ="+al1);
		for(int i=1;i<=10;i++)
		{
			al1.add(i);
			
		}
		System.out.println("content of al1 elements ="+al1);
		System.out.println(al1.size());
		al1.add(16,"mukta");
		System.out.println("content of al1 elements ="+al1);
		//Collections.sort(al1);//not applicable bcz not similar datatypes

		al1.add(11,"333");
		System.out.println("content of al1 elements ="+al1);
//		al1.clear();//It remove all the values of collection
//		System.out.println("content of al1 elements ="+al1);
		System.out.println(al1.contains("kiki"));
		System.out.println("................");
		/////It check weather required value is present in collection
		System.out.println("content of al1 elements ="+al1);
		System.out.println("................");

		////It get the value from mentioned index

//		al1.add(11,"333");
//		System.out.println("content of al1 elements ="+al1);
		System.out.println("................");

		System.out.println(al1.indexOf("kiki"));//0 It return first index of element
		System.out.println("................");

		System.out.println(al1.lastIndexOf("kuku")); //4 It return last index of element
		System.out.println("................");
		System.out.println(al1.lastIndexOf("ron")); //-1 It return no index of element
		System.out.println("................");
		al1.remove(3);		System.out.println("content of al1 elements ="+al1);

		al1.set(4, "chandramukhi");
		//It replace the existing value with newer value but with help of index
		System.out.println("content of al1 elements ="+al1);
		//Scenario to remove the element by getting the index first then remove
		System.out.println("Index of 10 = " + al1.indexOf(10));
		al1.remove(11);
		System.out.println("Content of AL1 = " + al1);
		
		al1.remove(Integer.valueOf(3));
		System.out.println("////////");
		System.out.println(al1.remove(Integer.valueOf(3)));
		System.out.println("Content of AL1 = " + al1);
		System.out.println("////////");

		Collections.reverse(al1);
		System.out.println("Content of AL1 = " + al1);
		
		System.out.println("////////");

		al2.add("Harry");
		al2.add("Ron");
		al2.add("Dobby");
		al2.add("Albus");
		System.out.println("Content of AL2 before sorting = " + al2);
		Collections.sort(al2);//sort according to alphabet order have same datatypes
		System.out.println("Content of AL2 after sorting = " + al2);
		System.out.println("////////");

		al3.add("78");
		al3.add("85");
		al3.add("55");
		al3.add("12");
		System.out.println("Content of AL3 before sorting = " + al3);
		Collections.sort(al3);//sort according to alphabet order have same datatypes
		System.out.println("Content of AL3 after sorting = " + al3);
		
		
		
	
	}

}
