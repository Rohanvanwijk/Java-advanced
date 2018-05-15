package week2_boomshine;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JButton;
import javax.swing.JPanel;

public class BubbleView extends JPanel implements Observer{
	private Bubble bubble;
	
	public BubbleView(Bubble bubble) {
		this.bubble = bubble;
		bubble.addObserver(this);
		this.setOpaque(false);
		BubbleController controller = new BubbleController(bubble);
		
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		int straal = bubble.getStraal();
		
		
		int mx = bubble.getMiddelpunt().x;
		int my = bubble.getMiddelpunt().y;
		
		
		
		int x = mx - straal;
		int y = my - straal;

		g.setColor(bubble.getKleur());
		g.drawOval(x, y, straal*2, straal*2);
		g.fillOval(x, y, straal*2, straal*2);
		
	
		
	}

	@Override
	public void update(Observable o, Object arg) {
		repaint();	
	}

}
