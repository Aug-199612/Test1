package MethodProgrm;

public class SmscWithPara {
	
	public static void showName(String name)
	// name is paramter,string is variabl
	//name=Harry we want harry as a name in console
	//showName is method name
	{   
		System.out.println("NAME OF THE PERSON ="+name);
	}
	
	public static void addition(int num1,int num2)
	//int num1.int num2 is parameter,int is variable
	//num1=100,num2=25
	//addition is method name
	{
		int sum;
		sum=num1+num2;
		System.out.println("ADDITION BY METHOD WITH PARAMETER="+sum);
	}
	
	
	  public static void main(String[] args) {
		//just give a call of method,and just put parameter input
		addition(100,25);
		showName("HARRY");	
		}
	}


