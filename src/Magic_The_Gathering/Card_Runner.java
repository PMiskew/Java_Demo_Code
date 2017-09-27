package Magic_The_Gathering;

import java.util.Scanner;

/**
 * This is simply a test file. 
 * @author pmiskew
 *
 */
public class Card_Runner {

	public static void main(String[] args) {

		
		Card c1 = new Card(); //created a card object
		Scanner s = new Scanner(System.in);
		int a = 0;
		
		//c1 is the implied object
		//A do while loop is ideal for situations 
		//when you know the question must be asked
		//once
		do {
			
			System.out.print("Input attack value");
			a = s.nextInt();
		
		} while (a < 0 || a > 100);
		
		
		c1.setAttack(100);
		
	
		
		/*
		 * Image that the attack needs to be 0 <= attack <= 100
		 * 
		 */
		
		
		
				
		
		
	}

}
