package week1_boomshine;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

public class BubbleView extends JPanel implements Observer{
	private Bubble bubble;
	
	public BubbleView(Bubble bubble) {
		this.bubble = bubble;
		bubble.addObserver(this);
		this.setOpaque(false);
		
		
		
		
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		int mx = bubble.getMiddelpunt().x;
		int my = bubble.getMiddelpunt().y;
		int x = mx - (bubble.getStraal() / 2);
		int y = my + (bubble.getStraal() / 2);
		g.drawOval(x, y, bubble.getStraal(), bubble.getStraal());
	}

	@Override
	public void update(Observable o, Object arg) {
		repaint();
		
	}

}
