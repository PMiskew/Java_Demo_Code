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
	
	public int findArea() {
		
		return l*l;
	}
	
	public int findPerimeter() {
		
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
