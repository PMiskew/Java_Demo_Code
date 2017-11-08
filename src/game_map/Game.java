package game_map;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Game {

	Player p = new Player();
	
	JFrame frame = new JFrame("Game");
	
	JPanel panel = new JPanel() {
		
		public void paint(Graphics g) {
			int x = 0;
			int y = 0;
			System.out.println(panel.getWidth());
			System.out.println(panel.getHeight());
			for (int r = 0; r < map.getRows(); r++) {
				for (int c = 0; c < map.getCols(); c++) {
					if (map.getElement(r,c) == 0) {
						g.setColor(Color.BLACK);
					}
					if (map.getElement(r,c) == 1) {
						g.setColor(Color.GREEN);
					}
					if (map.getElement(r,c) == 2) {
						g.setColor(Color.BLUE);
					}
					if (map.getElement(r, c) == 3) {
						g.setColor(Color.GRAY);
					}
					g.fillRect(x, y, 10,10);
					x = x + 10;
					if (x == 500) {
						x = 0;
						y = y + 10;
					}
				}
				
				g.setColor(Color.RED);
				
				g.fillRect(p.getX(), p.getY(), 10, 10);
				
			
				
			}
			
			
			
			
		}
	};
	
	KeyListener kl = new KeyListener() {

		@Override
		public void keyTyped(KeyEvent e) {
			
		}

		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			System.out.println("KEYLISTENER");
			System.out.println(e.getKeyChar());
			if (e.getKeyChar() == e.VK_W) {
				
				if (p.getY() - 10 > 0) {
					p.decY();
				}
				
				System.out.println("W");
			
			}
			else if (e.getKeyChar() == e.VK_D) {
				
				if (p.getX() + 10 < 490 ) {
					p.incX();
				}
				
				System.out.println("D");
			
			}
			else if (e.getKeyChar() == e.VK_S) {
				
				if (p.getY() + 10 < 490) {
					p.incY();
				}
				
				System.out.println("S");
			
			}
			else if (e.getKeyChar() == e.VK_A) {
				
				if (p.getX() - 10 > 0) {
					p.decX();
				}
				
				System.out.println("A");
			}
			
			panel.repaint();
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		
	};
	private Map map = new Map(50,50);
	
	
	public Game() {
		
		frame.setSize(500,522); //Manually setting these dimensions is NOT IDEAL.
		frame.setLocation(100,100);
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.addKeyListener(kl);
		
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game g = new Game();
	}

}
