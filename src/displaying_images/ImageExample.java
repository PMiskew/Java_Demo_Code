package displaying_images;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ImageExample {

	
	private JFrame frame = new JFrame("Image Example");
	private JPanel panel = new JPanel() {
		
	
		public void paint(Graphics g ) {
			
			g.drawImage(img, 0, 0, null);
		}
	};

	private BufferedImage img = null;
	
	
	
	public ImageExample() {
		
		frame.setLocation(100,100);
	
		try {
		    
			img = ImageIO.read(new File("images//3_Lithium.jpg"));
		    System.out.println("SUCCESS");
		} catch (IOException e) {
			
			System.out.println("Not found");
		
			
		}
		
		frame.add(panel);
		frame.setSize(600,780);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImageExample ie = new ImageExample();
		
	}

}
