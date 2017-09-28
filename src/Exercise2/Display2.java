package Exercise2;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;

public class Display2 {

	Square s = new Square(0,0);
	
	
	private JFrame frame;
	private JPanel panel = new JPanel() {

		
		public void paint(Graphics g) {
			
			System.out.println("HI");
			g.setColor(Color.WHITE);
			g.fillRect(0,0,1000,1000);
			g.setColor(c);
			
			g.drawRect(s.getX(),s.getY(),sideLength.getValue(),sideLength.getValue());
		}
	};

	public ActionListener blisten = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			c = new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255));
		}
		
		
		
	};
	

	public MouseListener ml = new MouseListener() { 

		@Override
		public void mouseClicked(MouseEvent evt) {
			System.out.println("CLICKED");
			
			
			s = new Square(evt.getX(),evt.getY());
			panel.repaint();
		}

		@Override
		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
		
	};

	//********************NEW CODE FOR SLIDDER*******************
	
	static final int FPS_MIN = 0; //NEW
	static final int FPS_MAX = 300; //NEW
	static final int FPS_INIT = 15;  //NEW
	JSlider sideLength = new JSlider(JSlider.HORIZONTAL, FPS_MIN, FPS_MAX, FPS_INIT); //NEW
		
	//*******************NEW CODE FOR CLEAR BUTTON***************
	private JButton b1 = new JButton("CHANGE COLOUR");
	
	
	private Color c = Color.RED;
	
	public Display2(String title) {
		
		
		b1.addActionListener(blisten);
		
		sideLength.setMajorTickSpacing(50); //NEW
		sideLength.setMinorTickSpacing(10); //NEW
		sideLength.setPaintTicks(true); //NEW
	
		sideLength.setPaintLabels(true); //NEW
		
		frame = new JFrame(title);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.add(sideLength, BorderLayout.NORTH);
		
		frame.add(panel, BorderLayout.CENTER);
		
		frame.add(b1, BorderLayout.SOUTH);
		frame.setSize(500,500);
		
		panel.addMouseListener(ml);
		frame.setLocation(100, 100);
		frame.setResizable(false);
		frame.setVisible(true);
	}
}
