package CollectionPrograms;

import java.util.TreeSet;

public class treeset1 {

	public static void main(String[] args) {

		TreeSet ts=new TreeSet();
		//ts.add(null);//if we put first null then NULLPINTER EXCEPTION occured
		ts.add("ll");
		ts.add("ss");
		ts.add("ff");
		ts.add("gg");
		ts.add("jj");
		ts.add("www");
		ts.add("1234");
		//ts.add('f');//classcast exception is occured if put heterogous elements
		System.out.println("lements are ts="+ts);
		//ts.add(null);//if we put first null then NULLPINTER EXCEPTION occured
		System.out.println("lements are ts="+ts);

		TreeSet b = new TreeSet();
		b.add(100);
		b.add(90);
		b.add(11);
		b.add(101);
		System.out.println(b);
		
		
		/*3) Tree set
	- It is implementation class of sorted set interface
	- Don’t allow duplicate values
	- Order of insertion is ascending
	- Storage type => hash table
	- No default capacity
	- Data structure => balanced tree
	- No heterogenous*/
	}

}
