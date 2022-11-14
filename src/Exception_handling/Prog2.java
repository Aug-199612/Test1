package Exception_handling;

public class Prog2 {

	public static void main(String[] args)/*throws InterruptedException8*/ {
		int a=1,b=0,c;
		c=a/b;
		System.out.println("Main started...");
		System.out.println("Output="+ c);
		//first method to throw
		//1.throw
		//throw new ArithmeticException();
		//any line after throw exception will be unreachable...nd no use of this method;
		//System.out.println("Main Ended here...");//if i uncomment(//)then it will show red marks

		//second method to throw
				//2.try nd catch
		
        /*below try and catch is automatic just put cursor on thread*///it is my responsibility
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		//third method to throw is THROWS.
		/*throws InterruptedException8*///it is jvm responsibility
	}

}
