package Exercise2;

import java.awt.Color;

public class Square {

	/**
	 * An instance method is a method that changes or accesses
	 * an instance field.  
	 * An instance field is one of the attributes of an instance
	 * of the class
	 */
	private int x; //stores top left x coordinate
	private int y; //stores top left y coordinate
	
	private int l; //stores length of side
	
	private Color c = new Color(0,0,0);
	
	
	
	/**
	 * 
	 * @param xpos
	 * @param ypos
	 */
	public Square(int xpos,int ypos) {
		x = xpos;
		y = ypos;
		l = 10;
	}
	
	/**
	 * 
	 * @param len
	 */
	public Square(int len) {
		x = 0;
		y = 0;
		l = len;
	}
	
	/**
	 * 
	 * @param xpos
	 * @param ypos
	 * @param len
	 */
	public Square(int xpos, int ypos, int len) {
		x = xpos;
		y = ypos;
		l = len;
	}
	
	/**
	 * 
	 * @param xpos
	 * @param ypos
	 * @param len
	 * @param col
	 */
	public Square (int xpos, int ypos, int len, Color col) {
		x = xpos;
		y = ypos;
		l = len;
		c = col;
	}
	
	/**
	 * 
	 * @param s
	 */
	public Square (Square s) {
		
		/*
		 * Important concept:  You can access any objects fields in a class.
		 */
		x = s.x;
		y = s.y;
		l = s.l;
		c = s.c;
	}
	
	//*******************************INSTANCE METHODS***************************
	/*
	 * Instance methods are ones that require an instance to call.  For example
	 * with the Scanner class we need to create an instance in order to call any 
	 * instance (non-static) methods. 
	 * 
	 * Scanner s = new Scanner(System.in);
	 * 
	 * s.nextInt();
	 * 
	 * Right away we know that nextInt() is an instance method because we have to 
	 * call it with an instance of Scanner.  In this case the instance is called s.
	 * 
	 * Another place we see this is with the string class.  Though note, that the 
	 * String class is special and doesn't work like a reference type.  Regardless
	 * the methods work the same
	 * 
	 * String name1 = "Paul";
	 * String name2 = "Stephanie";
	 * 
	 * System.out.println(name1.substring(0,3)); //name1 is the implied object
	 * System.out.println(name2.substring(1,5)); //name2 is the implied object
	 * 
	 * An implied object is different than a passed object, that is one we send to 
	 * a method as a parameter.  
	 */
	
	/**
	 * 
	 */
	public void setX(int a) {
		x = a;
	}
	/**
	 * 
	 * @return
	 */
	public int getArea() {
		
		return l*l;
	
	}
	
	/**
	 * 
	 * @return
	 */
	public int getPerimeter() {
		
		return 4*l;
	
	}
	
	/**
	 * 
	 * @return
	 */
	public int getX() {
		
		return x;
	
	}
	
	/**
	 * 
	 * @return
	 */
	public int getY() {
	
		return y;
	
	}
	
	/**
	 * 
	 * @return
	 */
	public int getLen() {
	
		return l;
	
	}
	
	/**
	 * This function checks if the rectangle that is constructor contains the point (0,0) when 
	 * drawn. 
	 * @return
	 */
	public boolean containsOrigin() {
		
		if ((x <= 0 && x + l >=0) && (y <= 0 && y - l <= 0)) {
			return true;
		}
		
		return false;
	}
	
	/**
	 * The to String method is automatically invoked when treating the object like a string.
	 */
	public String toString() {
		String value = ("Top Left Corner: ("+x+","+y+")\n\t Length: "+l+"\n");
		return value;
		
	}
	
	/**
	 * We will assume that two squares are considered equal if the x,y and l fields are the same. 
	 * The color does not have to match. 
	 * @param other
	 * @return
	 */
	public boolean equals(Square other) {
		
		// Always null check the passed object.  If it hasn't been constructed 
		// any attempt to access a field or method will crash the program with 
		// a NullReferenceException
		if (other == null) {
			return false;
		}
		
		if (this.x == other.x && this.y == other.y && this.l == other.l) {
			return true;
		}
		// ***********************GOOD PRACTICE****************************
		/*
		 * Catch all return.  When designing an approach often we think of the 
		 * most common situation or the left over case and then simply return
		 * at the bottom of the method. 
		 * 
		 * Remember that as soon as Java reaches a return statement it stops
		 * the method, so it will only reach this final return statement if
		 * it has skipped all others. 
		 */
		return false;
	}
	
	/**
	 * This function draws the square to the console panel. 
	 * @param v
	 */
	public void drawMe(String v) {
		
		//Step 1: Draw top
		for (int i = 0; i < l; i++) {
			System.out.print(v);
		}
		System.out.println("");
		
		for (int i = 0; i < l - 2; i++) {
			System.out.print(v);
			for (int j = 0; j < l - 2; j++) {
				System.out.print(" ");
			}
			System.out.println(v);
		}

		for (int i = 0; i < l; i++) {
			System.out.print(v);
		}
		
	}
	
	
	//****************************STATIC METHODS***********************************
	/*
	 * Static methods or class methods, they mean the same thing, are methods that 
	 * contain the modifier static in the method header.  You can tell if a method 
	 * is static when you look at the online documentation. Under the return type 
	 * the word static is written. 
	 * 
	 * Static methods are ones that DO NOT require an implied object.  This means that
	 * in a static method you cannot access any instance fields, only static fields. 
	 * 
	 * Because a static method does not required an implied object, an object is not 
	 * needed when invoking the method. 
	 * 
	 * You have already seen this with the Math class.  We never make an instance of
	 * Math, we simply call the methods with the name of the class. 
	 * 
	 * int a = Math.max(1,100);
	 * 
	 * A class can consist of both static and instance methods and a static method 
	 * can be called with an instance, but this is VERY BAD PRACTICE!
	 * 
	 * As a programmer we only call static methods with the name of the class as this
	 * is a clue that the method is static.  I know right away that max is a static 
	 * method contained in the Math class since we are calling it with the name of the 
	 * class. 
	 * 
	 * Look at the string documentation
	 * 
	 * https://docs.oracle.com/javase/7/docs/api/java/lang/String.html
	 * 
	 * The bulk of the methods are instance methods, but there are a few static methods.
	 * The valueOf method is static.  This method returns a non-string type as a string. 
	 * 
	 * double number = 99;
	 * 
	 * String num = String.valueOf(number);
	 * 
	 * notice that valueOf is called with the name of the class. 
	 * 
	 * 
	 * 
	 */
	
	
	
	
	//***********CRITICAL CONCEPTS***********************
	//
	//	It is important to understand the difference between returning a reference to an objects
	//	verse returning a new copy of the object.  You can simply return the reference by wrting
	//
	//	return s1
	//
	//  However, to return an copy of the object you must first construct it and then return the 
	//	new object. In our example we have a constructor that can create a new copy.  That is why
	//	we can write 
	//
	//	return new Square(s1);
	//
	//	We could first construct the object and then return it. 
	//
	//	Square tempSquare = new Square(s1);
	//	return tempSquare;
	//
	//
	//****************************************************
	
	public static Square findLargerCopy(Square s1, Square s2) {
		
		if (s1.getArea() > s2.getArea()) {
			return new Square(s1);
			
		}
		return new Square(s2);
		
	}
	
	public static Square findLargerReference(Square s1, Square s2) {
		
		if (s1.getArea() > s2.getArea()) {
			return s1;
			
		}
		return s2;
		
	}
	
	
	
	
	
} //end class
