package Exercise2;
/**
 * 
 * @author pmiskew
 *
 */
public class RightTriangle {

	private int x;
	private int y;
	//NOTE: Side a and b is NOT the hypotensus
	private double a; //leg 1
	private double b; //leg 2
	
	//**********GET SET METHODS******************
	public void setX(int xpos) {
		x = xpos;
	}
	
	public int getX() {
		return x;
	}
	
	public void setY(int ypos) {
		y = ypos;
	}
	
	public int getY() {
		return y;
	}
	
	public double getArea() {
		
		return 0.5*a*b;
	}
	
	public double getHypot() {
		double hyp = a*a + b*b;
		hyp = Math.sqrt(hyp);
		return hyp;
	}
	//*******************************************
}
