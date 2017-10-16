package displaying_images;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class ImageExample {

	
	private JFrame frame = new JFrame("Image Example");

	private BufferedImage img = null;
	
	public ImageExample() {
		
		frame.setLocation(100,100);
	
		try {
		    img = ImageIO.read(new File("3_Lithium.jpg"));
		} catch (IOException e) {
			System.out.println("Not found");
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImageExample ie = new ImageExample();
		
	}

}
