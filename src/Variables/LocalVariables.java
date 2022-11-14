package Variables;

public class LocalVariables {
	 static int d=100;
	 static int e=200;
	 public static void add()
	 {
		 int a=10,b=20,c;
		 c=a+b;
		 System.out.println("A= "+a);
		 System.out.println("B= "+b);
		 System.out.println("addition ="+c);
		 System.out.println("D is the add method= "+d);
	 }
	 public void mul()
	 {
	
		 System.out.println("this is mul method");
		 System.out.println("D= "+d);//we can access static variables in non static method
		 System.out.println("E ="+e);//we can access non-static variables in non static method
		 
	 }
	 
	public static void main(String[] args) {
		add();
		
		System.out.println("E=" + e);
		System.out.println("D="+d);
	    LocalVariables a=new LocalVariables();
	    a.mul();
	    
	}

}
