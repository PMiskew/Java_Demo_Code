package basic_gui_displays;

import javax.swing.JOptionPane;

public class BasicGUI1 {

	public static void main(String[] args) {
		
		/*
		 * Building GUI windows can be challenging.  That said, Java has a selection of built in 
		 * GUI tools that can be accesed using JOptionPanel. 
		 */
		
		//1. JOptionPane.showInputDialog
		//
		//	This version creates a pop up screen that the user can enter something into.
		//	Note that regardless of what is entered the program returns a string to be 
		//	processed.  So if you are taking numeric inputs you have to cast them. 
		
		String name = JOptionPane.showInputDialog("What is your name?");
		
		//2. JOptionPane.showInputDialog - Take numeric input. 
		//
		//	To take a numeric input with these tools you need to cast the result to a numeric type.
		//	We do this using the static method parseInt, located in the Integer class.  This will only
		//	work if the user enters an actual number.  Otherwise it will crash. 
		//	Notice that in this example we also use the previously accessed value in the text box
		
		int age = Integer.parseInt(JOptionPane.showInputDialog("Hi "+name+". How old are you?"));
		
		//3.	 JOptionPane.showMessageDialog
		//
		//	This GUI shows a message box.  Notice that you have to pass a null parameter.  That needs to be
		//	there as this can be placed inside other components.  For now just put null. 
		
		
		JOptionPane.showMessageDialog(null, "Wow "+name+" you are "+age+" years old");
		
		
		//4.	JOptionPane.showConfirmDialog
		//
		//	This GUI component shows a confirm dialog box.  It will display a message and allow the user
		//	to select cancel, yes or no.  It returns in integer depending on what you respond. 
		//	Cancel returns 2
		//	No	   returns 1
		//	Yes	   returns 0
		
		int answer = JOptionPane.showConfirmDialog(null, "Do you like taco's?");
		System.out.println(answer);
		
		
		if (answer == 2) {
			JOptionPane.showMessageDialog(null, name+", why don't you want to answer.");
		}
		else if (answer == 1) {
			JOptionPane.showMessageDialog(null, "Really, "+name+"!. You don't like tacos");
		}
		else {
			JOptionPane.showMessageDialog(null, "I like tacos too, "+name+".");
		}
		
		
		
	}

}
