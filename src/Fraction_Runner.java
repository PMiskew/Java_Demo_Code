
public class Fraction_Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//print in Python
		System.out.println("Fraction Runner");
		
		//Creates a new Fraction object
		//Because classes are more complex we 
		//have to construct them.  
		Fraction f1 = new Fraction();
		Fraction f2 = new Fraction();
		

		f1.num = 5;
		f1.den = 20;
		
		f2.num = 9;
		f2.den = 10;
		
		f1.reduce();
		
		System.out.println(f1.num+"/"+f1.den);
		
		
		
		
		
		
		
	}//end main

}//end class
