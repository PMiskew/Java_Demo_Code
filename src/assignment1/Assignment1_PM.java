package assignment1;

import java.util.Scanner;

/**
 * This is my first assignment where I will demonstrate. . . 
 * @author pmiskew
 *
 */
public class Assignment1_PM {
	
	
	
	public static void game() {
	
		//Variables: These are only visible inside the game method
		Scanner numIn = new Scanner(System.in);
		Scanner wordsIn = new Scanner(System.in);
		
		String name = "";
		
		System.out.println("                                                     ");
		System.out.println("     X             X             X             X     ");
		System.out.println("    XXX           XXX           XXX           XXX    ");
		System.out.println("   XXXXX         XXXXX         XXXXX         XXXXX   ");
		System.out.println("    XXX           XXX           XXX           XXX    ");
		System.out.println("  XXXXXXX       XXXXXXX       XXXXXXX       XXXXXXX  ");
		System.out.println(" XXXXXXXXX     XXXXXXXXX     XXXXXXXXX     XXXXXXXXX ");
		System.out.println("XXXXXXXXXXX   XXXXXXXXXXX   XXXXXXXXXXX   XXXXXXXXXXX");
		System.out.println("    XXX           XXX           XXX           XXX");
		System.out.println("                                                     ");
	
		System.out.println("You wake up in a dark forst disoriented. You are thirsty");
		System.out.println("and the last thing you remember is going to bed");
		
		System.out.println("");
		System.out.println("");
		
		System.out.println("You try and recal your name. You quielty speak your name out loud. ");
		System.out.print("Enter name: ");
		name = wordsIn.nextLine();
		
		System.out.println("");
		
		System.out.println(name+ " doesn't sound right when it leaves your lips. You try a differnet name: ");
		System.out.print("Enter name: ");
		name = wordsIn.nextLine();
		
		System.out.println("");
		System.out.println("That sounds right." + name +" is your name, but who are you?");
		
		
		
		
		
		
		
		
	} //end game
	
	public static void main(String[] args) {

		//Variable:
		Scanner numIn = new Scanner(System.in);
		Scanner wordsIn = new Scanner(System.in);
		int input = 0;
		
		System.out.println("                  LOST IN THE FOREST");
		
		do {
			
			game();
			
			System.out.println("Would you like to play again?");
			System.out.println("1: Yes");
			System.out.println("2: No");
			System.out.print("Please input option: ");
			input = numIn.nextInt();
			
		} while (input  == 1);
		
		
		
		System.out.println("Have a great day!");
		
	} //end main

} //end class
