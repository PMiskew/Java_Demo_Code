package game_map;

public class Map {

	
	private int rows;
	private int columns;
	private int[][] map;
	
	public Map(int r, int c) {
	
		rows = r;
		columns = c;
		
		map = new int[r][c];
		
		genRandomMap();
		
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
	
	public void displayMapConsole() {
		
		for (int r = 0; r < map.length; r++) {
			for (int c = 0; c < map[r].length; c++) {
				System.out.print(map[r][c]);
			}
			System.out.println("");
		}
		
	}
}
