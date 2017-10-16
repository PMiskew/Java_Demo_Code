package ap_questions;

/**
 * This is a solution to the 2010 #2 AP Computer 
 * Science Long Response.
 * @author pmiskew
 *
 */
public class APLine {

	//Fields
	//AP TIP - ALWAYS ENCPASULATE
	private int a;
	private int b;
	private int c;
	
	//Constructors
	//Question: What is the return type of the constructor?
	//	Often people will say a constructor doesn't return anything. It does
	//	a constructor returns a reference to the newly constructed object. That 
	// 	is why we don't write a return type. In this case case the return type 
	//  is an APLine. 
	public APLine(int aVal, int bVal, int cVal) {
		
		a = aVal;
		b = bVal;
		c = cVal;
		
	}
	//Methods
	
	public double getSlope() {
		//This is almost correct. 
		
		//return -a/b;
		
		//CONCEPT: Integer Division:
		// When java divides two integers it assumes you want an integer as a
		// result. Therefore it simply chops off the decimals.  That is why
		// return -a/b;
		// is almost correct. It woulnd't give an error it would return 
		// possibly the wrong value. 
		// Solution?  
		//	If either the numerator or denominator is an double then the 
		//	program assumes the result should be an double. 
		//	1/2 = 0.0
		//  1.0/2 = 0.5
		//	1.0*1/2 = 0.5
		//  1/2*1.0 = 0.0
		
		return -1.0*a/b;
		
	}
	
	public boolean isOnLine(int x, int y) {
		
		return a*x + b*y + c == 0;
		
	}
	
	
}
