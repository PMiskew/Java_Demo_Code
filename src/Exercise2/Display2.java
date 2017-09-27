package Exercise2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;

public class Display2 {

	ArrayList<Square> list = new ArrayList<Square>();
	
	
	private JFrame frame;
	private JPanel panel = new JPanel() {

		
		public void paint(Graphics g) {
			
			
			g.setColor(Color.WHITE);
			g.fillRect(0,0,1000,1000);
			g.setColor(Color.RED);
			for (int i = 0; i < list.size(); i++) {
				g.drawRect(list.get(i).getX(), list.get(i).getY(), list.get(i).getX() + 10, list.get(i).getY() + 10);
				System.out.print("IN"+i);
			}
		}
	};

	

	public MouseListener ml = new MouseListener() { 

		@Override
		public void mouseClicked(MouseEvent evt) {
			System.out.println("CLICKED");
			
			
			list.add(new Square(evt.getX(),evt.getY()));
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
	static final int FPS_MAX = 30; //NEW
	static final int FPS_INIT = 15;  //NEW
	JSlider sideLength = new JSlider(JSlider.HORIZONTAL, FPS_MIN, FPS_MAX, FPS_INIT); //NEW
		
		
	public Display2(String title) {
		
		
		sideLength.setMajorTickSpacing(10); //NEW
		sideLength.setMinorTickSpacing(1); //NEW
		sideLength.setPaintTicks(true); //NEW
		sideLength.setPaintLabels(true); //NEW
		
		frame = new JFrame(title);
		
		
		frame.add(sideLength, BorderLayout.NORTH);
		
		frame.add(panel, BorderLayout.SOUTH);
		
		frame.setSize(500,500);
		
		panel.addMouseListener(ml);
		frame.setLocation(100, 100);
		frame.setResizable(false);
		frame.setVisible(true);
	}
}
