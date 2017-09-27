package Magic_The_Gathering;

import java.util.Scanner;

public class Card {

	//Fields: Atrributes
	private int attack;
	private int health;
	private int cost;
	
	/*Keep track of number of objects
	 *  Use a static variable.  A static variable is 
	 *  shared between all instances. 
	 */
	
	public static int numCards;
	
	
	public void setAttack(int a) {
		
		if (a >= 0 && a <= 100) {
			attack = a;
		}
		
	}
	
	public void setHealth(int h) {
		if (h >= 0 && h <= 100) {
			attack = h;
		}
	}
	
	public void setCost(int c) {
		
		if (c >= 0 && c <= 5) {
			cost = c;
		}
		
	}
	
	public int getAttack() {
		return attack;
	}
	
	public int getHealth() {
		return health;
	}
	
	public int getCost() {
		return cost;
	}
}
