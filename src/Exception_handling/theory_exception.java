package Exception_handling;

public class theory_exception {

	public static void main(String[] args) {

		/*Mechanism to handle the exception
		Following are the technique to handle the exception
		a) Try
		b) Catch
		c) Throw
		d) Throws
		e) Finally
		.............@2Throw
@If we want to create our own exception object and wants to throw the exception as we
are not taking the responsibility of it and we want JVM should handle that exception
then we use throw
...............@1 Throws:
We can assign exception handling responsibility to caller (JVM or another method)
Needed for checked exception, for unchecked no use of it
No prevention of abnormal termination
.................@3Try Block :-
 Put risky code in try block
- Used to declare risky code only
- Controller visit try only once throughout lifeline of program
- Try block followed by catch or finally block
- Multiple try block are not allowed
..............@4Catch Block :- 
it handle the exception throws by try block
- Used to handle event generated from try block
- Executed if event generated in try block
- Should be declare after try block
- Any number of catch block can be declare for single try
Note :- Catch will not execute if no exception in try block
Java Finally Block is followed by try block and always executed whenever the exception
occurs or not.
................@5Finally Block
 is used to execute important code such as closing connection, stream,
cleanup code etc............*/
	}

}
