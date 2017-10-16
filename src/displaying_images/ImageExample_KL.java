package displaying_images;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ImageExample_KL {

	
	private int index = 0;
	private String[] fileNames = {"1_Hydrogen.jpg","2_Helium.jpg","3_Lithium.jpg"};
	
	private JFrame frame = new JFrame("Image Example");
	private JPanel panel = new JPanel() {
		
	
		public void paint(Graphics g ) {
			
			try {
			    
				img = ImageIO.read(new File("images//"+fileNames[index]));
			    System.out.println("SUCCESS");
			} catch (IOException e) {
				
				System.out.println("Not found");
			
				
			}
			
			
			g.drawImage(img, 0, 0, null);
		}
	};

	private BufferedImage img = null;
	
	private KeyListener kl = new KeyListener() {

		@Override
		public void keyTyped(KeyEvent e) {
			index = index + 1;
			if (index == fileNames.length) {
				index = 0;
			}
			System.out.println("KEY LISTENER");
			panel.repaint();
		}

		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		
	};
	
	public ImageExample_KL() {
		
		frame.setLocation(100,100);
	
	
		frame.add(panel);
		frame.setSize(600,780);
		frame.addKeyListener(kl);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImageExample_KL ie = new ImageExample_KL();
		
	}

}
