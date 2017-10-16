package physics_stuff;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PhysicsDemo {
	
	//Fields
	private int fps = 32;
	private int renderSpeed = 1000/fps;
	
	private Ball b = new Ball(10,10);
	private JFrame frame = new JFrame("Physics Demo");
	private JPanel panel = new JPanel() {
	
		public void paint(Graphics g) {
			
			//This just makes things look nicer. 
			Graphics2D g2 = (Graphics2D)g;
			//Anti-Aliasing is the process of line smoothing
			g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
			
			
			g2.fillOval(b.getX(), b.getY(), b.getR(), b.getR());
		}
		
	};
	
	public KeyListener kl = new KeyListener() {

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			b.changeY();
			System.out.println(b.getY());
			panel.repaint();
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		
	};
	
	public ActionListener al = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
		
			System.out.println("RENDERING!!!");
			b.changeY();
			panel.repaint();
			
		}
		
	};

	Timer renderingTimer = new Timer(renderSpeed,al); 
		
		
	
	public PhysicsDemo() {
		
		frame.setSize(500,500);
		frame.setLocation(100, 100);
		renderingTimer.start();
		
		
		frame.addKeyListener(kl);
		frame.add(panel);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		
		
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PhysicsDemo pd = new PhysicsDemo();
	}

}
