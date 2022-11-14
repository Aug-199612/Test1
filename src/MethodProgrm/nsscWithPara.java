package MethodProgrm;

public class nsscWithPara {
	public void displyname(String fname,String lname)
	{
		System.out.println("FIRST NAME= "+fname);
		System.out.println("last NAME= "+lname);
		
	}
	public void displygrade(char grade,int percentage)
	{
		System.out.println("grade of student is = "+grade);
		System.out.println("percentage of student is = "+ percentage );
		
	}
	
	public static void main(String[] args) {
		nsscWithPara logic =new nsscWithPara();
		logic.displyname("kabir" ,"singh");
		logic.displygrade('A' ,85);
		
	}

}
