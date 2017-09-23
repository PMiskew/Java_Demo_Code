package Exercise2;

public class Square {

	private int x; //stores top left x coordinate
	private int y; //stores top left y coordinate
	
	private int l; //stores length of side
	
	
	public Square(int len) {
		l = len;
	}
	
	
	public int findArea() {
		
		return l*l;
	}
	
	public int findPerimeter() {
		
		return 4*l;
	}
	
	
}
