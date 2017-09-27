import java.util.Scanner;

/**
 * This program demonstrates taking inputs from the keyboard
 * 
 * @author pmiskew
 *
 */
public class Taking_Inputs_PM {

	
	public static void main (String[] arg)  {
		//Good habit:	Declare all variables at the 
		//				top of a function
		
		
		//To take inputs from the keyboard you have to
		//use the Scanner class
		/*
		 * Java is made up of a whole bunch of classes. 
		 * You can think of a class as a toolbox. 
		 * You can think of methods/functions
		 * 
		 * Scanner class is a toolbox with tools(methods) that are designed to allow you
		 * to read from the keyboard or a file. 
		 * 
		 * 
		 */
		
		//MAKE LIFE EASY:  Make two Scanners.  One for numbers one for words
		Scanner snum = new Scanner(System.in); //We need to create a Scanner object 
		Scanner sstr = new Scanner(System.in);
		
		int num = 0; //stores an integer
		double dnum = 0; //stores a real number
		String word = ""; //stores a string
		
		System.out.println("Input a number: ");
		num = snum.nextInt(); //use the snum object to call teh nextInt() function
		
		System.out.println("You entered the number "+num);
		
		
		System.out.print("Input a real number (double): ");
		dnum = snum.nextDouble();
		
		
		System.out.print("Please input word: ");
		word = sstr.nextLine();
		
		System.out.println(word+" and a number is "+num+" makes "+dnum);
		
		
		
		
		
		
		
		
		
		
		
	}
}
