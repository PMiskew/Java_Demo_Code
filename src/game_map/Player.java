package game_map;

public class Player {

	private int x = 0;
	private int y = 0;

	public Player() {
		
		
	}
	
	public int getX() { return x; }
	public int getY() { return y; }
	
	public void incX() { x = x + 10; }
	
	public void incY() { y = y + 10; }
	
	public void decX() { x = x - 10; }

	public void decY() { y = y - 10; }
	
}
