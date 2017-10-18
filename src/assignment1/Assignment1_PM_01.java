package assignment1;

import java.util.Scanner;

public class Assignment1_PM_01 {
	// 10/18/2017
	//
	//	1. I want to teach you conditional loops so you can ensure proper inputs from user. 
	//
	//	2. We are going to introduce a basic battle scene with randomization
	//
	//
	//
	public static void game() {
		
		//Variables:
		Scanner wordIn = new Scanner(System.in);
		Scanner numIn = new Scanner(System.in);
		
		int pHealth = 100;
		int eHealth = 40;
		
		String input = "";
		int nInput = 0;
				
		System.out.println("WELCOME TO THE JUNGLE!!");
		System.out.println("In this game you will a battle animals and level up");
		
		System.out.println("You meet a wise old man.  He stares at you.");
		System.out.println("What do you? ");
		System.out.println("A: Remain silent");
		System.out.println("B: Speak");
		
		//Essential: Ensure inputs are valid. 
		
		do {
			
			System.out.print("What option do you choose? ");
			input = wordIn.nextLine();
			
			if (input.equalsIgnoreCase("A") == false && input.equalsIgnoreCase("B") == false) {
				System.out.println("The old man stares inquisitivly at you.");
			}
		
		} while(input.equalsIgnoreCase("A") == false && input.equalsIgnoreCase("B") == false);
		
		if (input.equalsIgnoreCase("A") == true) {
			
			System.out.println("The man gives you an odd stare and says");
			System.out.println("\"Get with it man!\"");
			System.out.println("He waves his stick and you wake up in your bed");
			System.out.println("GAME OVER MAN");
		
			return; 
		}
		
		System.out.println("You start to speak, but what do you say?");
		System.out.println("Before you can say anything the old man says,");
		System.out.println("\"Here is my pet ferrit, ATTACK\"");
		System.out.println("The ferrit lunges at you.");
		
		do {
		//Step 1: Player choose their attack
			System.out.println("Choose attack: ");
			System.out.println("1. Weak Attack ");
			System.out.println("2. Strong Attack ");
			System.out.print("Choose attack: ");
			nInput = numIn.nextInt();
			
			if (nInput == 1) {
				//Weak attack
				System.out.print("You go for quick jab!");
				eHealth = eHealth - (int)(Math.random()*10);
				
				
			}
			else if (nInput == 2) {
				System.out.println("You step on the ferrit");
				eHealth = eHealth - (int)(Math.random()*30);
				
				
			}
			else {
				System.out.println("You stand there doing nothing and the ferrit attacks!!");
			}
			
			int randAttack = (int)(Math.random()*2); //generate 0 or 1
			//Step 2: Adjust ferrit health
			
			//Step 3: Ferrit will counter attack
		
			//Step 4: Adjust player health
		} while (pHealth <= 0 && eHealth <= 0); 
	
	
	}
	
	public static void main(String[] args) {
		
		
		//Step 1: Declare scanner objects
		Scanner wordIn = new Scanner(System.in);
		Scanner numIn = new Scanner(System.in);
		
		//Step 2: Declare an input String
		String input = "";
		int nInput = 0;
		
		
		System.out.println("Start Main");
		
		
		do {
			game(); //This calls my game method. 
		
			System.out.println("Would you like to play again?");
			System.out.println("1: YES");
			System.out.println("2: NO");
		
			System.out.print("Input: ");
			nInput = numIn.nextInt();
		
			if (nInput != 1 && nInput != 2) {
				System.out.println("INVALID OPTION! TRY AGAIN");
			}
			
		} while (nInput == 1);
		
		
		
		
		//Step3 ask do you want plag again
		//Step 4: take input
		
		//Step 5: use a do while loop to loop game();
		System.out.println("End Main");
		
		
		
		
	}

}
