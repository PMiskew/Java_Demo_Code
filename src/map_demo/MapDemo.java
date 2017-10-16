package map_demo;

import java.io.File;
import java.util.Scanner;

/**
 * This program demonstrates how to generate a map from a text file
 * 
 * @author pmiskew
 *
 */
public class MapDemo {

	public static char[][] getMap(String fileName) {
		Scanner s = null;
		
		try {
			s = new Scanner(new File("map1.txt"));
		}
		catch (Exception e) {
			
			
		}
		
		int columns = s.nextInt();
		int rows = s.nextInt();
		
		char[][] map = new char[rows][columns];
		
		int r = 0;
		int c = 0;
	
		
		
	}
	public static void main(String[] args) {
		
		
	}
}
