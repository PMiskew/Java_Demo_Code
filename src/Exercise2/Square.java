package Exercise2;

import java.awt.Color;

public class Square {

	private int x; //stores top left x coordinate
	private int y; //stores top left y coordinate
	
	private int l; //stores length of side
	
	private Color c = new Color(0,0,0);
	
	public Square(int xpos,int ypos) {
		x = xpos;
		y = ypos;
		l = 10;
	}
	
	public Square(int len) {
		x = 0;
		y = 0;
		l = len;
	}
	
	public Square(int xpos, int ypos, int len) {
		x = xpos;
		y = ypos;
		l = len;
	}
	
	public Square (int xpos, int ypos, int len, Color col) {
		x = xpos;
		y = ypos;
		l = len;
		c = col;
	}
	
	public Square (Square s) {
		
		/*
		 * Important concept:  You can access any objects fields in a class.
		 */
		x = s.x;
		y = s.y;
		l = s.l;
		c = s.c;
	}
	public int getArea() {
		
		return l*l;
	
	}
	
	public int getPerimeter() {
		
		return 4*l;
	
	}
	
	public int getX() {
		
		return x;
	
	}
	
	public int getY() {
	
		return y;
	
	}
	
	public int getLen() {
	
		return l;
	
	}
	
	public boolean containsOrigin() {
		
		if ((x <= 0 && x + l >=0) && (y <= 0 && y - l <= 0)) {
			return true;
		}
		
		return false;
	}
	
	public String toString() {
		String value = ("Top Left Corner: ("+x+","+y+")\n\t Length: "+l+"\n");
		return value;
		
		
	}
	
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
	
	
}
