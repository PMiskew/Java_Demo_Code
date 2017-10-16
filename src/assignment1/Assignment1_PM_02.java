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
		
		String input = "";
		
		
		System.out.println("Suddenly you hear a large explosion and the everything goes black.");
		System.out.println(".");
		System.out.println(".");
		System.out.println(".");
		System.out.println("You wake up and the bridge is in chaos");
		
		System.out.println("You roll over and see a large flashing button.  Do you press it (YES/NO)?");
		
		System.out.print("Input: ");
		input = wordsIn.nextLine();
		
		//We want to analyse what the user inputs.
		//Trick: With strings you can check more combination if you convert the string
		//		 to upper or lower case. 
		input = input.toUpperCase();
		
		if (input.equals("YES")) {
			
			System.out.println("It turns out that was the self destruct button and your");
			System.out.println("life fashes before your eyes in teh 10 seconds you have");
			System.out.println("until the ship blows up.");
			System.out.println("GAME OVER MAN!!!!");
			
			//IF YOU DIE YOU WANT TO EXIT THE METHOD
			return; //stops the method
		}//end if statement
		
		System.out.println("You remember that that is the self-destruct button and leave it be");
		
		
		
		
		
		
	}//end game 

	public static void main(String[] args) {
		
		//Variables - game method.  They only exist in the game method
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
