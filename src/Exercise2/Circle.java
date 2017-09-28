package Exercise2;

public class Circle {
	
	
	//fields must be encapsulated
	private int x;
	private int y;
	
	private double radius;
	
	

	
	public void setRadius(double r) {
		radius = r;
	}
	public double getArea() {
		return Math.PI *radius*radius;	
	}
	
	public double getCircumference() {
		return Math.PI*2*radius;
	}
	
	public double getDiameter() {
		return 2*radius;
	}
	
	
	
	
}
