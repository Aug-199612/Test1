package ControlStatement;
  //nested if
public class Prog3 {

	public static void main(String[] args) {
		String fbusername="Harry@gmail.com";
		String fbpassword="harry@1234";
		if(fbusername=="Harry@gmail.com")
		{
			System.out.println("correct username");
		    if(fbpassword=="Harry@1234")
		    {
		    System.out.println("login successful ");
		    System.out.println("welcome to fb ");
	        
		    }
		    else
		    {
		    System.out.println("incorrect password ");
		    }
	    }	
		else
		{
		System.out.println("incorrect username");
		}
	    }
	}
		
		
	