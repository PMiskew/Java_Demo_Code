package assignment1_GUI;

import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Assignment1GUI_PM {

	
	private int index = 0;
	private String[] fileNames = {"1_Hydrogen.jpg","2_Helium.jpg","3_Lithium.jpg"};
	
	private JTextField command = new JTextField();
	
	private JFrame frame = new JFrame("Image Example");
	
	/*
	 * This is an example of overriding an existing method in a class
	 * When we create an instance of JPanel called panel it get all the 
	 * fields and attributes attributes from the JPanel class. 
	 * 
	 * However, we want to give specific instructions for painting to the 
	 * panel.  To do this we make a custom implement just below. 
	 * 
	 * The green arrow shows that we are OVERRIDING the function. 
	 */
	private JPanel panel = new JPanel() {
		
		/**
		 * We know that this is an instance method becuase it does not 
		 * have the modifier static. 
		 * 
		 * IMPORTANT: WE NEVER CALL PAINT DIRECTLY.  There are lots of
		 * little things that need to be done, so we call paint indirectly
		 * using repaint();
		 */
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
	
	public Assignment1GUI_PM() {
		
		frame.setLocation(100,100);
		frame.setLayout(new GridBagLayout());
		
		GridBagConstraints gc = new GridBagConstraints();
		
		gc.gridx = 0;
		gc.gridy = 0;
		
		gc.ipadx = 600;
		gc.ipady = 780;
	
		frame.add(panel,gc);
		
		gc.ipady = 100;
		gc.fill = GridBagConstraints.BOTH;
		gc.gridx = 0;
		gc.gridy = 5;
		
		frame.add(command,gc);
		frame.setSize(600,980);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment1GUI_PM ie = new Assignment1GUI_PM();
		
	}

}
