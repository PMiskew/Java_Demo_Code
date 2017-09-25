package Exercise2;

import java.awt.Color;

public class SquareRunner {

	public static void main(String[] args) {
	
		Square s1 = new Square(10,10);

		Square s2 = new Square(33);
	
		Square s3 = new Square(-3, -5, 30);
		
		Square s4 = new Square(50, 40, 60, Color.RED);
		
		Square[] squares = new Square[100];
		
		for (int i = 0; i < squares.length; i++) {
			
			/*
			 * Note on generating random values (using xpos as example):
			 *		The Math class contains a method called random() which returns a random double in the range 0.0 <= Math.random() < 1.0
			 * 		We multiply the value by an integer to generate a range 0.0 <= Math.random() *101 < 101.0
			 * 		We cast the number to an integer since xpos, ypos and len are all integer values. 0 <= (int)(Math.random() *101) < 101
			 * 		We cab shift the range by adding or subtracting values -50 <= (int)(Math.random() *101) - 50 < 51
			 *  
			 */
			
			int xpos = (int)(Math.random()*101) - 50; //generates random x position from -50 to 50

			int ypos = (int)(Math.random()*101) - 50; //generates random y position from -50 to 50

			int len = (int)(Math.random()*100); //generates random len from 0 to 99
			
			squares[i] = new Square(xpos,ypos,len);
		}
	
		for (int i = 0; i < squares.length; i ++) {
			System.out.println(squares[i]);
		}
		
		Square s5 = new Square(10);
		s5.drawMe("*");
	}

}
