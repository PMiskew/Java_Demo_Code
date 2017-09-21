import java.util.Scanner;

public class Exercise1_PM {

	public static void main(String[] args) {
		
		//Variable declaration section
		//All variables are declared at the top of the program
		
		Scanner s = new Scanner(System.in);
		
		double area = 0;
		double r = 9;
		
		double vol = 0;
		double radiusCyl = 0;
		double heightCyl = 0;
		
				
		//Calculation 1:
		System.out.println("Calculation 1: Area of a Circle");
		
		System.out.print("Input radius of circle: "); //Step 1: Prompt for input
		r = s.nextDouble(); //Step 2: Take input

		
		//By changing 22 to 22.0 the program assums 22.0 is a double and does normal division
		area = (22.0/7)*r*r;
		
		System.out.println("A circle with radius "+r+" has an area "+area);
		
		//Calculation 2:
		System.out.println("Calculation 2: Volume of Cylinder");
		
		System.out.print("Input cylinder radius: ");
		radiusCyl = s.nextDouble();
		
		
		
		
		
	}

}
