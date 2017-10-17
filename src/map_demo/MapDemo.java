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

	/*
	 * The file is designed so that the first two lines indicated the number of rows and columns. 
	 * This is helpful in that is is easier to read the map from the text file. 
	 */
	public static char[][] getMap(String fileName) {
		Scanner s = null;
		
		try {
			s = new Scanner(new File("map1.txt"));
		}
		catch (Exception e) {
			
			
		}
		
		int rows = s.nextInt();
		
		int columns = s.nextInt();
		
		char[][] map = new char[rows][columns];
		
		System.out.println(rows);
		System.out.println(columns);
		
				
		for (int r = 0; r < rows; r++ ) {
			String str = s.nextLine();
			
			for (int c = 0; c < str.length(); c++) {
				map[r][c] = str.charAt(c);
			}
		}
		return map;
		
	
		
		
	} //end getMap
	
	// This function is simply used to check that the map is loaded into the
	// 2D array correctly. 
	public static void displayMap(char[][] map) {
		
		for (int r = 0; r < map.length; r++) {
		
			for (int c = 0; c < map[r].length; c++) {
				System.out.print(map[r][c]);
			}
			System.out.println();
		
		}
		
		
	}
	public static void main(String[] args) {
		
		char[][] map = getMap("map1.txt");
		displayMap(map);
		System.out.println("Done");
	}
}
