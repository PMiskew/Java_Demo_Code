package assignment1;

import java.util.Scanner;

/*
 * GOALS:
 * 
 * 	- I want to set up your basic template. 
 *  - I want to set you up so you can take inputs of string and numeric type
 *  - I want to get you out of the main. 
 *  
 */



public class Assignment1_PM_02 {
	
	public static void game() {
		
		//Variables - game method.  They only exist in the game method
		Scanner wordsIn = new Scanner(System.in);
		Scanner numsIn = new Scanner(System.in);
		
		//inv[0] - store if you have a metal pole
		//inv[1] - store if you have socks
		//inv[2] - store if you have a box
		int[] inv = new int[3];
		String input = "";
		int nInput = 0;
		
		System.out.println("Suddenly you hear a large explosion and the everything goes black.");
		System.out.println(".");
		System.out.println(".");
		System.out.println(".");
		System.out.println("You wake up and the bridge is in chaos");
		
		System.out.println("You roll over and see a large flashing button.  Do you press it (YES/NO)?");
		
		//Problem: If the user types in anything other than yes the program continues.
		//When taking inputs conditional loops are perfect. Conditional loops
		//are used when we don't know how many times something should run. 
		//Two types of conditional loops:
		//
		//1. While loop:  	This is an if statement but we switch the word
		//					if with while. IT MIGHT SKIP IT.
		//
		//2. do while loop: This is like a while loop.  IT WILL ALWAYS
		//					RUN ONCE.
		
		do {
		
			System.out.print("Input: ");
			input = wordsIn.nextLine(); //take a line of text. 
		
			//We want to analyse what the user inputs.
			//Trick: With strings you can check more combination if you convert the string
			//		 to upper or lower case. 
			input = input.toUpperCase();
		
		} while (input.equals("YES") == false && input.equals("NO") == false);
			
		
		
			
		if (input.equals("YES")) {
			
			System.out.println("It turns out that was the self destruct button and your");
			System.out.println("life fashes before your eyes in teh 10 seconds you have");
			System.out.println("until the ship blows up.");
			System.out.println("GAME OVER MAN!!!!");
			
			//IF YOU DIE YOU WANT TO EXIT THE METHOD
			return; //stops the method
		}//end if statement
		
		System.out.println("You remember that that is the self-destruct button and leave it be");
		
		
		System.out.println("You see three items on the ground.");
		System.out.println("1. Metal Pole");
		System.out.println("2. A pair of socks");
		System.out.println("3. Box");
		
		do {
			
			System.out.print("What do you take? ");
			nInput = numsIn.nextInt();
			
		} while(nInput != 1 && nInput != 2 && nInput != 3);
		
		if (nInput == 1) {
			inv[0] = 1;
		}
		else if (nInput == 1) {
			inv[1] = 1;
		}
		else if (nInput == 2){
			inv[2] = 2;
		}
		
		
		
	}//end game 

	public static void main(String[] args) {
		
		//Variables - game method.  They only exist in the game method
		//Every method that takes inputs needs to have scanner objects. 
		Scanner wordsIn = new Scanner(System.in);
		Scanner numsIn = new Scanner(System.in);
				
		String input = "";
				
				
		System.out.println("Start Main");
	
		//Loop game:
		// To loop the game we will use a conditional loop called a do while loop
		// do while loops are perfect for situations where we must run the loop 
		// once. 
		
		
		do {
			
			game();
			
			System.out.println("Play again? (YES/NO)");
			System.out.print("Input: ");
			input = wordsIn.nextLine();
			
		} while (input.equals("yes"));
		
		
		
		
		System.out.println("End Main");
		
	} //end main
	
	
}//end class
