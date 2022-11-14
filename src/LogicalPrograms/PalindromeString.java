package LogicalPrograms;

public class PalindromeString {
//Palindrome number in java: A palindrome number is a number that is same after reverse. 
	//For example 545, 151, 34543, 343, 171, 48984 are the palindrome numbers. 
	//It can also be a string like LOL, MADAM etc.
	public static void main(String[] args) {
		int num=454;
		String str1=Integer.toString(num);

		//String str1="madam";
		String str2="";		
		char ch;		
		for(int i=str1.length()-1;i>=0;i--)
		{
			ch=str1.charAt(i);
			str2=str2+ch;
			//OR//str2=ch+str2;
			//-1 should be there otherwise will get stringoutofboundindex
			System.out.println("reverse string = "+str2);
		}
		//System.out.println("final reverse string = "+str2);
	if(str1.equals(str2))
		System.out.println("palindrome String/number");
	else
		System.out.println("not palindrome String/number");

		
		                 /* palindrome numbers
		 int temp,sum=0,original;    
		  int num=454;//It is the number variable to be checked for palindrome  
		  
		  original=num;    
		  while(num>0)
		  {    
		   temp=num%10;  //getting remainder  
		   sum=(sum*10)+temp;    
		   num=num/10;    
		  }    
		  if(original==sum)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome");*/
		
	}
}
