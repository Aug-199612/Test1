package Exception_handling;

public class Prog7P {
	/*Finalize
	Method available in object super class
	Release the resources allocated by unused object, before removing unused object by
	garbage collection
	Finalize is protected by default/ but we can use public*/


	protected void finalize() {
		//database.disconnect();
		//termination/deallocation of any resourses
		
	}
	protected void finalize(int a) {
		//database.disconnect();
	    //termination/deallocation of any resourses
	}
	public void finalize1() {//public also taken
		//database.disconnect();
		//termination/deallocation of any resourses
		
	}

		
}
