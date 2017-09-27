package Exercise2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Display {

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
	
	public Display(String title) {
		
		frame = new JFrame(title);
		
		frame.setSize(1000, 1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		frame.add(panel);
		
		
		panel.addMouseListener(ml);
		frame.setLocation(100, 100);
		frame.setResizable(false);
		frame.setVisible(true);
	}
}
