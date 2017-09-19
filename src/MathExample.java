
/**
 * This is a header for the class.  It will be in blue
 * Headers for methods will be in blue as well
 * @author pmiskew
 *
 */
public class MathExample {

	/**
	 * This is my main method.  This is where the program 
	 * starts running.  Every programming language needs a 
	 * starting point.  Python for example starts at the first
	 * non indented line of code. 
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Math Example - Begins");
		//With Java you have to specify variable type;
		int num = 9;
		double numd = 6.7;
		String name = "Paul";
		
		//Java supports BEDMAS
		num = 5 + 2 *(1+3);
		
		//% is the mod operator.  This checks what the remainder
		num = 5%2;
		
		//A single slash performs integer division on two integers
		//INTEGER DIVISION IS WHEN WE DIVIDE AND CHOP OFF DECIMALS
		num = 10/3;
		
		System.out.println(num);
		
		//Complex Math. 
		//If we want to do some more complex things we can use the
		//Math class
		
		
		
		int y = Math.max(78, 23);
		System.out.println(y);
	
		
		
		
		
		
		
		
		
				
		
		System.out.println("Math Example - ENDS");
	} //end main
	
	

} // end class
