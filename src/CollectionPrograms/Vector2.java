 package CollectionPrograms;

import java.util.Vector;

public class Vector2 {

	public static void main(String[] args) {

		Vector a  = new Vector();//IC = 10
		Vector b  = new Vector(20);//IC = 20
		Vector c  = new Vector(10,230);//IC = 10..increment by 230...then final capacity 240
		//Vector d  = new Vector(c);//refferance a

		
		//System.out.println(d);//because before it c should be define
		c.add(1);c.add(2);c.add(3);c.add(4);
		c.add(5);c.add(6);c.add(7);c.add(8);
		c.add(9);c.add(10);
		System.out.println(c);
		System.out.println("capacity C===="+c.capacity());
		c.add(11);c.add(12);
		System.out.println(c);
		System.out.println("capacity C===="+c.capacity());
		//c.add(11);c.add(12);
		System.out.println("---------------------------------------");

		
		Vector d  = new Vector(a);//refferance a
		System.out.println("Capacity of a = " + a.capacity());
		System.out.println("Capacity of b = " + b.capacity());
		System.out.println("Capacity of d = " + d.capacity());
		System.out.println("Elements of d = " + d);
		System.out.println("Size of c = " + c.size());
		
		System.out.println("---------------------------------------");

		
		a.add(100);
		a.add("Velocity");
		a.add('A');
		a.addElement("ABC");
		System.out.println("Elements of a = " + a);//order preserved
		a.remove(0);//100 remove hoil bcz tychz index 0
		a.removeElementAt(1);//aata 0=velocity,1=a,2=abc
		System.out.println("Elements of a = " + a);
		a.add(200);
		a.add("25JuneABATCH");
		a.add('+');
		a.addElement("Vedha");
		System.out.println("Elements of a = " + a);//order preserved
		System.out.println("firsr elemnt of a=="+a.firstElement()+"   and.....");
		System.out.println("last elemnt of a=="+a.lastElement()+"  and....."+a.lastIndexOf("Vedha"));

		System.out.println("---------------------------------------");
		
		System.out.println("Elements of a = " + a);
		a.set(3, "25JuneABaaatch");//3 no chy element la replace krnar
		a.setElementAt("Vikram Vedha",5);//5 no chy element la replace krnar
		System.out.println("Elements of a = " + a);

		
	}

}
