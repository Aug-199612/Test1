package LogicalPrograms;

public class addNummber {

	public static void main(String[] args) {
		int num=223232;//98970
		int sum=0;
		while(num>0)
		{
			int temperary=num%10;
			num=num/10;
			sum=sum+temperary;
		}
		
		//step1
		//98970%10=0
		//98970/10=9897
		//sum=0+0=0
		
		//step2
		//9897%10=7
		//9897/10=989
		//sum=0+7=7
		
		//step3
		//989%10=9
		//989/10=98
		//sum=7+9=16
	
		//step4
		//98%10=8
		//98/10=9
		//sum=16+8=24
		
		//step5
		//9%10=9
		//9/10=0
		//sum=24+9=33
		System.out.println("addition of given number is = "+sum);
		
			
	}
}
