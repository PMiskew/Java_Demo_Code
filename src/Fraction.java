import java.lang.Math;

/**
 * When we talk about classes we talk about two things
 * 
 * 1. Attributes: Fields
 * 2. Behaviours: Methods
 */

/**
 * DEMO CODE MISKEW
 * @author pmiskew
 *
 */

//class header
public class Fraction {

	//Fields or attributes are declared at the top of a class
	private int num;
	private int den;
	
	
	public void setDen(int a) {
		if (a != 0) {
			den = a;
		}
		else {
			System.out.println("INVALID");
		}
	}
	
	public void setNum(int a) {
		num = a;
	}
	
	public int getNum() {
		return num;
	}
	
	public int getDen() {
		return den;
	}

	
	
	
} //end class
