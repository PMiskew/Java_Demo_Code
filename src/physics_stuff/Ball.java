package physics_stuff;

public class Ball {
	
	private int x;
	private int y;
	private int r = 30;
	
	public Ball(int xpos, int ypos) {
		
		x = xpos;
		y = ypos;
		
	}
	
	public int getX() { return x; }
	public int getY() { return y; }
	public int getR() { return r; }
	
	public void changeY() { y = y + 1; }
	
	
	
	
}
