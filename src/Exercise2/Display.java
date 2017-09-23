package Exercise2;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Display {

	
	private JFrame frame;
	private JPanel panel = new JPanel() {
		
		public void paint(Graphics g) {
			
			
			
		}
	};
	
	
	public Display(String title) {
		
		frame = new JFrame(title);
		
		frame.setSize(1000, 1000);
		
		
		frame.setVisible(true);
	}
}
