import java.lang.Math;


/**
 * DEMO CODE MISKEW
 * @author pmiskew
 *
 */

//class header
public class Fraction {

	//Fields or attributes are declared at the top of a class
	int num;
	int den;
	
	/**
	 * This is considered a default constructor. Key ideas with constructors
	 * 
	 *   1. If no constructor is written then a default constructor that takes no parameters.
	 *   	numeric types = 0
	 *   	reference types and Strings = null
	 *   2. If a single constructor is written the default constructor no longer exists
	 *   3. Constructors do not specify a return type.
	 *   4. Constructors MUST have the same name as the class. 
	 *    
	 */
	public Fraction() {
		num = 1;
		den = 1;
	}
	
	/**
	 * 
	 * @param d
	 * @param n
	 */
	public Fraction (int d, int n) {
		
		num = n;
		den = d;
		
	}
	
	/**
	 * This is considered an instance method since it does not have 
	 */
	public void printFaction() {
		//this is the same as self in Python
		//this is how we refer to the implied object
		System.out.println(this.num+"/"+this.den);
	}
	
	/**
	 * 
	 */
	public void reduce() {
		//local variables.  They only exist when reduce is run.	
		int min = Math.min(num,den);
		int factor = 1;
				
		/*
		 * For loops:  for (<count>; <check>; <change>) 
		 * count:  The variable you use to keep track of the loop
		 * 
		 * check:  This is the boolean expression evaluated once at the start
		 * 		   and then each time the change is applied at the end
		 * 
		 * change: This is the change to the count variable that happens at
		 * 		   the end of the loop
		 *
		 */
		for (int i = 1; i <= min; i = i + 1) {
			//Add note on MOD
			if (num % i == 0 && den % i == 0) {
				factor = i;
			}
			
		} //end for
		
		
		num = num / factor;
		den = den / factor;
		
	} //end reduce
	
	
} //end class
