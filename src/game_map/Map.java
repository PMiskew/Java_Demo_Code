package game_map;

import java.io.File;
import java.util.Scanner;

public class Map {

	
	private int rows;
	private int columns;
	private int[][] map;
	
	public Map(int r, int c) {
	
		rows = r;
		columns = c;
		
		map = new int[r][c];
		
		//genRandomMap();
		loadFromFile("map2.txt");
		displayMapConsole();
		
	}
	
	public int getRows() { return rows; }
	public int getCols() { return columns; }
	public int getElement(int r, int c) { return map[r][c]; }
	
	
	public void genRandomMap() {
		
		for (int r = 0; r < map.length; r++) {
			for (int c = 0; c < map[r].length; c++) {
				map[r][c] = (int)(Math.random()*3 + 1);
			}
		}
		//BLACK BOARDER:
		for (int r = 0; r < map.length; r++) {
			map[r][0] = 0;
			
		}
		for (int c = 0; c < map[0].length; c++) {
			map[0][c] = 0;
		}
		
		
	}
	
	public void loadFromFile(String fileName) {
		
		try {
			Scanner s = new Scanner(new File(fileName));
			System.out.println("test");
			for (int r = 0; r < map.length; r = r + 1) {
				String temp = s.nextLine();
				for (int c = 0; c < map[r].length; c = c + 1) {
					map[r][c] = Integer.parseInt(""+temp.charAt(c));
				}
			}
			
		} catch (Exception e) {
			System.out.println("file not found");
		}
		
	}
	
	public void displayMapConsole() {
		
		for (int r = 0; r < map.length; r++) {
			for (int c = 0; c < map[r].length; c++) {
				System.out.print(map[r][c]);
			}
			System.out.println("");
		}
		
	}
}
